package Presentation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String DRIVER = "com.mysql.cj.jdbc"; // ← dùng driver mới
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc"; // ← thêm tên database
    private static final String USER = "root";
    private static final String PASS = "1234";

    public static Connection openConnection() {
        Connection conn;
        try {
            Class.forName(DRIVER);
            conn = ConnectionDB.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("❌ Không thể kết nối tới database", e);
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("✅ Đã đóng kết nối.");
            } catch (SQLException e) {
                throw new RuntimeException("❌ Lỗi khi đóng kết nối", e);
            }
        }
    }
}