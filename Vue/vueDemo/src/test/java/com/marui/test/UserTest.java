package com.marui.test;

import com.marui.domain.User;
import com.marui.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 用户的测试类
 * @author MaRui
 * @date 2021-05-19 22:41
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll() {
        List<User> list = userService.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindById() {
        User user = userService.findById(1);
        System.out.println(user);
    }

    @Test
    public void testUpdateUser() {
        User user = userService.findById(2);
        user.setUsername("张三");
        user.setId(1);
        userService.updateUser(user);
    }
}
