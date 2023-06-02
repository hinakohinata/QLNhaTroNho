/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.BangGia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class BLLBangGia {
    public static ArrayList<BangGia> GetAll() {
        ResultSet rs = DAL.DALBangGia.GetAllData();
        ArrayList<BangGia> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                BangGia pt = new BangGia();
                pt.setGiaPhong(rs.getDouble("GiaPhong"));
                pt.setGiaDien(rs.getDouble("GiaDien"));
                pt.setGiaNuoc(rs.getDouble("GiaNuoc"));
                pt.setNgayGhiPhieu(rs.getInt("NgayGhiPhieu"));
                arr.add(pt);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
    
    public static void Update(BangGia pt) {
        DAL.DALBangGia.Update(pt);
    }
}
