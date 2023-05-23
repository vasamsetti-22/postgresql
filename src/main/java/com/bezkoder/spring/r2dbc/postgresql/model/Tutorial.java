package com.bezkoder.spring.r2dbc.postgresql.model;

import org.springframework.data.annotation.Id;

public class Tutorial {

    @Id
    private int id;

    private String title;
    private String description;

    private boolean published;

    public Tutorial() {

    }

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

// getters and setters

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }

//    public void setId(int id) {
//    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
    }
}
