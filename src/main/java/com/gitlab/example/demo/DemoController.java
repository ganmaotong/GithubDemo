package com.gitlab.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
