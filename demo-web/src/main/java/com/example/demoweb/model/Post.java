package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    private long id;

    public Post(long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
