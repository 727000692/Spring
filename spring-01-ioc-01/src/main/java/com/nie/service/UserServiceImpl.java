package com.nie.service;

import com.nie.dao.UserDao;
import com.nie.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

//    private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;
    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();

    }
}
