package com.obs.entities.core;

import javax.persistence.*;

/**
 * Created by Ramazan Karagoz on 8.06.2017.
 */
@Entity
@Table(name = "USER")
public class User extends BaseEntity{

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ENABLED")
    private Integer enabled;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    private Role role;


    public User() {
    }

    public User(String username, String password, Integer enabled, Role role) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
