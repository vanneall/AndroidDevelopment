package com.example.task9;

public class Coffee {

    private String name;
    private String info;
    private int pictureId;

    public Coffee(String name, String info, int id) {
        this.name = name;
        this.info = info;
        this.pictureId = id;
    }

    public Coffee(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getPictureId() {
        return pictureId;
    }

    @Override
    public String toString() {
        return name;
    }
}
