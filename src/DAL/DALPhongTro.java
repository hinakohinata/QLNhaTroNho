/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.PhongTro;
import helper.sqlHelper;
import java.sql.ResultSet;

/**
 *
 * @author Dell
 */
public class DALPhongTro {
    public static ResultSet GetAllData() {
        String sql="select * from PhongTro";
        ResultSet rs  = sqlHelper.executeQuery(sql);
        return rs;
    }
    public static void Update(PhongTro pt){
        String sql="DELETE FROM [dbo].[PhongTro] "
                + "INSERT INTO [dbo].[PhongTro] VALUES (?,?,?,?)";
        sqlHelper.executeUpdate(sql,pt.getTenPhongTro(),pt.getChuPhongTro(),pt.getSDT(),pt.getDiaChi());
    }
    
}
