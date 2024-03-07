package com.sts.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.sts.dao.TestRepository;
import com.sts.entities.Test;

@Component
public class TestServices {

    @Autowired
    private TestRepository testRepository;

    // private static List<Test> list=new ArrayList<>();
    // static{

    //     // list.add(new Test(12,"Anurag","XYZ"));
    //     // list.add(new Test(13,"Devanshi","ABC"));
    //     // list.add(new Test(14,"Aishani","JKL"));
    //     // list.add(new Test(15,"Mansi","FHKJ"));
    // }

    public List<Test> getAllTest(){
        return (List<Test>)testRepository.findAll();
    }

    public Test getTestById(int id){
        Test test=null;
        try{
            test=testRepository.findById(id);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return test;
    }

    public Test addTest(Test test){
        return testRepository.save(test);
    }

    public Boolean deleteTest(int id){
        Test test_id=testRepository.findById(id);
        if(test_id==null){
            return false;
        }
        else{
            testRepository.deleteById(id);
            return true;
        }
    }

    public Test updateTest(Test test,int id){
        test.setId(id);
        return testRepository.save(test);
    }
}
