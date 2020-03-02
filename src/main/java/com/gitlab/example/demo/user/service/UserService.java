package com.gitlab.example.demo.user.service;

import com.gitlab.example.demo.user.entity.User;

import java.util.List;

/**
 * Title: UserService$
 * Description: TODO
 *
 * @version V1.0
 * @author: yetong
 * @since: 2020/2/27$ 11:22$
 */
public interface UserService {

    List<User> listUser();

    User getListById(Long id);
}
