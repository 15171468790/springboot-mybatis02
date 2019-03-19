package com.wang.springbootmybatis02;

import com.wang.springbootmybatis02.mapper.UserMapper;
import com.wang.springbootmybatis02.resposity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testDelete(){
        userMapper.delete(1l);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setUserSex("男生");
        userMapper.insert(user);
    }

    @Test
    public void testQuery(){
        User user = new User();
        user.setUserSex("男生");

        System.out.println( userMapper.getListByUserSex("男生").toString());
    }

    @Test
    public void testupdate(){
        User user = new User();
        user.setId(5l);
        user.setUserSex("男生");
        userMapper.update(user);
    }

    @Test
    public void testgetone(){
        User user = new User();
        user.setId(5l);
        System.out.println(userMapper.getAll().toString());
    }
}
