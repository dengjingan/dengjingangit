package com.bdqn.dao;

import com.bdqn.pojo.Student;

import java.util.Map;

public interface StudentMapper {
    public int Count();

    public String GetName();

    public Student getStuById(Map<String,Object> map);
}
