package controllers;
import model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sevice.StudentSevice;
import sevice.StudentSeviceImpl;

import java.util.List;
import java.util.Locale;

@Controller
public class StudentManager {

    private StudentSevice studentService = new StudentSeviceImpl();
    @GetMapping("/students")
//    public String Show(Model model){
//        List<Student> students = this.studentService.listStudent();
//        model.addAttribute("students",students);
//        return "list";
//    }
    private ModelAndView Show(){
        List<Student> students= studentService.listStudent();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("students",students);
        return modelAndView;
    }
    @RequestMapping(value = "/createStudent",method = RequestMethod.GET)
    public String createStudent(Model model){
        model.addAttribute("student",new Student());
        return "create";
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String doCreateStudent(@ModelAttribute(value = "student")Student student, Model model){
        Student student1 = new Student(student.getId(),student.getName(),student.getAge(),student.getAddress(),student.isSex(),student.getClassmate());
        model.addAttribute("student",student1);
        studentService.create(student1);
        List<Student> students = this.studentService.listStudent();
        model.addAttribute("students",students);
        return "list";
    }
    @RequestMapping (value = "/searchStudent", method = RequestMethod.POST)
    public String searchStudent(@RequestParam String id, Model model){
     int ID= Integer.parseInt(id);
     Student student= studentService.findByID(ID);//??
        if (student == null){
            return "list";
        }else{
            model.addAttribute("student", student);
            return "view";
        }
    }
    @RequestMapping(value = "/editStudent",method = RequestMethod.POST)
    public String doEditStudent(@ModelAttribute @Validated Student student, Model model){
        studentService.update(student.getId(),student);
        model.addAttribute("students",this.studentService.listStudent());
        return "list";
    }
    @RequestMapping("/edit")
    public String showEdit(@RequestParam int id,Model model) {
        Student student = studentService.findByID(id);
        model.addAttribute("student",student);
        return  "edit";
    }
    @RequestMapping("/delete")
    public String showDelete(@RequestParam int id, Model model){
        Student student =studentService.findByID(id);
        model.addAttribute("student",student);
        return "delete";
    }
    @RequestMapping(value = "/deleteStudent",method = RequestMethod.POST)
    public String doDelete(@ModelAttribute @Validated Student student,Model model){
        this.studentService.remove(student.getId());
        model.addAttribute("students",this.studentService.listStudent());
        return "list";
    }
    @RequestMapping("/view")
    private ModelAndView view (@RequestParam int id){//id?

        Student student=studentService.findByID(id);

        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("student",student);
        return modelAndView;
    }

}
