package com.jpa.model;

import javax.persistence.*;

@Entity
@Table(name="sang")
public class MyBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String name;
    private Long id;
    private String content;

    public MyBlog(){}
    public MyBlog( String name, String content) {

        this.content = content;
        this.name=name;
    }

    @Override
    public String toString() {
        return String.format("Blog[id=%d, name='%s', content='%s']",id, name, content);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
