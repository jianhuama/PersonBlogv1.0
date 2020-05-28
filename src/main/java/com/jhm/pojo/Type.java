package com.jhm.pojo;

import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Type implements Serializable {
    private long id;
    private String name;

    //实体与实体类之间的关系
    @OneToMany(mappedBy = "type")//作为被关系维护端
    private List<Blog> blogs=new ArrayList<>();



    public Type(){}
    //有参构造
    public Type(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
