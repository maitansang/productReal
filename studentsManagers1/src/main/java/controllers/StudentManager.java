package controllers;
import model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sevice.StudentSevice;
import sevice.StudentSeviceImpl;

import java.util.List;

@Controller
public class StudentManager {

    private StudentSevice studentSevice= new StudentSeviceImpl();
    @RequestMapping (value = "/students",method = RequestMethod.GET)
    public String list (Model model){
        List<Student> students= this.studentSevice.listStudent();
        model.addAttribute("students",students);
        return "list";
    }
//    @RequestMapping (value ="/createStudent",method = RequestMethod.GET)
//    public String doCreate(@ModelAttribute(Model model, Student)){
//
//    }
}
