package com.marui.service.impl;

import com.marui.dao.IUserDao;
import com.marui.domain.User;
import com.marui.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author MaRui
 * @date 2021-05-19 22:33
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    /**
     * 查询所有用户信息
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    /**
     * 根据id查询用户
     *
     * @return
     */
    @Override
    public User findById(Integer userId) {
        return userDao.findById(userId);
    }

    /**
     * 修改用户信息
     *
     * @param user
     */
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
