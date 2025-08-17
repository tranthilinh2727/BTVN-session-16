package Business.Down;

import Business.Model.Student;
import Presentation.ConnectionDB;

import java.sql.Connection;
import java.util.List;

public class StudentDownImplement implements Istudentdown {

    @Override
    public List<Student> getAllStudent() {
        //đi mở kết nối
        Connection conn= ConnectionDB.getconnection();
    }

    @Override
    public Student findStudentById(Integer id) {
        return null;
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void editStudent(Student student) {

    }

    @Override
    public void deleteStudent(String id) {

    }
}
