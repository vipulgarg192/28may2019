package com.lambton.hardware;

public class Computer {

    private int id;
    private String manufactureName;

    public Computer() {
    }

    public Computer(int id, String manufacturerName) {
        this.id = id;
        this.manufactureName = manufacturerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }
}
