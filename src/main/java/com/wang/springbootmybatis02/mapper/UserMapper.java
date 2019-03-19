package com.wang.springbootmybatis02.mapper;

import com.wang.springbootmybatis02.resposity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select *from user")
    @Results(id = "wgs",value = {
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "userSex", column = "user_sex")
    })
    List<User> getAll();
    @Select("select *from user where id = #{id}")

    User getOne(Long id);
    @Insert("insert into user(userName,password,user_sex,nick_name)" +
            "values (#{userName},#{password},#{userSex},#{nickName})")
    void insert(User user);
    @Update("<script>" +
            "update user\n" +
            "set\n" +
            "<if test=\"userName !=null\">userName = #{userName},</if>\n" +
            "<if test=\"password !=null\">password = #{password},</if>\n" +
            "user_sex = #{userSex},\n" +
            "nick_name = #{nickName}\n" +
            "where id = #{id}" +
            "</script>")
    void update(User user);
    @Delete("delete from user where id = #{id}")
    void delete(Long id);


    @Select("SELECT * FROM user WHERE user_sex = #{user_sex}")
    List<User> getListByUserSex(@Param("user_sex") String userSex);
}
