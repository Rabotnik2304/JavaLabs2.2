package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;
    public Post(){

    }
    public Post(final Long id, final String text, final Date date){
        this.id=id;
        this.creationDate=date;
        this.text = text;
        likes=0;
    }
    public Long getId(){return id;}
    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
    public Date getCreationDate(){return creationDate;}
    public void setLikes(Integer newLikes){
        likes=newLikes;
    }
}
