/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Form;

import DAO.ChiTietHoaDonDAO;
import DAO.HoaDonDAO;
import Entity.ChiTietHoaDon;
import Entity.HoaDon;
import ThuVien.DialogHelper;
import ThuVien.XDate;
import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguyenvanquyet
 */
public class Bill extends javax.swing.JInternalFrame {

    /**
     * Creates new form Bill
     */
    ChiTietHoaDonDAO daohdct = new ChiTietHoaDonDAO();
    HoaDonDAO daohd = new HoaDonDAO();
    private Menu menu;
    int row = -1;

    public Bill() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        //    filltableHDCT();
        filltableHoaDon();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        myButton1 = new JavaSwingThuVien.MyButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablehoadon = new javax.swing.JTable();
        btnxoahd = new JavaSwingThuVien.MyButton();
        txtTimKiem = new JavaSwingThuVien.TextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        myButton1.setText("In hóa đơn");
        myButton1.setRadius(20);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        tablehoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MaHD", "MaKH", "MaNV", "NgayDonHang", "MaBAN", "ThanhTien", "TrangThai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablehoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablehoadonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablehoadon);

        btnxoahd.setText("Xóa hóa đơn");
        btnxoahd.setRadius(20);
        btnxoahd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoahdActionPerformed(evt);
            }
        });

        txtTimKiem.setLabelText("Tìm kiếm hóa đơn");
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnxoahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablehoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablehoadonMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tablehoadon.getSelectedRow();
            this.edit();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tablehoadonMouseClicked

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed

        menu = new Menu();
        menu.setVisible(true);
        System.out.println("dưdcbuif");
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton1ActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        filltableHoaDon();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnxoahdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoahdActionPerformed
        deleteHoaDon();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnxoahdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JavaSwingThuVien.MyButton btnxoahd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private JavaSwingThuVien.MyButton myButton1;
    private javax.swing.JTable tablehoadon;
    private JavaSwingThuVien.TextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
//  public void filsltableHDCT() {
//        DefaultTableModel model = (DefaultTableModel) table.getModel();
//        model.setRowCount(0);
//        try {
//            List<ChiTietHoaDon> list = daohdct.selectAll();
//            for (ChiTietHoaDon cthd : list) {
//                Object[] row = {cthd.getHoaDonCT(), cthd.getMaHD(), cthd.getMaSP(), cthd.getSoLuong(), cthd.getGiaTien()};
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            DialogHelper.alert(this, "Lỗi filltable Hóa đơn chi tiết ");
//            System.out.println(e);
//        }
//    }

    public void filltableHoaDon() {
        DefaultTableModel model = (DefaultTableModel) tablehoadon.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtTimKiem.getText();
            List<HoaDon> list = daohd.selectByKeyword(keyword);
            for (HoaDon hoaDon : list) {
                Object[] row = {hoaDon.getMaHD(), hoaDon.getMaKH(), hoaDon.getMaNV(), XDate.toString(hoaDon.getNgayDatHang(), "dd-MM-YYYY"), hoaDon.getMaBan(), hoaDon.getThanhTien(), hoaDon.getTrangThai() ? "Đã Thanh toán" : "Chưa thanh toán"};
                if (hoaDon.getTrangThai() == true) {
                    model.addRow(row);
                }
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi filltable Hóa đơn");
            System.out.println(e);
        }
    }

    public void deleteHoaDon() {
        try {
            int[] rows = tablehoadon.getSelectedRows();
            if (rows.length > 0 && DialogHelper.confirm(this, "Bạn có muốn xóa hóa đơn này không?")) {
                for (int row : rows) {
                    String Mahd = (String) tablehoadon.getValueAt(row, 0);
                    daohd.delete(Mahd);
                    DialogHelper.alert(this, "Xóa hóa đơn thành công");
                    filltableHoaDon();
                }
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi khi xóa hóa đơn");
            System.out.println(e);
        }
    }

    void edit() {
        try {
            String maHD = (String) tablehoadon.getValueAt(this.row, 0);
            HoaDon nv = daohd.selectById(maHD);
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
}
