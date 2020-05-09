package com.example.web.mapper;

import com.example.web.entity.NameEmp;
import lombok.Data;
import org.apache.ibatis.annotations.*;


//@Mapper
public interface NameMapper {
    @Select("select * from table1 where id=#{id}")
    public NameEmp getName(Integer id);

    @Delete("delect from table1 where id=#{id}")
    public int deleteName(Integer id);

//    @Options(useGeneratedKeys = true,keyProperty = "id")自动返回主键
    @Insert("insert into table1(id,person_name) values(#{id},#{personName})")
    public int insertName(NameEmp nameEmp);

    @Update("update table1 set person_name=#{personName} where id=#{id}")
    public int updateName(NameEmp nameEmp);
}
