package com.bdqn.test;

import com.bdqn.dao.StudentMapper;
import com.bdqn.dao.UserMapper;
import com.bdqn.pojo.Student;
import com.bdqn.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class DemoTest {
    Logger logger = Logger.getLogger(DemoTest.class);
    @Test
    public void show(){
        try {
            InputStream is = Resources.getResourceAsStream("configuration.xml");
            SqlSessionFactory fa = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = fa.openSession();
            /*sqlSession.selectOne("");*/
            /*int o = sqlSession.getMapper(StudentMapper.class).Count();
            System.out.println(o);
            String s = sqlSession.getMapper(StudentMapper.class).GetName();
            System.out.println(s);*/
            Student stu = new Student();
            stu.setSid(2);
            stu.setSname("李四");
            HashMap<String, Object> map = new HashMap<>();
            map.put("sid",2);
            map.put("sname","李四");
            map.put("stu",stu);
            Student stuById = sqlSession.getMapper(StudentMapper.class).getStuById(map);
            System.out.println(stuById.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getUser(){
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("configuration.xml");
            SqlSessionFactory fa = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = fa.openSession();
            User userById = sqlSession.getMapper(UserMapper.class).getUserById(1);
            System.out.println(userById.toString());
            logger.debug("这是记录的日志");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
