package com.tutorials.lab2_7;

public class Employee {
    private String id;
    private String name;
    private boolean isManager;

    public String getID() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return name;
    }

    public void setFullName(String name) {
        this.name = name;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean isManager) {
        this.isManager = isManager;
    }

    @Override
    public String toString() {
        return this.id + "-" + this.name;
    }
}
