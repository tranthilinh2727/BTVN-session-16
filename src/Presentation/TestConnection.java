package Presentation;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection conn = ConnectionDB.openConnection();
        System.out.println("✅ Kết nối thành công!");
        ConnectionDB.closeConnection(conn);
    }
}
