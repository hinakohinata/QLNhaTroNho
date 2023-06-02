/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.PhongTro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class BLLPhongTro {
    public static ArrayList<PhongTro> GetAll() {
        ResultSet rs = DAL.DALPhongTro.GetAllData();
        ArrayList<PhongTro> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                PhongTro pt = new PhongTro();
                pt.setTenPhongTro(rs.getString("TenPhongTro"));
                pt.setChuPhongTro(rs.getString("ChuPhongTro"));
                pt.setSDT(rs.getString("SDT"));
                pt.setDiaChi(rs.getString("DiaChi"));
                arr.add(pt);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
    
    public static void Update(PhongTro pt) {
        DAL.DALPhongTro.Update(pt);
    }
}
