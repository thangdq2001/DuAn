package com.example.duan1.Admin.Model;

public class NhaHangTieuBieu {
     public int NhTbId;
     public String NhTbName;
     public Double NhTbLat;
     public Double NhTbLog;
     public String NhTbDanhGia;
     public String NhTbNhanXet;
     public String NhTbNhomNhaHang;
     public String NhTbKhuVuc;

     public NhaHangTieuBieu() {
     }

     public NhaHangTieuBieu(int nhTbId, String nhTbName, Double nhTbLat, Double nhTbLog, String nhTbNhomNhaHang, String nhTbKhuVuc) {
          NhTbId = nhTbId;
          NhTbName = nhTbName;
          NhTbLat = nhTbLat;
          NhTbLog = nhTbLog;

          NhTbNhomNhaHang = nhTbNhomNhaHang;
          NhTbKhuVuc = nhTbKhuVuc;
     }

     public int getNhTbId() {
          return NhTbId;
     }

     public void setNhTbId(int nhTbId) {
          NhTbId = nhTbId;
     }

     public String getNhTbName() {
          return NhTbName;
     }

     public void setNhTbName(String nhTbName) {
          NhTbName = nhTbName;
     }

     public Double getNhTbLat() {
          return NhTbLat;
     }

     public void setNhTbLat(Double nhTbLat) {
          NhTbLat = nhTbLat;
     }

     public Double getNhTbLog() {
          return NhTbLog;
     }

     public void setNhTbLog(Double nhTbLog) {
          NhTbLog = nhTbLog;
     }

     public String getNhTbDanhGia() {
          return NhTbDanhGia;
     }

     public void setNhTbDanhGia(String nhTbDanhGia) {
          NhTbDanhGia = nhTbDanhGia;
     }

     public String getNhTbNhanXet() {
          return NhTbNhanXet;
     }

     public void setNhTbNhanXet(String nhTbNhanXet) {
          NhTbNhanXet = nhTbNhanXet;
     }

     public String getNhTbNhomNhaHang() {
          return NhTbNhomNhaHang;
     }

     public void setNhTbNhomNhaHang(String nhTbNhomNhaHang) {
          NhTbNhomNhaHang = nhTbNhomNhaHang;
     }

     public String getNhTbKhuVuc() {
          return NhTbKhuVuc;
     }

     public void setNhTbKhuVuc(String nhTbKhuVuc) {
          NhTbKhuVuc = nhTbKhuVuc;
     }
}
