package com.srcb.fundfetch.entity;

/**
 * @Title:
 * @Author: FFYzz
 * @Mail: cryptochen95 at gmail dot com
 * @Date: 2020/8/6
 */
public class User {
    /**
     * user id
     * auto increament
     */
    private Integer id;
    /**
     * username
     */
    private String name;
    /**
     * user register email
     */
    private String email;
    /**
     * user password
     */
    private String password;
    /**
     * user register status
     * verified or not verified
     */
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
