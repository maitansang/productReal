package com.jpa.controller;

import com.jpa.model.MyBlog;
import com.jpa.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;
@Controller
public class BlogController {
    @Autowired
private BlogService blogService ;
    @GetMapping("/create-blog")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog", new MyBlog());
        return modelAndView;
    }
    @GetMapping("/blogs")
    public ModelAndView listBlogs(){
        List<MyBlog> blogs = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }
//    @GetMapping("/edit-blog/{id}")
//    public ModelAndView showEditForm(@PathVariable Long id){
//        MyBlog blog = blogService.findById(id);
//        if(blog != null) {
//            ModelAndView modelAndView = new ModelAndView("/edit");
//            modelAndView.addObject("blog", blog);
//            return modelAndView;
//
//        }else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }
//
//    @PostMapping("/edit-blog")
//    public ModelAndView updateCustomer(@ModelAttribute("com/jpa") MyBlog blog){
//        blogService.save(blog);
//        ModelAndView modelAndView = new ModelAndView("/edit");
//        modelAndView.addObject("blog", blog);
//        modelAndView.addObject("message", "Blog updated successfully");
//        return modelAndView;
//    }
//    @GetMapping("/delete-blog/{id}")
//    public ModelAndView showDeleteForm(@PathVariable Long id){
//        MyBlog blog = blogService.findById(id);
//        if(blog != null) {
//            ModelAndView modelAndView = new ModelAndView("/delete");
//            modelAndView.addObject("blog", blog);
//            return modelAndView;
//
//        }else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }
//
//    @PostMapping("/delete-blog")
//    public String deleteCustomer(@ModelAttribute("blog") MyBlog blog){
//        blogService.remove(blog.getId());
//        return "redirect:blogs";
//    }

    @PostMapping("/create-blog")
    public ModelAndView saveBlog(@ModelAttribute("blogg") MyBlog blogg){
        blogService.save(blogg);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blogg", new MyBlog());
        modelAndView.addObject("message", "New blog created successfully");
        return modelAndView;
    }
}
