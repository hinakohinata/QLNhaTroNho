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
public class PhieuThu {

    String TenPhongTro;
    String SDT;
    String DiaChi;
    String TenPhong;
    Date NgayGhiPhieu;
    Date NgayBatDau;
    Date NgayKetThuc;
    double GiaPhong;
    double GiaDien;
    double GiaNuoc;
    int SoDienMoi;
    int SoDienCu;
    int SoNuocMoi;
    int SoNuocCu;
    int DienDD;
    int NuocDD;
    double TienThem;
    double TienGiam;
    double TongDien;
    double TongNuoc;
    double TongTien;
    double TongTienPT;

    public PhieuThu() {
    }

    public PhieuThu(String TenPhongTro, String SDT, String DiaChi, String TenPhong, Date NgayGhiPhieu, Date NgayBatDau, Date NgayKetThuc, double GiaPhong, double GiaDien, double GiaNuoc, int SoDienMoi, int SoDienCu, int SoNuocMoi, int SoNuocCu, int DienDD, int NuocDD, double TienThem, double TienGiam, double TongDien, double TongNuoc, double TongTien, double TongTienPT) {
        this.TenPhongTro = TenPhongTro;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.TenPhong = TenPhong;
        this.NgayGhiPhieu = NgayGhiPhieu;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.GiaPhong = GiaPhong;
        this.GiaDien = GiaDien;
        this.GiaNuoc = GiaNuoc;
        this.SoDienMoi = SoDienMoi;
        this.SoDienCu = SoDienCu;
        this.SoNuocMoi = SoNuocMoi;
        this.SoNuocCu = SoNuocCu;
        this.DienDD = DienDD;
        this.NuocDD = NuocDD;
        this.TienThem = TienThem;
        this.TienGiam = TienGiam;
        this.TongDien = TongDien;
        this.TongNuoc = TongNuoc;
        this.TongTien = TongTien;
        this.TongTienPT = TongTienPT;
    }



    

    public String getTenPhongTro() {
        return TenPhongTro;
    }

    public void setTenPhongTro(String TenPhongTro) {
        this.TenPhongTro = TenPhongTro;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public Date getNgayGhiPhieu() {
        return NgayGhiPhieu;
    }

    public void setNgayGhiPhieu(Date NgayGhiPhieu) {
        this.NgayGhiPhieu = NgayGhiPhieu;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
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

    public int getSoDienMoi() {
        return SoDienMoi;
    }

    public void setSoDienMoi(int SoDienMoi) {
        this.SoDienMoi = SoDienMoi;
    }

    public int getSoDienCu() {
        return SoDienCu;
    }

    public void setSoDienCu(int SoDienCu) {
        this.SoDienCu = SoDienCu;
    }

    public int getSoNuocMoi() {
        return SoNuocMoi;
    }

    public void setSoNuocMoi(int SoNuocMoi) {
        this.SoNuocMoi = SoNuocMoi;
    }

    public int getSoNuocCu() {
        return SoNuocCu;
    }

    public void setSoNuocCu(int SoNuocCu) {
        this.SoNuocCu = SoNuocCu;
    }

    public int getDienDD() {
        return DienDD;
    }

    public void setDienDD(int DienDD) {
        this.DienDD = DienDD;
    }

    public int getNuocDD() {
        return NuocDD;
    }

    public void setNuocDD(int NuocDD) {
        this.NuocDD = NuocDD;
    }

    public double getTienThem() {
        return TienThem;
    }

    public void setTienThem(double TienThem) {
        this.TienThem = TienThem;
    }

    public double getTienGiam() {
        return TienGiam;
    }

    public void setTienGiam(double TienGiam) {
        this.TienGiam = TienGiam;
    }

    public double getTongDien() {
        return TongDien;
    }

    public void setTongDien(double TongDien) {
        this.TongDien = TongDien;
    }

    public double getTongNuoc() {
        return TongNuoc;
    }

    public void setTongNuoc(double TongNuoc) {
        this.TongNuoc = TongNuoc;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public double getTongTienPT() {
        return TongTienPT;
    }

    public void setTongTienPT(double TongTienPT) {
        this.TongTienPT = TongTienPT;
    }

}
