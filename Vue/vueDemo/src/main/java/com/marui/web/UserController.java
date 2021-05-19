package com.marui.web;

import com.marui.domain.User;
import com.marui.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author MaRui
 * @date 2021-05-19 22:49
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll.do")
    public @ResponseBody List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/findById.do")
    public @ResponseBody User findById(Integer id) {
        return userService.findById(id);
    }

    @RequestMapping("/updateUser.do")
    public @ResponseBody void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }
}
