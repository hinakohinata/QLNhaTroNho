/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.DaiDienThue;
import DTO.Phong;
import helper.ChuyenDoi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class BLLDaiDienThue {

    public static ArrayList<DaiDienThue> GetAll() {
        ResultSet rs = DAL.DALDaiDienThue.GetAllData();
        ArrayList<DaiDienThue> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                DaiDienThue sp = new DaiDienThue();
                sp.setMaNguoiDaiDien(rs.getString("MaNguoiDaiDien"));;
                sp.setMaPhong(rs.getString("MaPhong"));
                sp.setTenNguoiDaiDien(rs.getString("TenNguoiDaiDien"));
                sp.setCMND(rs.getString("CMND"));
                sp.setNgaySinh(rs.getDate("NgaySinh"));
                sp.setQueQuan(rs.getString("QueQuan"));
                sp.setNgayBatDauThue(rs.getDate("NgayBatDauThue"));
                sp.setNgayKetThucThue(rs.getDate("NgayKetThucThue"));
                sp.setTinhTrang(rs.getBoolean("TinhTrang"));
                sp.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(sp);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }

    public static void doDataTable(ArrayList<DaiDienThue> arr, JTable tb1) {
        DefaultTableModel tbModel = (DefaultTableModel) tb1.getModel();
//        ArrayList<LoaiSanPham> lsp = BLL.BLLLoaiSanPham.GetAll();
        tbModel.setRowCount(0);
        for (DaiDienThue sp : arr) {
            Object obj[] = new Object[10];
            obj[0] = tb1.getRowCount() + 1;
            obj[1] = sp.getMaNguoiDaiDien();
            obj[2] = sp.getTenNguoiDaiDien();
            obj[3] = sp.getCMND();
            obj[4] = sp.getNgaySinh();
            obj[5] = sp.getQueQuan();
            obj[6] = sp.getNgayBatDauThue();
            obj[7] = sp.getNgayKetThucThue();
            obj[8] = sp.isTinhTrang();
            obj[9] = sp.getHinhAnh();
            tbModel.addRow(obj);
        }
    }

    public static void doDataTableTTThue(ArrayList<DaiDienThue> arr, JTable tb1) {
        DefaultTableModel tbModel = (DefaultTableModel) tb1.getModel();
//        ArrayList<LoaiSanPham> lsp = BLL.BLLLoaiSanPham.GetAll();
        tbModel.setRowCount(0);
        for (DaiDienThue sp : arr) {
            Object obj[] = new Object[6];
            obj[0] = sp.getTenNguoiDaiDien();
            obj[1] = sp.getCMND();
            obj[2] = sp.getNgaySinh();
            obj[3] = sp.getQueQuan();
            obj[4] = sp.getNgayBatDauThue();
            obj[5] = sp.getNgayKetThucThue();
            tbModel.addRow(obj);
        }
    }
    public static void doDataTableKH(ArrayList<DaiDienThue> arr, JTable tb1) {
        DefaultTableModel tbModel = (DefaultTableModel) tb1.getModel();
//        ArrayList<LoaiSanPham> lsp = BLL.BLLLoaiSanPham.GetAll();
        tbModel.setRowCount(0);
        for (DaiDienThue sp : arr) {
            Object obj[] = new Object[10];
            obj[0] = sp.getMaNguoiDaiDien();
            obj[1] = sp.getTenNguoiDaiDien();
            obj[2] = sp.getCMND();
            obj[3] = sp.getNgaySinh();
            obj[4] = sp.getQueQuan();
            obj[5] = sp.getNgayBatDauThue();
            obj[6] = sp.getNgayKetThucThue();
            tbModel.addRow(obj);
        }
    }

    public static ArrayList<DaiDienThue> FindByMaNDD(String tukhoa) {
        ResultSet rs = DAL.DALDaiDienThue.FindByMaNDD(tukhoa);
        ArrayList<DaiDienThue> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                DaiDienThue sp = new DaiDienThue();
                sp.setMaNguoiDaiDien(rs.getString("MaNguoiDaiDien"));;
                sp.setMaPhong(rs.getString("MaPhong"));
                sp.setTenNguoiDaiDien(rs.getString("TenNguoiDaiDien"));
                sp.setCMND(rs.getString("CMND"));
                sp.setNgaySinh(rs.getDate("NgaySinh"));
                sp.setQueQuan(rs.getString("QueQuan"));
                sp.setNgayBatDauThue(rs.getDate("NgayBatDauThue"));
                sp.setNgayKetThucThue(rs.getDate("NgayKetThucThue"));
                sp.setTinhTrang(rs.getBoolean("TinhTrang"));
                sp.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(sp);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }

    public static ArrayList<DaiDienThue> FindByMaPhong(String tukhoa) {
        ResultSet rs = DAL.DALDaiDienThue.FindByMaPhong(tukhoa);
        ArrayList<DaiDienThue> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                DaiDienThue sp = new DaiDienThue();
                sp.setMaNguoiDaiDien(rs.getString("MaNguoiDaiDien"));;
                sp.setMaPhong(rs.getString("MaPhong"));
                sp.setTenNguoiDaiDien(rs.getString("TenNguoiDaiDien"));
                sp.setCMND(rs.getString("CMND"));
                sp.setNgaySinh(rs.getDate("NgaySinh"));
                sp.setQueQuan(rs.getString("QueQuan"));
                sp.setNgayBatDauThue(rs.getDate("NgayBatDauThue"));
                sp.setNgayKetThucThue(rs.getDate("NgayKetThucThue"));
                sp.setTinhTrang(rs.getBoolean("TinhTrang"));
                sp.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(sp);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
    public static ArrayList<DaiDienThue> FindDDThue(String tukhoa) {
        ResultSet rs = DAL.DALDaiDienThue.FindDDThue(tukhoa);
        ArrayList<DaiDienThue> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                DaiDienThue sp = new DaiDienThue();
                sp.setMaNguoiDaiDien(rs.getString("MaNguoiDaiDien"));;
                sp.setMaPhong(rs.getString("MaPhong"));
                sp.setTenNguoiDaiDien(rs.getString("TenNguoiDaiDien"));
                sp.setCMND(rs.getString("CMND"));
                sp.setNgaySinh(rs.getDate("NgaySinh"));
                sp.setQueQuan(rs.getString("QueQuan"));
                sp.setNgayBatDauThue(rs.getDate("NgayBatDauThue"));
                sp.setNgayKetThucThue(rs.getDate("NgayKetThucThue"));
                sp.setTinhTrang(rs.getBoolean("TinhTrang"));
                sp.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(sp);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }

    public static ArrayList<DaiDienThue> GetAllByMaPhong(String tukhoa) {
        ResultSet rs = DAL.DALDaiDienThue.GetAllByMaPhong(tukhoa);
        ArrayList<DaiDienThue> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                DaiDienThue sp = new DaiDienThue();
                sp.setMaNguoiDaiDien(rs.getString("MaNguoiDaiDien"));;
                sp.setMaPhong(rs.getString("MaPhong"));
                sp.setTenNguoiDaiDien(rs.getString("TenNguoiDaiDien"));
                sp.setCMND(rs.getString("CMND"));
                sp.setNgaySinh(rs.getDate("NgaySinh"));
                sp.setQueQuan(rs.getString("QueQuan"));
                sp.setNgayBatDauThue(rs.getDate("NgayBatDauThue"));
                sp.setNgayKetThucThue(rs.getDate("NgayKetThucThue"));
                sp.setTinhTrang(rs.getBoolean("TinhTrang"));
                sp.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(sp);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }

    public static void UpdateTT(DaiDienThue ddt) {
        DAL.DALDaiDienThue.Update(ddt);
    }

    public static void Insert(DaiDienThue ddt) {
        DAL.DALDaiDienThue.Insert(ddt);
        System.out.println("Lỗi lấy dữ liệu:0-0-00000-111`11'");
    }
    
    public static void UpdateTraPhong(String MaNguoiDaiDien) {
        DAL.DALDaiDienThue.UpdateTraPhong(MaNguoiDaiDien);
    }
}
