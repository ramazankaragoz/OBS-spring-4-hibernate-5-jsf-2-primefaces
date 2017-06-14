package com.obs.dao.core;

import com.obs.entities.core.Role;
import com.obs.entities.core.User;
import com.obs.entities.core.UserModel;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ramazan Karagoz on 9.06.2017.
 */
@Repository
@Transactional
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addUser(UserModel userModel)
    {
        User user=new User();
        user.setUsername(userModel.getLogin());
        user.setPassword(userModel.getPwd());
        user.setEnabled(1);

        Role role= (Role) sessionFactory.getCurrentSession()
                .createQuery("from Role r where r.code = 'ROLE_USER'").uniqueResult();

        if (role==null)
        {
            role=new Role();
            role.setCode("ROLE_USER");
            role.setLabel("ROLE FOR SIMPLE ACCESS");
            sessionFactory.getCurrentSession().save(role);
        }

        user.setRole(role);
        sessionFactory.getCurrentSession().save(user);
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
