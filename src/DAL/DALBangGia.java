/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.BangGia;
import helper.sqlHelper;
import java.sql.ResultSet;

/**
 *
 * @author Dell
 */
public class DALBangGia {
    public static ResultSet GetAllData() {
        String sql="select * from BangGia";
        ResultSet rs=sqlHelper.executeQuery(sql);
        return rs;
    }
    public static void Update(BangGia pt){
        String sql="DELETE FROM [dbo].[BangGia] "
                + "INSERT INTO [dbo].[BangGia] VALUES (?,?,?,?)";
        sqlHelper.executeUpdate(sql,pt.getGiaPhong(),pt.getGiaDien(),pt.getGiaNuoc(),pt.getNgayGhiPhieu());
    }
}
