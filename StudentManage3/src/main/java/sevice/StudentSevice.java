package sevice;

import model.Student;

import java.util.List;

public interface StudentSevice {
    List<Student> listStudent();
    void create(Student student);
    void update(int id, Student student);
    Student  findByID(int id);
    void remove(int id);
    void save(Student student);
}
