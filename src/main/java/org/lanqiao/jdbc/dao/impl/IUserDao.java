package org.lanqiao.jdbc.dao.impl;

import org.lanqiao.jdbc.pojo.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class IUserDao extends JdbcDaoSupport implements org.lanqiao.jdbc.dao.IUserDao {
    @Override
    public void insertUser(User user) {
        String sql = "insert into user1 (username,age,gender,email) values (?,?,?,?)";
        this.getJdbcTemplate().update(sql,user.getUsername(),user.getAge(),user.getGender(),user.getEmail());
    }

    @Override
    public void deleteUserById(int id) {
        String sql = "delete from user1 where id = ?";
        this.getJdbcTemplate().update(sql,id);
    }

    @Override
    public void updateUser(User user) {
    String sql = "update user1 set username = ?,age = ?,gender = ?,email = ? where  id = ?";
    this.getJdbcTemplate().update(sql,user.getUsername(),user.getAge(),user.getGender(),user.getEmail(),user.getId());
    }

    @Override
    public User selectUserById(int id) {
        return null;
    }

    @Override
    public List<User> selectAll() {
        return null;
    }
}
