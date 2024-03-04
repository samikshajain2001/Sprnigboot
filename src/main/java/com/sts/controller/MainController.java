package com.sts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.entities.Test;
import com.sts.services.TestServices;

@RestController
public class MainController {

    @Autowired
    private TestServices testServices;

    @GetMapping(value="/test")
    public ResponseEntity<List<Test>> getTests(){
        List<Test> list=testServices.getAllTest();
        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    @GetMapping(value="/test/{id}")
    public Test getTest(@PathVariable("id") int id){
        return testServices.getTestById(id);
    }

    @PostMapping(value="/test")
    public Test addTest(@RequestBody Test test){
        Test t=this.testServices.addTest(test);
        return t;
    }

    @DeleteMapping(value="/test/{id}")
    public void deleteTest(@PathVariable("id") int id){
        this.testServices.deleteTest(id);
    }

    @PutMapping(value="/test/{id}")
    public Test updateTest(@RequestBody Test t,@PathVariable("id") int id){
        this.testServices.updateTest(t,id);
        return t;
    }
}
