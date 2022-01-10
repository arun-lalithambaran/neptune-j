package com.neptune.afo;

import java.util.concurrent.atomic.AtomicLong;

public class Todo {
    private String title;
    private String description;
    private final Long id;
    public Todo(String title, String description, Long id) {
        this.title = title;
        this.description = description;
        AtomicLong atomicLong = new AtomicLong();
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }
}
