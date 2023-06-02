/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.*;
import helper.ChuyenDoi;
import helper.sqlHelper;
import java.sql.ResultSet;

/**
 *
 * @author Dell
 */
public class DALThanNhanThue {
    public static ResultSet GetAllData() {
        String sql="Select * ThanNhanThue";
        ResultSet rs=sqlHelper.executeQuery(sql);
        return rs;
    }
    
    public static ResultSet FindByName(String tenKhach) {
        String sql="Select * from ThanNhanThue where TenThanNhan=?";
        ResultSet rs=sqlHelper.executeQuery(sql,tenKhach);
        return rs;
    }
    public static ResultSet FindByMaNguoiDD(String MaNguoiDaiDien) {
        String sql="Select * from ThanNhanThue where MaNguoiDaiDien=?";
        ResultSet rs=sqlHelper.executeQuery(sql,MaNguoiDaiDien);
        return rs;
    }
    
    public static  ResultSet FindByNameOrID(String tuKhoa) {
        String sql="Select * from ThanNhanThue where MaNguoiDaiDien like ? or MaKH = ?";
        ResultSet rs=sqlHelper.executeQuery(sql,"%"+tuKhoa+"%",tuKhoa);
        return rs;
    }
    public static void Insert(ThanNhanThue kh){
        String sql="INSERT INTO [dbo].[ThanNhanThue] ([MaNguoiDaiDien],[TenThanNhan],[CMND],[NgaySinh],[QueQuan]) VALUES(?,?,?,?,?)";
        sqlHelper.executeUpdate(sql,kh.getMaNguoiDaiDien(),kh.getTenThanNhan(),kh.getCMND(),ChuyenDoi.LayNgayString(kh.getNgaySinh()),kh.getQueQuan());

    } 
    
    public static void Update(ThanNhanThue kh){
        String sql="UPDATE [dbo].[ThanNhanThue] SET [TenThanNhan] = ? ,[CMND] = ? ,[NgaySinh] = ? ,[QueQuan] = ? WHERE [MaNguoiDaiDien]=?";
        sqlHelper.executeUpdate(sql,kh.getTenThanNhan(),kh.getCMND(),ChuyenDoi.LayNgayString(kh.getNgaySinh()),kh.getQueQuan(),kh.getMaNguoiDaiDien());
    }
    public static void Delete(String maSp,String ten){
        String sql="DELETE [dbo].[ThanNhanThue] WHERE  [MaNguoiDaiDien] = ? and [TenThanNhan] = ?";
        sqlHelper.executeUpdate(sql,maSp,ten);
    }
}
