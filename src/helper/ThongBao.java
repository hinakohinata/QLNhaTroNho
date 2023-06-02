/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

/**
 *
 * @author Dell
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Business Logic Layer
 * @author CuongNP
 */
public class ThongBao {
        
    //Hàm thông báo đơn giản
    public static void ThongBaoDonGian(String Title, String Content){
        JOptionPane.showMessageDialog(new JFrame(), 
                Content, Title, JOptionPane.INFORMATION_MESSAGE );
    }
}
