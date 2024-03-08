package com.sts.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class college {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int collegeId;
    private String collegeName;
    private String collegeCity;

    @OneToOne(mappedBy = "clg")
    @JsonBackReference
    private Test test;  

    public college() {
    }
    public college(int collegeId, String collegeName, String collegeCity) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.collegeCity = collegeCity;
    }
    public int getCollegeId() {
        return collegeId;
    }
    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public String getCollegeCity() {
        return collegeCity;
    }
    public void setCollegeCity(String collegeCity) {
        this.collegeCity = collegeCity;
    }
    public Test getTest() {
        return test;
    }
    public void setTest(Test test) {
        this.test = test;
    }
    @Override
    public String toString() {
        return "college [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeCity=" + collegeCity
                + "]";
    }

    
}
