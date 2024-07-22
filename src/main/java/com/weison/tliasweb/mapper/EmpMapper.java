package com.weison.tliasweb.mapper;

import com.weison.tliasweb.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {

    @Select("select count(*) from dept")
    public Long count();

    @Select("select * from dept limit #{start},#{pageSize}")
    public List<Emp> page(@Param("start") Integer start,@Param("pageSize") Integer pageSize);
}
