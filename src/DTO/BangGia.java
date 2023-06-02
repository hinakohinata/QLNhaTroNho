/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Dell
 */
public class BangGia {

    double GiaPhong ;
    double GiaDien ;
    double GiaNuoc ;
    int NgayGhiPhieu ;

    public BangGia() {
    }

    public BangGia(double GiaPhong, double GiaDien, double GiaNuoc, int NgayGhiPhieu) {
        this.GiaPhong = GiaPhong;
        this.GiaDien = GiaDien;
        this.GiaNuoc = GiaNuoc;
        this.NgayGhiPhieu = NgayGhiPhieu;
    }

    public double getGiaPhong() {
        return GiaPhong;
    }

    public void setGiaPhong(double GiaPhong) {
        this.GiaPhong = GiaPhong;
    }

    public double getGiaDien() {
        return GiaDien;
    }

    public void setGiaDien(double GiaDien) {
        this.GiaDien = GiaDien;
    }

    public double getGiaNuoc() {
        return GiaNuoc;
    }

    public void setGiaNuoc(double GiaNuoc) {
        this.GiaNuoc = GiaNuoc;
    }

    public int getNgayGhiPhieu() {
        return NgayGhiPhieu;
    }

    public void setNgayGhiPhieu(int NgayGhiPhieu) {
        this.NgayGhiPhieu = NgayGhiPhieu;
    }

}
