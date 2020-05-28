package com.example.web.repository;

import com.example.web.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//第一个泛型是操作的实体类，第二个泛型传主键的类型
public interface UserRepository extends JpaRepository<User,Integer> {

}
