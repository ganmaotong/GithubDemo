package com.gitlab.example.demo.user.service.impl;

import com.gitlab.example.demo.user.entity.User;
import com.gitlab.example.demo.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Title: UserServiceImpl$
 * Description: TODO
 *
 * @version V1.0
 * @author: yetong
 * @since: 2020/2/27$ 11:34$
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> listUser() {
        User user1 = new User();
        user1.setUserId(new Random().nextLong());
        user1.setUserName("user1");
        user1.setPassword("password1");
        User user2 = new User();
        user2.setUserId(new Random().nextLong());
        user2.setUserName("user2");
        user2.setPassword("password2");
        List list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        System.out.println("2.1-SNAPSHOT版本，返回用户列表");
        return list;
    }

    @Override
    public User getListById(Long id) {
        User user1 = new User();
        user1.setUserId(id);
        user1.setUserName("user1");
        user1.setPassword("password1");
        return user1;
    }
}
