package com.sts.dao;

import org.springframework.data.repository.CrudRepository;
import com.sts.entities.Test;


public interface TestRepository extends CrudRepository<Test, Integer> {
    public Test findById(int id);
}
