package com.sts.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.sts.entities.Test;

@Component
public class TestServices {

    private static List<Test> list=new ArrayList<>();
    static{

        // list.add(new Test(12,"Anurag","XYZ"));
        // list.add(new Test(13,"Devanshi","ABC"));
        // list.add(new Test(14,"Aishani","JKL"));
        // list.add(new Test(15,"Mansi","FHKJ"));
    }

    public List<Test> getAllTest(){
        return list;
    }

    public Test getTestById(int id){
        Test test=null;
        test=list.stream().filter(e->e.getId()==id).findFirst().get();
        return test;
    }

    public Test addTest(Test t){
        list.add(t);
        return t;
    }

    public void deleteTest(int id){
        list=list.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
    }

    public void  updateTest(Test t,int id){
        list=list.stream().map(e->{
            if(e.getId()==id){
                e.setName(t.getName());
                e.setClg(t.getClg());
            }
            return e;
        }).collect(Collectors.toList());
    }
}
