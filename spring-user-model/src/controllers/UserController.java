package controllers;

import model.Login;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.portlet.ModelAndView;

public class UserController {
    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home","login", new Login());
        return modelAndView;
    }
}
