package com.obs.entities.core;

/**
 * Created by Ramazan Karagoz on 9.06.2017.
 */
public class UserModel {

    private String login;
    private String pwd;
    private String pwdConfirm;

    public void reset() {
        this.login = null;
        this.pwd = null;
        this.pwdConfirm = null;
    }

    public UserModel() {
    }

    public UserModel(String login, String pwd, String pwdConfirm) {
        this.login = login;
        this.pwd = pwd;
        this.pwdConfirm = pwdConfirm;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwdConfirm() {
        return pwdConfirm;
    }

    public void setPwdConfirm(String pwdConfirm) {
        this.pwdConfirm = pwdConfirm;
    }
}
