package org.lanqiao.jdbc.dao;

import org.lanqiao.jdbc.pojo.User;

import java.util.List;

public interface IUserDao {
    public void insertUser(User user);
    public void deleteUserById(int id);
    public void updateUser(User user);
    public User selectUserById(int id);
    public List<User> selectAll();
}
