package com.sts.entities;

public class Test {
    private int id;
    private String name;
    private String clg;
    public Test(int id, String name, String clg) {
        this.id = id;
        this.name = name;
        this.clg = clg;
    }
    public Test() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClg() {
        return clg;
    }
    public void setClg(String clg) {
        this.clg = clg;
    }
    @Override
    public String toString() {
        return "Test [id=" + id + ", name=" + name + ", clg=" + clg + "]";
    }
    
}
