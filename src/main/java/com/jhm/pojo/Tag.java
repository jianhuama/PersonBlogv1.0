package com.jhm.pojo;

import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Tag implements Serializable {
    private long id;
    private  String  titlename;

    //实体与实体类之间的关系
    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs=new ArrayList<>();

    public Tag() { }
    //有参构造
    public Tag(long id, String titlename) {
        this.id = id;
        this.titlename = titlename;
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

    public String getTitlename() {
        return titlename;
    }

    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", titlename='" + titlename + '\'' +
                '}';
    }
}
