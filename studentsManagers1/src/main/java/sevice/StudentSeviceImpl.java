package sevice;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentSeviceImpl implements  StudentSevice {
    private static Map<Integer, Student> students;
    static {
        students = new HashMap<>();
        students.put(1,new Student(1,"Mai Tan Sang",19,"54 Doi Cung",true,"17T3"));
        students.put(2,new Student(1,"Mai Thi Tan Teo",1,"54 Doi Cung",false,"17KB3"));
        students.put(3,new Student(1,"Mai Tan Son",56,"54 Doi Cung",true,"Nghi hoc"));
        students.put(4,new Student(1,"Mai Tan Hung",95,"54 Doi Cung",true,"Ve huu"));
    }
    @Override
    public List<Student> listStudent() {
        return new ArrayList<>(students.values());
    }

    @Override
    public void create(Student product) {
        students.put(product.getId(),product);
    }

    @Override
    public void update(int id, Student student) {
        students.put(id,student);
    }

    @Override
    public Student findByID(int id) {
        return students.get(id);
    }

    @Override
    public void remove(int id) {
        students.remove(id);
    }

    @Override
    public void save(Student student) {

    }
}
