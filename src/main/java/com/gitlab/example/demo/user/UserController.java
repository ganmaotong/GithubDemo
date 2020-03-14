package com.gitlab.example.demo.user;

import com.gitlab.example.demo.user.entity.User;
import com.gitlab.example.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Title: UserController$
 * Description: 用户服务
 *
 * @version V1.0
 * @author: yetong
 * @since: 2020/2/24$ 21:19$
 */
@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("list")
    public String list() {
        List<User> list = userService.listUser();
        System.out.println(list.get(0).getUserName());
        return "2.4-SNAPSHOT版本，返回用户列表";
    }

    @RequestMapping("One")
    public String getById(String id) {
        return "返回单个用户请求5，用户id为 " + id;
    }
}
