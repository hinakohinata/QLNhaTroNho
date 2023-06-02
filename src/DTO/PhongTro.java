/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Dell
 */
public class PhongTro {

    String TenPhongTro;
    String ChuPhongTro;
    String SDT;
    String DiaChi;

    public PhongTro() {
    }

    public PhongTro(String TenPhongTro, String ChuPhongTro, String SDT, String DiaChi) {
        this.TenPhongTro = TenPhongTro;
        this.ChuPhongTro = ChuPhongTro;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
    }

    public String getTenPhongTro() {
        return TenPhongTro;
    }

    public void setTenPhongTro(String TenPhongTro) {
        this.TenPhongTro = TenPhongTro;
    }

    public String getChuPhongTro() {
        return ChuPhongTro;
    }

    public void setChuPhongTro(String ChuPhongTro) {
        this.ChuPhongTro = ChuPhongTro;
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
    
}
