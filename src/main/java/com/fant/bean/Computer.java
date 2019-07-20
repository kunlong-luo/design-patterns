package com.fant.bean;

public abstract class Computer {

    private String id;

    private String name;

    private String type;

    private int size;

    public Computer(String id, String name, String type, int size) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
