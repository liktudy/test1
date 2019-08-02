package com.tedu.sp001.service;

import com.tedu.sp001.pojo.User;

public interface UserService {
    
    User getUser(Integer id);
    void addScore(Integer id, Integer score);

}
