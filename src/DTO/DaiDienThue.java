/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class DaiDienThue {

    String MaNguoiDaiDien ;
    String MaPhong ;
    String TenNguoiDaiDien ;
    String CMND ;
    Date NgaySinh ;
    String QueQuan ;
    Date NgayBatDauThue ;
    Date NgayKetThucThue ;
    boolean TinhTrang ;
    byte[] HinhAnh ;

    public DaiDienThue() {
    }

    public DaiDienThue(String MaNguoiDaiDien, String MaPhong, String TenNguoiDaiDien, String CMND, Date NgaySinh, String QueQuan, Date NgayBatDauThue, Date NgayKetThucThue, boolean TinhTrang, byte[] HinhAnh) {
        this.MaNguoiDaiDien = MaNguoiDaiDien;
        this.MaPhong = MaPhong;
        this.TenNguoiDaiDien = TenNguoiDaiDien;
        this.CMND = CMND;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
        this.NgayBatDauThue = NgayBatDauThue;
        this.NgayKetThucThue = NgayKetThucThue;
        this.TinhTrang = TinhTrang;
        this.HinhAnh = HinhAnh;
    }

    public DaiDienThue(String MaNguoiDaiDien, String MaPhong, String TenNguoiDaiDien, String CMND, Date NgaySinh, String QueQuan, Date NgayBatDauThue, Date NgayKetThucThue, boolean TinhTrang) {
        this.MaNguoiDaiDien = MaNguoiDaiDien;
        this.MaPhong = MaPhong;
        this.TenNguoiDaiDien = TenNguoiDaiDien;
        this.CMND = CMND;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
        this.NgayBatDauThue = NgayBatDauThue;
        this.NgayKetThucThue = NgayKetThucThue;
        this.TinhTrang = TinhTrang;
    }

    public DaiDienThue(String MaNguoiDaiDien, String MaPhong, String TenNguoiDaiDien, String CMND, Date NgaySinh, String QueQuan, Date NgayBatDauThue) {
        this.MaNguoiDaiDien = MaNguoiDaiDien;
        this.MaPhong = MaPhong;
        this.TenNguoiDaiDien = TenNguoiDaiDien;
        this.CMND = CMND;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
        this.NgayBatDauThue = NgayBatDauThue;
    }

    public DaiDienThue(String MaNguoiDaiDien, String MaPhong, String TenNguoiDaiDien, String CMND, Date NgaySinh, String QueQuan, Date NgayBatDauThue, Date NgayKetThucThue) {
        this.MaNguoiDaiDien = MaNguoiDaiDien;
        this.MaPhong = MaPhong;
        this.TenNguoiDaiDien = TenNguoiDaiDien;
        this.CMND = CMND;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
        this.NgayBatDauThue = NgayBatDauThue;
        this.NgayKetThucThue = NgayKetThucThue;
    }
    

    public String getMaNguoiDaiDien() {
        return MaNguoiDaiDien;
    }

    public void setMaNguoiDaiDien(String MaNguoiDaiDien) {
        this.MaNguoiDaiDien = MaNguoiDaiDien;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenNguoiDaiDien() {
        return TenNguoiDaiDien;
    }

    public void setTenNguoiDaiDien(String TenNguoiDaiDien) {
        this.TenNguoiDaiDien = TenNguoiDaiDien;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public Date getNgayBatDauThue() {
        return NgayBatDauThue;
    }

    public void setNgayBatDauThue(Date NgayBatDauThue) {
        this.NgayBatDauThue = NgayBatDauThue;
    }

    public Date getNgayKetThucThue() {
        return NgayKetThucThue;
    }

    public void setNgayKetThucThue(Date NgayKetThucThue) {
        this.NgayKetThucThue = NgayKetThucThue;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public byte[] getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(byte[] HinhAnh) {
        this.HinhAnh = HinhAnh;
    }
       
}
