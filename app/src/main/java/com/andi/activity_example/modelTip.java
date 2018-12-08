package com.andi.activity_example;

public class modelTip {

    String name;
    String target;
    String user;
    String text;

    public modelTip() {
    }

    public modelTip(String name, String target, String user, String text) {
        this.name = name;
        this.target = target;
        this.user = user;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.name + " " + this.user;
    }
}
