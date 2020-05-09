package com.example.web.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@Data
//读取配置文件
@ConfigurationProperties(prefix = "person")
@PropertySource(value={"classpath:person.yml"})
//数据校验
@Validated
public class Person {
//    @Value("${person.lastName}")
    private String lastName;
    @Value("#{11*9}")
    private Integer age;
//    @Value("true")
    private boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}
