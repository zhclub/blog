package com.zh.blogspot.core.bean;

import java.util.Date;

public class Blog {
    private Integer id;

    private String title;

    private String category;

    private String content;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getId() {
        return id;
    }

    public Blog setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Blog setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Blog setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Blog setContent(String content) {
        this.content = content;
        return this;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public Blog setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public Blog setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
}