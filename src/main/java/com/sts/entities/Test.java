package com.sts.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Tests")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="test_id")
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private college clg;

    public Test(int id, String name, college clg) {
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
    public college getClg() {
        return clg;
    }
    public void setClg(college clg) {
        this.clg = clg;
    }
    @Override
    public String toString() {
        return "Test [id=" + id + ", name=" + name + ", clg=" + clg + "]";
    }
    
}
