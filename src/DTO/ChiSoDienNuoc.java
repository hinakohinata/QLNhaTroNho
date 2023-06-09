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
public class ChiSoDienNuoc {

    String MaPhong;
    int SoDien;
    int SoNuoc;
    Date NgayGhi;

    public ChiSoDienNuoc() {
    }

    public ChiSoDienNuoc(String MaPhong, int SoDien, int SoNuoc, Date NgayGhi) {
        this.MaPhong = MaPhong;
        this.SoDien = SoDien;
        this.SoNuoc = SoNuoc;
        this.NgayGhi = NgayGhi;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public int getSoDien() {
        return SoDien;
    }

    public void setSoDien(int SoDien) {
        this.SoDien = SoDien;
    }

    public int getSoNuoc() {
        return SoNuoc;
    }

    public void setSoNuoc(int SoNuoc) {
        this.SoNuoc = SoNuoc;
    }

    public Date getNgayGhi() {
        return NgayGhi;
    }

    public void setNgayGhi(Date NgayGhi) {
        this.NgayGhi = NgayGhi;
    }

}
