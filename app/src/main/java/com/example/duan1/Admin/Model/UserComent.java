package com.example.duan1.Admin.Model;

public class UserComent {
    private String username;
    private String coment;
    private String idNhahang;
    private String idBinhLuan;

    public UserComent(){

    }

    public UserComent(String username, String coment, String idNhahang, String idBinhLuan) {
        this.username = username;
        this.coment = coment;
        this.idNhahang = idNhahang;
        this.idBinhLuan = idBinhLuan;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public String getIdNhahang() {
        return idNhahang;
    }

    public void setIdNhahang(String idNhahang) {
        this.idNhahang = idNhahang;
    }

    public String getIdBinhLuan() {
        return idBinhLuan;
    }

    public void setIdBinhLuan(String idBinhLuan) {
        this.idBinhLuan = idBinhLuan;
    }
}
