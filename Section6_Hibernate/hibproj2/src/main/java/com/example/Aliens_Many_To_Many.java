package com.example;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Id;

public class Aliens_Many_To_Many {
    @Id
    private int aid;

    // @Column(name="alien_name")
    private String aname;
    private String tech;

    @ManyToAny  //foreign key //alien is the name in laptop table foreign key
    private List<Laptop> laptops;

    public int getAid() {
        return aid;
    }
  
    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }

     @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + ", laptops=" + laptops + "]";
    }
}
