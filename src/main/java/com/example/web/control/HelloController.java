package com.example.web.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello World";
    }


    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好<h1>");
        map.put("users", Arrays.asList("a","b","c"));
        return "success";
    }

//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @ResponseBody
//    @GetMapping("/quary")
//    public Map<String,Object> map(){
//        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from abcd");
//        return list.get(0);
//    }
}
