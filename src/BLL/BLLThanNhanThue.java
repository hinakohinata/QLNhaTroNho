/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class BLLThanNhanThue {
    public static void doDataTableTTThue(ArrayList<ThanNhanThue> arr, JTable tb1) {
        DefaultTableModel tbModel = (DefaultTableModel) tb1.getModel();
//        ArrayList<LoaiSanPham> lsp = BLL.BLLLoaiSanPham.GetAll();
        for (ThanNhanThue sp : arr) {
            Object obj[] = new Object[5];
            obj[0] = sp.getTenThanNhan();
            obj[1] = sp.getCMND();
            obj[2] = sp.getNgaySinh();
            obj[3] = sp.getQueQuan();
            obj[4] ="";
            tbModel.addRow(obj);
        }
    }
    public static ArrayList<ThanNhanThue> FindByMaNDD(String tukhoa) {
        ResultSet rs = DAL.DALThanNhanThue.FindByMaNguoiDD(tukhoa);
        ArrayList<ThanNhanThue> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                ThanNhanThue sp = new ThanNhanThue();
                sp.setMaNguoiDaiDien(rs.getString("MaNguoiDaiDien")); ;
                sp.setTenThanNhan(rs.getString("TenThanNhan"));
                sp.setCMND(rs.getString("CMND"));
                sp.setNgaySinh(rs.getDate("NgaySinh"));
                sp.setQueQuan(rs.getString("QueQuan"));
                sp.setHinhAnh(rs.getBytes("HinhAnh"));
                arr.add(sp);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
    
    
    public static void Insert(ThanNhanThue ddt) {
        DAL.DALThanNhanThue.Insert(ddt);
    }
    public static void Update(ThanNhanThue ddt) {
        DAL.DALThanNhanThue.Update(ddt);
    }
    public static void Delete(String ma,String ten) {
        DAL.DALThanNhanThue.Delete(ma, ten);
    }
}
