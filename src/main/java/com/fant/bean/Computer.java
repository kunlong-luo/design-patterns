package com.fant.bean;

import com.fant.enums.ComputerBrandEnum;
import com.fant.enums.ComputerTypeEnum;

import java.util.Objects;

public class Computer {

    private String id;

    private String name;

    private String type;

    private String brand;

    private int size;

    public Computer() {
    }

    public Computer(String id, String name, String type, String brand, int size) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.size = size;
    }

    public boolean match(ComputerBrandEnum brand, ComputerTypeEnum type) {
        return Objects.equals(this.brand, brand.name().toLowerCase()) &&
                Objects.equals(this.type, type.name().toLowerCase());
    }

    public boolean match(ComputerBrandEnum brand) {
        return Objects.equals(this.brand, brand.name().toLowerCase());
    }

    public boolean match(ComputerTypeEnum type) {
        return Objects.equals(this.type, type.name().toLowerCase());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
