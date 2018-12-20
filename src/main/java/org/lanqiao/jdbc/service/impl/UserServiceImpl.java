package org.lanqiao.jdbc.service.impl;

import org.lanqiao.jdbc.dao.IUserDao;
import org.lanqiao.jdbc.pojo.User;
import org.lanqiao.jdbc.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {
    IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void remove(int id) {
        userDao.deleteUserById(id);
    }

    @Override
    public void modify(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
