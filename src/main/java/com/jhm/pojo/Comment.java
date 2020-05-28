package com.jhm.pojo;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*create by 2019*/


public class Comment implements Serializable {
    private long id;
    private String nickname;
    private String email;
    private String  avatar;
    private String content;
    private Date createtime;

    //实体类之间的关系
    @ManyToOne
    private Blog blogs;

    //评论自关联
    @OneToMany(mappedBy ="parentcomments")
    private List<Comment> replycomments=new ArrayList<>();
    @ManyToOne
    private Comment parentcomments;

    public Comment() {
    }

    public Comment(long id, String nickname, String email, String avatar, String content, Date createtime) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.avatar = avatar;
        this.content = content;
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", content='" + content + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
