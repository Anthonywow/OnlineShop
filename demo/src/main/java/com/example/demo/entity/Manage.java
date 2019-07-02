package com.example.demo.entity;

public class Manage {
    private Integer id;

    private String title;

    private Integer idIntroduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getIdIntroduction() {
        return idIntroduction;
    }

    public void setIdIntroduction(Integer idIntroduction) {
        this.idIntroduction = idIntroduction;
    }
}