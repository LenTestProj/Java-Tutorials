package com.example;

import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

public class Laptop_Many_To_Many {
     @Id
    private int id;
    private String brand;
    private String model;
    private int ram;

    @ManyToMany(mappedBy = "laptops")
    private List<Alien> aliens;

    @Override
    public String toString() {
        return "Laptop [id=" + id + ", brand=" + brand + ", model=" + model + ", ram=" + ram + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public List<Alien> getAliens() {
        return aliens;
    }
    public void setAliens(List<Alien> aliens) {
        this.aliens = aliens;
    }
}
