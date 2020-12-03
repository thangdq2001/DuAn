package com.example.duan1.Admin.Model;

public class KhachSanPhong {
    private String KspId;
    private String KsPLoai;
    private Double KsPGiaGoc;
    private String KsPSoPhong;
    private int KsPSoLuongPhong;
    private Double KsPGiamGia;
    private Double KsPGiaPhong;

    public KhachSanPhong() {
    }

    public KhachSanPhong(String kspId, String ksPLoai, Double ksPGiaGoc, String ksPSoPhong, int ksPSoLuongPhong, Double ksPGiamGia, Double ksPGiaPhong) {
        KspId = kspId;
        KsPLoai = ksPLoai;
        KsPGiaGoc = ksPGiaGoc;
        KsPSoPhong = ksPSoPhong;
        KsPSoLuongPhong = ksPSoLuongPhong;
        KsPGiamGia = ksPGiamGia;
        KsPGiaPhong = ksPGiaPhong;
    }

    public String getKspId() {
        return KspId;
    }

    public void setKspId(String kspId) {
        KspId = kspId;
    }

    public String getKsPLoai() {
        return KsPLoai;
    }

    public void setKsPLoai(String ksPLoai) {
        KsPLoai = ksPLoai;
    }

    public Double getKsPGiaGoc() {
        return KsPGiaGoc;
    }

    public void setKsPGiaGoc(Double ksPGiaGoc) {
        KsPGiaGoc = ksPGiaGoc;
    }

    public String getKsPSoPhong() {
        return KsPSoPhong;
    }

    public void setKsPSoPhong(String ksPSoPhong) {
        KsPSoPhong = ksPSoPhong;
    }

    public int getKsPSoLuongPhong() {
        return KsPSoLuongPhong;
    }

    public void setKsPSoLuongPhong(int ksPSoLuongPhong) {
        KsPSoLuongPhong = ksPSoLuongPhong;
    }

    public Double getKsPGiamGia() {
        return KsPGiamGia;
    }

    public void setKsPGiamGia(Double ksPGiamGia) {
        KsPGiamGia = ksPGiamGia;
    }

    public Double getKsPGiaPhong() {
        return KsPGiaPhong;
    }

    public void setKsPGiaPhong(Double ksPGiaPhong) {
        KsPGiaPhong = ksPGiaPhong;
    }
}
