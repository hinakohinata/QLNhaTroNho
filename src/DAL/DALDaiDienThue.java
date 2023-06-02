/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DaiDienThue;
import helper.ChuyenDoi;
import helper.sqlHelper;
import java.sql.ResultSet;

/**
 *
 * @author Dell
 */
public class DALDaiDienThue {
    public static ResultSet GetAllData() {
        String sql="Select * DaiDienThue";
        ResultSet rs=sqlHelper.executeQuery(sql);
        return rs;
    }
    
    public static ResultSet FindByName(String tenKhach) {
        String sql="Select * from DaiDienThue where TenNguoiDaiDien=?";
        ResultSet rs=sqlHelper.executeQuery(sql,tenKhach);
        return rs;
    }
    public static ResultSet FindByMaNDD(String MaNguoiDaiDien) {
        String sql="Select * from DaiDienThue where MaNguoiDaiDien = ?";
        ResultSet rs=sqlHelper.executeQuery(sql,MaNguoiDaiDien);
        return rs;
    }
    public static ResultSet FindByMaPhong(String MaPhong) {
        String sql="Select * from DaiDienThue where MaPhong = ?";
        ResultSet rs=sqlHelper.executeQuery(sql,MaPhong);
        return rs;
    }
    public static ResultSet FindDDThue(String MaPhong) {
        String sql="Select * from DaiDienThue where MaPhong = ? and TinhTrang = 1";
        ResultSet rs=sqlHelper.executeQuery(sql,MaPhong);
        return rs;
    }
    public static ResultSet GetAllByMaPhong(String MaPhong) {
        String sql="Select * from DaiDienThue where MaPhong = ?";
        ResultSet rs=sqlHelper.executeQuery(sql,MaPhong);
        return rs;
    }
    
    public static void TraPhong(String MaNguoiDaiDien){
        String sql="UPDATE [dbo].[DaiDienThue] SET [NgayKetThucThue] = getdate()  WHERE [MaNguoiDaiDien]=?";
        sqlHelper.executeUpdate(sql,MaNguoiDaiDien);
    }
    public static void Insert(DaiDienThue kh){
        String sql="INSERT INTO [dbo].[DaiDienThue] ([MaNguoiDaiDien],[MaPhong],[TenNguoiDaiDien],[CMND],[NgaySinh],[QueQuan],[NgayBatDauThue],[NgayKetThucThue]) VALUES(?,?,?,?,?,?,?,?)";
        sqlHelper.executeUpdate(sql,kh.getMaNguoiDaiDien(),kh.getMaPhong(),kh.getTenNguoiDaiDien(),kh.getCMND(),ChuyenDoi.LayNgayString(kh.getNgaySinh()),kh.getQueQuan(),ChuyenDoi.LayNgayString(kh.getNgayBatDauThue()),ChuyenDoi.LayNgayString(kh.getNgayKetThucThue()));
        System.out.println(kh.getMaNguoiDaiDien()+" "+kh.getMaPhong()+" "+kh.getTenNguoiDaiDien()+" "+kh.getCMND()+" "+ChuyenDoi.LayNgayString(kh.getNgaySinh())+" "+kh.getQueQuan()+" "+ChuyenDoi.LayNgayString(kh.getNgayBatDauThue()));
    } 
    
    public static void Update(DaiDienThue kh){
        String sql="UPDATE [dbo].[DaiDienThue] SET [TenNguoiDaiDien]=?,[CMND]=?,[NgaySinh]=?,[QueQuan]=?,[NgayBatDauThue]=? WHERE [MaNguoiDaiDien]=?";
        sqlHelper.executeUpdate(sql,kh.getTenNguoiDaiDien(),kh.getCMND(),ChuyenDoi.LayNgayString(kh.getNgaySinh()),kh.getQueQuan(),ChuyenDoi.LayNgayString(kh.getNgayBatDauThue()),kh.getMaNguoiDaiDien());
    }
    public static void Delete(int maSp){
        String sql="DELETE [dbo].[DaiDienThue] WHERE  [MaNguoiDaiDien] = ?";
        sqlHelper.executeUpdate(sql,maSp);
    }
    public static void UpdateTraPhong(String MaNguoiDaiDien){
        String sql="UPDATE [dbo].[DaiDienThue] SET [NgayKetThucThue]=getdate() WHERE [MaNguoiDaiDien]=?";
        sqlHelper.executeUpdate(sql,MaNguoiDaiDien);
    }
}
