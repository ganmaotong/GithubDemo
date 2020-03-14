package com.gitlab.example.demo;

import com.gitlab.example.demo.user.entity.Data;
import com.gitlab.example.demo.user.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.SimpleFormatter;

/**
 * Title: DemoController$
 * Description: TODO
 *
 * @version V1.0
 * @author: yetong
 * @since: 2019/11/24$ 14:35$
 */
@RequestMapping("demo")
@RestController
public class DemoController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello, Spring Boot Demo!";
    }

    @RequestMapping("getUser")
    public User getUser() {
        User user = new User();
        user.setCount(0);
        user.setUserName("yetong");
        List<Data> list = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            Data item = new Data();
            item.setRev(new Random().nextInt(100));
            item.setSend(new Random().nextInt(200));
            item.setDateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            list.add(item);
        }
        user.setDataList(list);
        return user;
    }
}
