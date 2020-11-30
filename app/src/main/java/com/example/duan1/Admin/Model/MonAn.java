package com.example.duan1.Admin.Model;

public class MonAn {
    public String NhMaName;
    public Double NhMaGia;
    public int NhMId;
    public String NhMaNhom;

    public MonAn(String nhMaName, Double nhMaGia, int nhMId, String nhMaNhom) {
        NhMaName = nhMaName;
        NhMaGia = nhMaGia;
        NhMId = nhMId;
        NhMaNhom = nhMaNhom;
    }

    public String getNhMaName() {
        return NhMaName;
    }

    public void setNhMaName(String nhMaName) {
        NhMaName = nhMaName;
    }

    public Double getNhMaGia() {
        return NhMaGia;
    }

    public void setNhMaGia(Double nhMaGia) {
        NhMaGia = nhMaGia;
    }

    public int getNhMId() {
        return NhMId;
    }

    public void setNhMId(int nhMId) {
        NhMId = nhMId;
    }

    public String getNhMaNhom() {
        return NhMaNhom;
    }

    public void setNhMaNhom(String nhMaNhom) {
        NhMaNhom = nhMaNhom;
    }
}
