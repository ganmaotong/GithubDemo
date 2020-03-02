package com.gitlab.example.demo.user;

import com.gitlab.example.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Title: UserControllerTest$
 * Description: TODO
 *
 * @version V1.0
 * @author: yetong
 * @since: 2020/2/24$ 21:21$
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={DemoApplication.class})// 指定启动类
public class UserControllerTest {

    @Test
    public void testUserList() {
        System.out.println("执行了UserList测试");
    }

    @Test
    public void testUserGetById() {
        System.out.println("执行了UserGetById测试");
    }
}
