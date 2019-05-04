package com.jpa.service;

import com.jpa.model.MyBlog;

import java.util.List;

public interface BlogService {
    List<MyBlog> findAll();
    MyBlog findById(Long id);
    void save (MyBlog myBlog);
    void remove(Long id);
}
