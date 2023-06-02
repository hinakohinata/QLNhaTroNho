/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.*;
import helper.ChuyenDoi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class BLLChiSoDienNuoc {
    public static ArrayList<ChiSoDienNuoc> GetAll() {
        ResultSet rs = DAL.DALChiSoDienNuoc.GetAllData();
        ArrayList<ChiSoDienNuoc> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                ChiSoDienNuoc pt = new ChiSoDienNuoc();
                pt.setMaPhong(rs.getString("MaPhong"));
                pt.setSoDien(rs.getInt("SoDien"));
                pt.setSoNuoc(rs.getInt("SoNuoc"));
                pt.setNgayGhi(rs.getDate("NgayGhi"));
                arr.add(pt);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: getall " + ex.getMessage());
        }
        return arr;
    }
    public static void doDataTable(ArrayList<ChiSoDienNuoc> arr, JTable tb1) {
        DefaultTableModel tbModel = (DefaultTableModel) tb1.getModel();
//        ArrayList<LoaiSanPham> lsp = BLL.BLLLoaiSanPham.GetAll();
        tbModel.setRowCount(0);
        for (ChiSoDienNuoc sp : arr) {
            Object obj[] = new Object[3];
            obj[0] = ChuyenDoi.LayNgayString(sp.getNgayGhi());
            obj[1] = sp.getSoDien();
            obj[2] = sp.getSoNuoc();
            tbModel.addRow(obj);
        }
    }
    public static void doDataTablePT(ArrayList<ChiSoDienNuoc> arr, JTable tb1) {
        DefaultTableModel tbModel = (DefaultTableModel) tb1.getModel();
//        ArrayList<LoaiSanPham> lsp = BLL.BLLLoaiSanPham.GetAll();
        tbModel.setRowCount(0);
        for (int i=0;i<arr.size()-1;i++) {
            ChiSoDienNuoc sp= arr.get(i);
            ChiSoDienNuoc sp1= arr.get(i+1);
            Object obj[] = new Object[2];
            obj[0] = ChuyenDoi.LayNgayString(sp.getNgayGhi());
            obj[1] = ChuyenDoi.LayNgayString(sp1.getNgayGhi());
            tbModel.addRow(obj);
        }
    }
    public static ArrayList<ChiSoDienNuoc> FindByMaPhong(String tukhoa) {
        ResultSet rs = DAL.DALChiSoDienNuoc.FindByMaPhong(tukhoa);
        ArrayList<ChiSoDienNuoc> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                ChiSoDienNuoc pt = new ChiSoDienNuoc();
                pt.setMaPhong(rs.getString("MaPhong"));
                pt.setSoDien(rs.getInt("SoDien"));
                pt.setSoNuoc(rs.getInt("SoNuoc"));
                pt.setNgayGhi(rs.getDate("NgayGhi"));
                arr.add(pt);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
    public static ArrayList<ChiSoDienNuoc> FindByMaPhongAndDate(String MaPhong, Date ngay) {
        ResultSet rs = DAL.DALChiSoDienNuoc.FindByMaPhongAndDate(MaPhong, ngay);
        ArrayList<ChiSoDienNuoc> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                ChiSoDienNuoc pt = new ChiSoDienNuoc();
                pt.setMaPhong(rs.getString("MaPhong"));
                pt.setSoDien(rs.getInt("SoDien"));
                pt.setSoNuoc(rs.getInt("SoNuoc"));
                pt.setNgayGhi(rs.getDate("NgayGhi"));
                arr.add(pt);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
    public static boolean CheckMaPhongAndDate(String MaPhong, Date ngay) {
        ResultSet rs = DAL.DALChiSoDienNuoc.FindByMaPhongAndDate(MaPhong, ngay);
        ArrayList<ChiSoDienNuoc> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                ChiSoDienNuoc pt = new ChiSoDienNuoc();
                pt.setMaPhong(rs.getString("MaPhong"));
                pt.setSoDien(rs.getInt("SoDien"));
                pt.setSoNuoc(rs.getInt("SoNuoc"));
                pt.setNgayGhi(rs.getDate("NgayGhi"));
                arr.add(pt);
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return false;
    }
    public static void Insert(ChiSoDienNuoc ddt) {
        DAL.DALChiSoDienNuoc.Insert(ddt);
    }
    public static void Update(ChiSoDienNuoc ddt) {
        DAL.DALChiSoDienNuoc.Update(ddt);
    }
    public static void Delete(String ma,Date ngay) {
        DAL.DALChiSoDienNuoc.Delete(ma, ngay);
    }
    public static int GetDay(String bd, String kt) {
        ResultSet rs =DAL.DALChiSoDienNuoc.GetDay(bd,kt);
        int arr=-1;
        try {
            while (rs.next()) {
                arr=rs.getInt("SoDay");
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
}
