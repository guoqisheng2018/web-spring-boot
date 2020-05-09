package com.example.web;

import com.example.web.entity.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


//@RunWith(SpringRunner.class)
@SpringBootTest
class WebSpringBootApplicationTests {


//    @Autowired
//    Person person;
//    @Test
//    public void contextLoads() {
//        System.out.println(person);
//    }

    @Autowired
    DataSource dataSource;
    @Test
    public void test() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}
