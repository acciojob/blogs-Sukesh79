package com.driver.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import  java.util.*;
@Entity
@Table(name = "blog")
public class Blog{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;

    @Column(name = "date")
    @CreationTimestamp
    private String date;

    @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL)
    List<Image> imageList = new ArrayList<>();

    @ManyToOne
    @JoinColumn
    User user;

    public Blog(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}