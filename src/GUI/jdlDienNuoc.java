/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

import DTO.ChiSoDienNuoc;
import DTO.Phong;
import helper.ChuyenDoi;
import helper.MyCombobox;
import helper.ThongBao;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class jdlDienNuoc extends javax.swing.JDialog {

    /**
     * Creates new form jdlDienNuoc
     */
    public jdlDienNuoc(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDienNuoc = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        dateNgayGhi = new com.toedter.calendar.JDateChooser();
        txtSoDien = new javax.swing.JTextField();
        lblMaSP2 = new javax.swing.JLabel();
        lblMaSP = new javax.swing.JLabel();
        lblTenSP = new javax.swing.JLabel();
        txtSoNuoc = new javax.swing.JTextField();
        lblGiaNhap = new javax.swing.JLabel();
        cbPhong = new javax.swing.JComboBox<>();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        cbPhongtb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(229, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Điện nước hàng tháng");

        tbDienNuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ngày ghi", "Điện", "Nước"
            }
        ));
        tbDienNuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDienNuocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDienNuoc);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));

        dateNgayGhi.setDateFormatString("yyy-MM-dd");

        lblMaSP2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMaSP2.setForeground(new java.awt.Color(255, 102, 0));
        lblMaSP2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMaSP2.setText("Phòng:");

        lblMaSP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMaSP.setForeground(new java.awt.Color(255, 102, 0));
        lblMaSP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMaSP.setText("Số điện");

        lblTenSP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTenSP.setForeground(new java.awt.Color(255, 102, 0));
        lblTenSP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTenSP.setText("Số nước");

        lblGiaNhap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGiaNhap.setForeground(new java.awt.Color(255, 102, 0));
        lblGiaNhap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGiaNhap.setText("Ngày ghi");

        cbPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMaSP2)
                        .addGap(101, 101, 101)
                        .addComponent(cbPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaSP)
                            .addComponent(lblGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateNgayGhi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSoDien)
                            .addComponent(txtSoNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaSP2)
                            .addComponent(cbPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblGiaNhap))
                    .addComponent(dateNgayGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMaSP)
                        .addComponent(txtSoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnXoa))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenSP))
                .addContainerGap())
        );

        cbPhongtb.setBackground(new java.awt.Color(204, 255, 204));
        cbPhongtb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPhongtb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPhongtbItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPhongtb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbPhongtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ArrayList<Phong> arr = BLL.BLLPhong.GetAll();
        BLL.BLLPhong.doComboBox(arr, cbPhong);
        BLL.BLLPhong.doComboBox(arr, cbPhongtb);
        dateNgayGhi.setDate(new Date());
    }//GEN-LAST:event_formWindowOpened

    public void loadTB() {
        MyCombobox tenPhong = (MyCombobox) cbPhongtb.getSelectedItem();
        System.out.println(cbPhongtb.getSelectedItem());
        ArrayList<Phong> arrP = BLL.BLLPhong.FindByName(tenPhong + "");
        if (arrP.size() > 0) {
            ArrayList<ChiSoDienNuoc> arrCS = BLL.BLLChiSoDienNuoc.FindByMaPhong(arrP.get(0).getMaPhong() + "");
            if (arrCS.size() > 0) {
                BLL.BLLChiSoDienNuoc.doDataTable(arrCS, tbDienNuoc);
            } else {
                DefaultTableModel tbModel = (DefaultTableModel) tbDienNuoc.getModel();
                tbModel.setRowCount(0);
            }
        }
    }
    private void tbDienNuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDienNuocMouseClicked
        // TODO add your handling code here:
        int indexRow = tbDienNuoc.getSelectedRow();
        BLL.BLLPhong.HienThiPhongCBB(cbPhong, cbPhongtb.getSelectedItem() + "");
        dateNgayGhi.setDate(ChuyenDoi.LayNgayDate(tbDienNuoc.getValueAt(indexRow, 0).toString()));
        txtSoDien.setText(tbDienNuoc.getValueAt(indexRow, 1).toString());
        txtSoNuoc.setText(tbDienNuoc.getValueAt(indexRow, 2).toString());

    }//GEN-LAST:event_tbDienNuocMouseClicked

    private void cbPhongtbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPhongtbItemStateChanged
        // TODO add your handling code here:
        loadTB();
    }//GEN-LAST:event_cbPhongtbItemStateChanged

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        MyCombobox tenPhong = (MyCombobox) cbPhong.getSelectedItem();
        System.out.println(cbPhong.getSelectedItem());
        ArrayList<Phong> arrP = BLL.BLLPhong.FindByName(tenPhong + "");
        try {
            if (txtSoDien.getText().equals("") || txtSoNuoc.getText().equals("")) {
                ThongBao.ThongBaoDonGian("Thông báo", "Dữ liệu trống!");
                return;
            }

            if (arrP.size() > 0) {
                String maPhong = arrP.get(0).getMaPhong();
                int soDien = Integer.parseInt(txtSoDien.getText());
                int sonuoc = Integer.parseInt(txtSoNuoc.getText());
                Date ngayGhi = dateNgayGhi.getDate();
                if(!BLL.BLLChiSoDienNuoc.CheckMaPhongAndDate(maPhong, ngayGhi)){
                BLL.BLLChiSoDienNuoc.Insert(new ChiSoDienNuoc(maPhong, soDien, sonuoc, ngayGhi));
                ThongBao.ThongBaoDonGian("Thông báo", "Đã thêm!");
                }else{
                    ThongBao.ThongBaoDonGian("Thông báo", "Đã tồn tại!");
                }
            }
        } catch (Exception e) {
            ThongBao.ThongBaoDonGian("Thông báo", "Vui lòng xem lại dữ liệu!");
        }
        loadTB();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int dongDangChon = tbDienNuoc.getSelectedRow();
        if (dongDangChon == 0) {
            ThongBao.ThongBaoDonGian("Thông Báo", "Không thể xóa người đại diện!");
        }
        if (dongDangChon < 0) {
            ThongBao.ThongBaoDonGian("Thông Báo", "Bạn chưa chọn đối tượng cần xóa");
        } else {
            int XacNhan = JOptionPane.showConfirmDialog(null, "Bạn có chắc xóa không?", "Thông báo xác nhận", JOptionPane.OK_CANCEL_OPTION);
            if (XacNhan == JOptionPane.CANCEL_OPTION) {
                return;
            }
        }
        //Lấy danh sách các sp  cần xóa
        try {
            int dongCanXoa[] = tbDienNuoc.getSelectedRows();

            MyCombobox tenPhong = (MyCombobox) cbPhong.getSelectedItem();
            System.out.println(cbPhong.getSelectedItem());
            ArrayList<Phong> arrP = BLL.BLLPhong.FindByName(tenPhong + "");

            if (arrP.size() > 0) {
                for (int i = 0; i < dongCanXoa.length; i++) {
                    String maPhong = arrP.get(0).getMaPhong();
                    Date ngayGhi = ChuyenDoi.LayNgayDate(tbDienNuoc.getValueAt(dongCanXoa[i], 0).toString());
                    BLL.BLLChiSoDienNuoc.Delete(maPhong, ngayGhi);
                }
            }
            ThongBao.ThongBaoDonGian("Thông Báo", "Đã xóa");
        } catch (Exception e) {
            ThongBao.ThongBaoDonGian("Thông Báo", "Chưa xóa");
        }

        loadTB();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        MyCombobox tenPhong = (MyCombobox) cbPhong.getSelectedItem();
        System.out.println(cbPhong.getSelectedItem());
        ArrayList<Phong> arrP = BLL.BLLPhong.FindByName(tenPhong + "");
        try {
            if (txtSoDien.getText().equals("") || txtSoNuoc.getText().equals("")) {
                ThongBao.ThongBaoDonGian("Thông báo", "Dữ liệu trống!");
                return;
            }

            if (arrP.size() > 0) {
                String maPhong = arrP.get(0).getMaPhong();
                int soDien = Integer.parseInt(txtSoDien.getText());
                int sonuoc = Integer.parseInt(txtSoNuoc.getText());
                Date ngayGhi = dateNgayGhi.getDate();
                int XacNhan = JOptionPane.showConfirmDialog(null, "Bạn có chắc sửa không?", "Thông báo xác nhận", JOptionPane.OK_CANCEL_OPTION);
                if (XacNhan == JOptionPane.CANCEL_OPTION) {
                    return;
                }
                BLL.BLLChiSoDienNuoc.Update(new ChiSoDienNuoc(maPhong, soDien, sonuoc, ngayGhi));
            }
        } catch (Exception e) {
            ThongBao.ThongBaoDonGian("Thông báo", "Vui lòng xem lại dữ liệu!");
        }
        loadTB();
    }//GEN-LAST:event_btnSuaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jdlDienNuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdlDienNuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdlDienNuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdlDienNuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdlDienNuoc dialog = new jdlDienNuoc(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbPhong;
    private javax.swing.JComboBox<String> cbPhongtb;
    private com.toedter.calendar.JDateChooser dateNgayGhi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGiaNhap;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblMaSP2;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JTable tbDienNuoc;
    private javax.swing.JTextField txtSoDien;
    private javax.swing.JTextField txtSoNuoc;
    // End of variables declaration//GEN-END:variables
}