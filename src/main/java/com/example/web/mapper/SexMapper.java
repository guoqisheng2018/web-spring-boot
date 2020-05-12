package com.example.web.mapper;

import com.example.web.entity.SexEmp;

public interface SexMapper {

    public SexEmp getEmpById(Integer id);

    public void insertEmp(SexEmp emp);
}
