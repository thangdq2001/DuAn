package com.example.duan1.Admin.Model;

public class User {
    private String username;
    private String password;
    private String idUSer;

    public User(String username, String password, String idUSer) {
        this.username = username;
        this.password = password;
        this.idUSer = idUSer;
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

    public String getIdUSer() {
        return idUSer;
    }

    public void setIdUSer(String idUSer) {
        this.idUSer = idUSer;
    }

    public User(){

    }

}
