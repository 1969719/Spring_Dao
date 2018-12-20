package org.lanqiao.jdbc.service;

import org.lanqiao.jdbc.pojo.User;

import java.util.List;

public interface IUserService {
    public void add(User user);
    public void remove(int id);
    public void modify(User user);
    public User getUser(int id);
    public List<User> getAll();
}
