package com.obs.web.core;

import com.obs.entities.core.UserModel;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;

/**
 * Created by Ramazan Karagoz on 9.06.2017.
 */


@ManagedBean
@RequestScoped
public class UserController implements Serializable{


    private String temp = "";

    private UserModel userModel=new UserModel();

    @ManagedProperty(value = "#{userManager}")
    private UserManager userManager;

    /*@PostConstruct
    private void init() {
        FacesContextUtils
                .getRequiredWebApplicationContext(FacesContext.getCurrentInstance())
                .getAutowireCapableBeanFactory().autowireBean(this);

    }*/

    public String register()
    {
        try {
            if (!userModel.getPwd().equals(userModel.getPwdConfirm())) {
                throw new Exception("Password do not match!");
            }
            userManager.setUser(userModel);
        }catch (Exception e)
        {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,"Registration Failure, "+e.getMessage(),"")
            );

            return null;
        }

        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Registration Success!", ""));
        userModel.reset();

        return "login";
    }


    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }
}
