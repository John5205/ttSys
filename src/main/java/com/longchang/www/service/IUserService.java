package com.longchang.www.service;

import com.longchang.www.entity.User;

public interface IUserService {

    public User checkName(String username, String password);
}
