/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Dell
 */
public class Phong {

    String MaPhong ;
    String TenPhong ;
    String ViTri ;
    String GhiChu ;
    boolean TinhTrang ;

    public Phong() {
    }

    public Phong(String MaPhong, String TenPhong, String ViTri, String GhiChu, boolean TinhTrang) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.ViTri = ViTri;
        this.GhiChu = GhiChu;
        this.TinhTrang = TinhTrang;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public String getViTri() {
        return ViTri;
    }

    public void setViTri(String ViTri) {
        this.ViTri = ViTri;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
}
