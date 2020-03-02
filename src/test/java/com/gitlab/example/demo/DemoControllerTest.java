package com.gitlab.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Title: DemoControllerTest$
 * Description: TODO
 *
 * @version V1.0
 * @author: yetong
 * @since: 2020/2/23$ 11:55$
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={DemoApplication.class})// 指定启动类
public class DemoControllerTest {

    @Test
    public void testHello() throws Exception {
        DemoController controller = new DemoController();
        //搭建MOckMvc，通过参数指定一组控制器，这样就不需要从上下文获取了
        MockMvc mockMvc = standaloneSetup(controller).build();
        // 发起/demom/hello请求
        mockMvc.perform(MockMvcRequestBuilders.get("/demo/hello"))
                // 验证请求返回的字符串
                .andExpect(content().string("Hello, Spring Boot Demo!"));
    }
}
