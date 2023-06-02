/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.ChiSoDienNuoc;
import helper.ChuyenDoi;
import helper.sqlHelper;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class DALChiSoDienNuoc {
    public static ResultSet GetAllData() {
        String sql="select * from ChiSoDienNuoc";
        ResultSet rs  = sqlHelper.executeQuery(sql);
        return rs;
    }
    public static ResultSet FindByMaPhong(String MaPhong) {
        String sql="Select * from ChiSoDienNuoc where MaPhong = ?  order by NgayGhi";
        ResultSet rs=sqlHelper.executeQuery(sql,MaPhong);
        return rs;
    }
    public static ResultSet FindByMaPhongAndDate(String MaPhong, Date ngay) {
        String sql="Select * from ChiSoDienNuoc where MaPhong = ? and NgayGhi =?";
        ResultSet rs=sqlHelper.executeQuery(sql,MaPhong,ChuyenDoi.LayNgayString(ngay));
        return rs;
    }
    public static void Insert(ChiSoDienNuoc cs) {
        String sql="INSERT INTO [dbo].[ChiSoDienNuoc] ([MaPhong],[SoDien],[SoNuoc],[NgayGhi])  VALUES (?,?,?,?)";
        sqlHelper.executeUpdate(sql,cs.getMaPhong(),cs.getSoDien(),cs.getSoNuoc(),ChuyenDoi.LayNgayString(cs.getNgayGhi()));
    }
    public static void Update(ChiSoDienNuoc cs) {
        String sql="UPDATE [dbo].[ChiSoDienNuoc] SET [SoDien]=?,[SoNuoc]=? WHERE [MaPhong]=? and [NgayGhi]=?";
        sqlHelper.executeUpdate(sql,cs.getSoDien(),cs.getSoNuoc(),cs.getMaPhong(),ChuyenDoi.LayNgayString(cs.getNgayGhi()));
    }
    public static void Delete(String ma,Date ngay){
        String sql="DELETE [dbo].[ChiSoDienNuoc] WHERE  [MaPhong] = ? AND [NgayGhi]=?";
        sqlHelper.executeUpdate(sql,ma,ChuyenDoi.LayNgayString(ngay));
    }
    public static ResultSet GetDay(String bd,String kt) {
        String sql="SELECT DATEDIFF(day, ?, ?) as SoDay";
        ResultSet rs  = sqlHelper.executeQuery(sql,bd,kt);
        return rs;
    }
}
