package com.gitlab.example.demo.user.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

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

    private String createTime;

    private Integer count;

    private List<Data> dataList;

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

    public String getCreateTime() {
        createTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }
}
