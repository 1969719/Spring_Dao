package org.lanqiao.jdbc;

import org.lanqiao.jdbc.pojo.User;
import org.lanqiao.jdbc.service.IUserService;
import org.lanqiao.jdbc.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //JdbcTemplate template = applicationContext.getBean("myJdbcTemplate",JdbcTemplate.class);
       // System.out.println(template.getDataSource());
        User user = User.builder().id(3).username("琪琪1").gender("男").age(33).email("1627214433@qq.com").build();
        IUserService userService = applicationContext.getBean("userService", UserServiceImpl.class);
     //   userService.add(user);
     //   userService.remove(1);
        userService.modify(user);
    }
}
