/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.ChiSoDienNuoc;
import DTO.PhieuThu;
import helper.ChuyenDoi;
import helper.sqlHelper;
import java.sql.ResultSet;

/**
 *
 * @author Dell
 */
public class DALPhieuThu {
    public static ResultSet GetAllData() {
        String sql="select * from ChiSoDienNuoc";
        ResultSet rs  = sqlHelper.executeQuery(sql);
        return rs;
    }
    public static void Insert(PhieuThu pt) {
        String sql="delete from phieuthu "
                + "INSERT INTO [dbo].[PhieuThu] ([TenPhongTro],[SDT],[DiaChi],[TenPhong],[NgayGhiPhieu],[NgayBatDau],[NgayKetThuc],[GiaPhong],"
                + "[GiaDien],[GiaNuoc],[SoDienMoi],[SoDienCu],[SoNuocMoi],[SoNuocCu],[TienThem],[TienGiam],[TongDien],[TongNuoc],[TongTien],[DienDD],[NuocDD],[TongTienPT]) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        sqlHelper.executeUpdate(sql,pt.getTenPhongTro(),pt.getSDT(),pt.getDiaChi(),pt.getTenPhong(),ChuyenDoi.LayNgayString(pt.getNgayGhiPhieu())
                ,ChuyenDoi.LayNgayString(pt.getNgayBatDau ()),ChuyenDoi.LayNgayString(pt.getNgayKetThuc ()),
                 pt.getGiaPhong (), pt.getGiaDien (),
                 pt.getGiaNuoc (),pt.getSoDienMoi(),pt.getSoDienCu(),pt.getSoNuocMoi(),pt.getSoNuocCu(),
                 pt.getTienThem (), pt.getTienGiam (),
                 pt.getTongDien (), pt.getTongNuoc()
                , pt.getTongTien (),pt.getDienDD(),pt.getNuocDD(), pt.getTongTienPT());
    }
    
}
