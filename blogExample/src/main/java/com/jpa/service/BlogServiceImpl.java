package com.jpa.service;

import com.jpa.model.MyBlog;
import com.jpa.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public List<MyBlog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public MyBlog findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(MyBlog myBlog) {
        blogRepository.save(myBlog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.remove(id);
    }


}
