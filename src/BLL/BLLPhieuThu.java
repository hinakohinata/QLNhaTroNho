/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.PhieuThu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class BLLPhieuThu {

    public static ArrayList<PhieuThu> GetAll() {
        ResultSet rs = DAL.DALBangGia.GetAllData();
        ArrayList<PhieuThu> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                PhieuThu pt = new PhieuThu();
                pt.setTenPhongTro(rs.getString("TenPhongTro"));
                pt.setSDT(rs.getString("SDT"));
                pt.setDiaChi(rs.getString("DiaChi"));
                pt.setTenPhong(rs.getString("TenPhong"));
                pt.setNgayGhiPhieu(rs.getDate("NgayGhiPhieu"));
                pt.setNgayBatDau(rs.getDate("NgayBatDau"));
                pt.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                pt.setGiaPhong(rs.getDouble("GiaPhong"));
                pt.setGiaDien(rs.getDouble("GiaDien"));
                pt.setGiaNuoc(rs.getDouble("GiaNuoc"));
                pt.setSoDienMoi(rs.getInt("SoDienMoi"));
                pt.setSoDienCu(rs.getInt("SoDienCu"));
                pt.setSoNuocMoi(rs.getInt("SoNuocMoi"));
                pt.setSoNuocCu(rs.getInt("SoNuocCu"));
                pt.setTienThem(rs.getDouble("TienThem"));
                pt.setTienGiam(rs.getDouble("TienGiam"));
                pt.setTongDien(rs.getDouble("TongDien"));
                pt.setTongNuoc(rs.getDouble("TongNuoc"));
                pt.setTongTien(rs.getDouble("TongTien"));
                pt.setTongTien(rs.getDouble("TongTienPT"));
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }

    public static void Insert(PhieuThu ddt) {
        DAL.DALPhieuThu.Insert(ddt);
    }
}
