package com.gitlab.example.demo.user.entity;

/**
 * Title: User$
 * Description: TODO
 *
 * @version V1.0
 * @author: yetong
 * @since: 2020/2/27$ 11:23$
 */
public class User {

    private Long userId;

    private String userName;

    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
