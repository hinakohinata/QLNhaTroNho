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
public class ThanNhanThue {
    
    String MaNguoiDaiDien ;
    String TenThanNhan ;
    String CMND ;
    boolean GioiTinh;
    Date NgaySinh ;
    String QueQuan ;
    byte[] HinhAnh ;

    public ThanNhanThue() {
    }

    public ThanNhanThue(String MaNguoiDaiDien, String TenThanNhan, String CMND, boolean GioiTinh, Date NgaySinh, String QueQuan) {
        this.MaNguoiDaiDien = MaNguoiDaiDien;
        this.TenThanNhan = TenThanNhan;
        this.CMND = CMND;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
    }

    public ThanNhanThue(String MaNguoiDaiDien, String TenThanNhan, String CMND, boolean GioiTinh, Date NgaySinh, String QueQuan, byte[] HinhAnh) {
        this.MaNguoiDaiDien = MaNguoiDaiDien;
        this.TenThanNhan = TenThanNhan;
        this.CMND = CMND;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
        this.HinhAnh = HinhAnh;
    }

    public ThanNhanThue(String MaNguoiDaiDien, String TenThanNhan, String CMND, Date NgaySinh, String QueQuan) {
        this.MaNguoiDaiDien = MaNguoiDaiDien;
        this.TenThanNhan = TenThanNhan;
        this.CMND = CMND;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
    }

    

    public String getMaNguoiDaiDien() {
        return MaNguoiDaiDien;
    }

    public void setMaNguoiDaiDien(String MaNguoiDaiDien) {
        this.MaNguoiDaiDien = MaNguoiDaiDien;
    }

    public String getTenThanNhan() {
        return TenThanNhan;
    }

    public void setTenThanNhan(String TenThanNhan) {
        this.TenThanNhan = TenThanNhan;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
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

    public byte[] getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(byte[] HinhAnh) {
        this.HinhAnh = HinhAnh;
    }
    
}
