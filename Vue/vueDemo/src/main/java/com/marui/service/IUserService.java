package com.marui.service;

import com.marui.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户的业务层接口
 * @author MaRui
 * @date 2021-05-19 22:32
 */
public interface IUserService {
    /**
     * 查询所有用户信息
     * @return
     * @throws Exception
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 根据id查询用户
     * @return
     */
    @Select("select * from user where id=#{userId}")
    User findById(Integer userId);

    /**
     * 修改用户信息
     * @param user
     */
    @Update("update user set username=#{username},password=#{password},sex=#{sex},age=#{age},email=#{email} where id=#{id}")
    void updateUser(User user);
}
