package com.gitlab.example.demo.yetong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: RoleController$
 * Description: TODO
 *
 * @version V1.0
 * @author: yetong
 * @since: 2020/2/25$ 21:20$
 */
@RequestMapping("role")
@RestController
public class RoleController {

    @RequestMapping("list")
    public String list() {
        return "返回角色列表";
    }

    @RequestMapping("One")
    public String getById(String id) {
        return "返回单个请求，用户id为 " + id;
    }
}
