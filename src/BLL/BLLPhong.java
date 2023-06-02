/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.DaiDienThue;
import DTO.Phong;
import helper.ChuyenDoi;
import helper.MyCombobox;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class BLLPhong {

    public static ArrayList<Phong> GetAll() {
        ResultSet rs = DAL.DALPhong.GetAllData();
        ArrayList<Phong> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                Phong sp = new Phong();
                sp.setMaPhong(rs.getString("MaPhong"));
                sp.setTenPhong(rs.getString("TenPhong"));
                sp.setViTri(rs.getString("ViTri"));
                sp.setGhiChu(rs.getString("GhiChu"));
                sp.setTinhTrang(rs.getBoolean("TinhTrang"));
                arr.add(sp);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }

    public static void doDataTable(ArrayList<Phong> arr, JTable tb1) {
        DefaultTableModel tbModel = (DefaultTableModel) tb1.getModel();
        tbModel.setRowCount(0);
        for (Phong sp : arr) {
            Object obj[] = new Object[6];
            obj[0] = tb1.getRowCount() + 1;
            obj[1] = sp.getMaPhong();
            obj[2] = sp.getTenPhong();
            obj[3] = sp.getViTri();
            if (sp.isTinhTrang()) {
                obj[4] = "Đã cho thuê";
            } else {
                obj[4] = "Trống";
            }

            obj[5] = sp.getGhiChu();
            tbModel.addRow(obj);
        }
    }

    public static ArrayList<Phong> FindByName(String tukhoa) {
        ResultSet rs = DAL.DALPhong.FindByName(tukhoa);
        ArrayList<Phong> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                Phong sp = new Phong();
                sp.setMaPhong(rs.getString("MaPhong"));
                sp.setTenPhong(rs.getString("TenPhong"));
                sp.setViTri(rs.getString("ViTri"));
                sp.setGhiChu(rs.getString("GhiChu"));
                sp.setTinhTrang(rs.getBoolean("TinhTrang"));
                arr.add(sp);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }

    public static ArrayList<Phong> FindByTingTrang() {
        ResultSet rs = DAL.DALPhong.FindByTinhTrang();
        ArrayList<Phong> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                Phong sp = new Phong();
                sp.setMaPhong(rs.getString("MaPhong"));
                sp.setTenPhong(rs.getString("TenPhong"));
                sp.setViTri(rs.getString("ViTri"));
                sp.setGhiChu(rs.getString("GhiChu"));
                sp.setTinhTrang(rs.getBoolean("TinhTrang"));
                arr.add(sp);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }

    public static void doDataTableThuePhong(ArrayList<Phong> arr, JTable tb1) {
        DefaultTableModel tbModel = (DefaultTableModel) tb1.getModel();
        tbModel.setRowCount(0);
        for (Phong sp : arr) {
            ArrayList<DaiDienThue> ddt = BLLDaiDienThue.FindDDThue(sp.getMaPhong() + "");
            Object obj[] = new Object[4];
            obj[0] = sp.getMaPhong();
            obj[1] = sp.getTenPhong();
            if (sp.isTinhTrang()) {
                obj[2] = "Đã cho thuê";
                if (ddt.size() > 0) {
                    obj[3] = ddt.get(0).getMaNguoiDaiDien();
                } else {
                    obj[3] = "";
                }
            } else {
                obj[2] = "Trống";
            }
            tbModel.addRow(obj);
        }
    }

    public static void doDataTableDienNuoc(ArrayList<Phong> arr, JTable tb1) {
        DefaultTableModel tbModel = (DefaultTableModel) tb1.getModel();
        tbModel.setRowCount(0);
        for (Phong sp : arr) {
            ArrayList<DaiDienThue> ddt = BLLDaiDienThue.FindByMaPhong(sp.getMaPhong() + "");
            Object obj[] = new Object[1];
            obj[1] = sp.getTenPhong();

            tbModel.addRow(obj);
        }
    }

    public static void doComboBox(ArrayList<Phong> arr, JComboBox cbb) {
        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbb.getModel();
        cbb.removeAllItems();
        for (Phong lsp : arr) {
            Object value = lsp.getMaPhong();
            Object text = lsp.getTenPhong();
            MyCombobox myCbb = new MyCombobox(value, text);
            cbbModel.addElement(myCbb);
        }
    }

    public static void HienThiPhongCBB(JComboBox cbb, String tenLoai) {
        for (int i = 0; i < cbb.getItemCount(); i++) {
            MyCombobox myCbb = (MyCombobox) cbb.getItemAt(i);
            if (myCbb.toString().equals(tenLoai)) {
                cbb.setSelectedIndex(i);
            }
        }
    }
    public static void Insert(Phong ddt) {
        DAL.DALPhong.Insert(ddt);
    }
    public static void Update(Phong ddt) {
        DAL.DALPhong.Update(ddt);
    }
}
