/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CuongNP
 */
public class ChuyenDoi {
    //Chuyển đổi kiểu Date <-> String
    //Tạo định dạng ngày tháng
    static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    //Hàm chuyển Date -> String
    public static String LayNgayString(Date date){
        return dateFormat.format(date);
    }
    
    //Hàm chuyển String -> Date
    public static Date LayNgayDate(String ngay){
        try {
            return dateFormat.parse(ngay);
        } catch (ParseException ex) {
            System.out.println("Lỗi chuyển ngày");
            return null;
        }
    }
    
    //Chuyển đổi số Double <-> String 10.000.000
    //Hàm chuyển Double -> String
    public static String SoString(double so){
        return NumberFormat.getNumberInstance().format(so);
    }
    
    //Hàm chuyển String -> Double
    public static double SoDouble(String so){
        try {
            return NumberFormat.getNumberInstance().parse(so).doubleValue();
        } catch (ParseException ex) {
            System.out.println("Lỗi chuyển số");
            return 0;
        }
    }

    public static String SoDouble(int tongTD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static String SoDouble(double giaPhong) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
