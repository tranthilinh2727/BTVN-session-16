package Business.Down;

import Business.Model.Student;

import java.util.List;

public interface Istudentdown {
    //phương thức lấy danh sách hsinh
    List<Student> getAllStudent();
    //PT trả về hsinh bằng id
    Student findStudentById(Integer id);
    //PT thêm sửa xóa
    void addStudent(Student student);
    void editStudent(Student student);
    void deleteStudent(String id);

}
