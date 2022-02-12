package com.haven.service;

import com.haven.dao.UserDao;
import com.haven.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userdao;

    //利用set进行动态实现值的注入
    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }

    @Override
    public void getUser() {
        userdao.getUser();
    }
}
