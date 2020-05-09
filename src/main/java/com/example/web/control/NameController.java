package com.example.web.control;

import com.example.web.entity.NameEmp;
import com.example.web.mapper.NameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @Autowired
    NameMapper nameMapper;

    @GetMapping("/name/{id}")
    public NameEmp getName(@PathVariable("id") Integer id){
        return nameMapper.getName(id);
    }

    @GetMapping("/name")
    public NameEmp insertName(NameEmp nameEmp){
         nameMapper.insertName(nameEmp);
        return nameEmp;
    }
}
