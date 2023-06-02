/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Phong;
import helper.sqlHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class DALPhong {
    
    public static ResultSet GetAllData() {
        String sql="select * from Phong";
        ResultSet rs=sqlHelper.executeQuery(sql);
        return rs;
    }
    public static void Insert(Phong p){
        String sql="INSERT INTO [dbo].[Phong] VALUES (?,?,?,?,?)";
        sqlHelper.executeUpdate(sql,p.getMaPhong(),p.getTenPhong(),p.getViTri(),p.getGhiChu(),p.isTinhTrang());
    }
    public static void Update(Phong p){
        String sql="UPDATE [dbo].[Phong] SET [TenPhong]=?,[ViTri] = ?,[GhiChu] = ?,[TinhTrang] = ? WHERE [MaPhong] = ?";
        sqlHelper.executeUpdate(sql,p.getTenPhong(),p.getViTri(),p.getGhiChu(),p.isTinhTrang(),p.getMaPhong());
    }
    public static  ResultSet FindByName(String tuKhoa) {
        String sql="Select * from Phong where TenPhong  like ?";
        ResultSet rs=sqlHelper.executeQuery(sql,"%"+tuKhoa+"%");
        return rs;
    }
    public static  ResultSet FindByTinhTrang() {
        String sql="Select * from Phong where TinhTrang  = 1";
        ResultSet rs=sqlHelper.executeQuery(sql);
        return rs;
    }
}
