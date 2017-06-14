package com.obs.web.core;

import com.obs.dao.core.UserDao;
import com.obs.entities.core.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by Ramazan Karagoz on 9.06.2017.
 */
@Service
public class UserManager implements Serializable{

    @Autowired
    private UserDao userDao;

    public void setUser(UserModel userModel)
    {
        userDao.addUser(userModel);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }
}
