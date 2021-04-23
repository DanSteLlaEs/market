package com.daniel.market.domain;

public class Category {

    private int categoyId;

    private String category;

    private boolean active;

    public int getCategoyId() {
        return categoyId;
    }

    public void setCategoyId(int categoyId) {
        this.categoyId = categoyId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
