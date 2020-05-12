package com.example.web.control;

import com.example.web.entity.SexEmp;
import com.example.web.mapper.SexMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SexController {
    @Autowired
    SexMapper sexMapper;

    @GetMapping("/sex/{id}")
    public SexEmp getSexEmp(@PathVariable("id") Integer id){
       return sexMapper.getEmpById(id);
    }

    @GetMapping("/sex")
    public SexEmp insertSexEmp(SexEmp emp){
        sexMapper.insertEmp(emp);
        return emp;
    }
}
