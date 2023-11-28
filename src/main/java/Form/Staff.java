/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Form;

import DAO.NhanVienDAO;
import Entity.NhanVien;
import FormImport.addStaff;
import JavaSwingThuVien.MyQuery;
import JavaSwingThuVien.TheModel;
import JavaSwingThuVien.TheModel1;
import ThuVien.Auth;
import ThuVien.DialogHelper;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguyenvanquyet
 */
public class Staff extends javax.swing.JInternalFrame {

    /**
     * Creates new form Staff
     */
    int row = -1;
    NhanVienDAO dao = new NhanVienDAO();
    addStaff addstaff = new addStaff();

    public Staff() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        //    filltable();
        filltableSanPham();
        addstaff = new addStaff();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNhanVien = new javax.swing.JTable();
        txtTimKiem = new JavaSwingThuVien.TextField();
        btnThem = new JavaSwingThuVien.MyButton();
        btnXoa = new JavaSwingThuVien.MyButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Mật Khẩu", "Tên NV", "SDT", "Địa chỉ", "Chức vụ", "Giới Tính", "Hình ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNhanVien);

        txtTimKiem.setLabelText("Tìm kiếm nhân viên");
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.setRadius(20);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.setRadius(20);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Right Arrow.png"))); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Circled Right.png"))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Go Back.png"))); // NOI18N

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Left Arrow.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton7)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        new addStaff().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void tableNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNhanVienMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tableNhanVien.getSelectedRow();
            this.edit();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tableNhanVienMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        //   filltable();
        filltableSanPham();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JavaSwingThuVien.MyButton btnThem;
    private JavaSwingThuVien.MyButton btnXoa;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableNhanVien;
    private JavaSwingThuVien.TextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

//    void filltable() {
//        DefaultTableModel model = (DefaultTableModel) tableNhanVien.getModel();
//        model.setRowCount(0);
//        try {
//            String keyword = txtTimKiem.getText();
//            List<NhanVien> list = dao.selectByKeyword(keyword);
//            for (NhanVien nhanVien : list) {
//                Object[] row = {nhanVien.getMaNV(), nhanVien.getMatKhau(), nhanVien.getTenNV(), nhanVien.getSDT(), nhanVien.getDiaChi(),
//                    nhanVien.isChucVu() ? "Quản lý" : "Nhân viên", nhanVien.isGioiTinh() ? "Nam" : "Nữ", nhanVien.getHinhanh()};
//                model.addRow(row);
//            }
//
//        } catch (Exception e) {
//            DialogHelper.alert(this, "Lỗi filltable Nhân viên");
//            System.out.println(e);
//        }
//    }
    void edit() {
        try {
            String maNV = (String) tableNhanVien.getValueAt(this.row, 0);
            NhanVien nv = dao.selectById(maNV);
            if (nv != null) {
                addstaff.setForm(nv);
                System.out.println("leen");
                new addStaff().setVisible(true);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void delete() {
        if (!Auth.isManager()) {
            DialogHelper.alert(this, "Bạn không có quyền xóa học viên!");
        } else {
            try {
                int[] rows = tableNhanVien.getSelectedRows();
                if (rows.length > 0 && DialogHelper.confirm(this, "Bạn có muốn xóa học viên này không?")) {
                    for (int row : rows) {
                        String MaNV = (String) tableNhanVien.getValueAt(row, 0);
                        dao.delete(MaNV);
                        DialogHelper.alert(this, "Xóa nhân viên thành công");
                        //  filltable();
                    }
                }
            } catch (Exception e) {
                DialogHelper.alert(this, "Lỗi khi xóa nhân viên");
                System.out.println(e);
            }

        }
    }

    void filltableSanPham() {
        MyQuery mq = new MyQuery();
        String keyword = txtTimKiem.getText();
        ArrayList<NhanVien> list = mq.selectByKeywordSaff(keyword);
        String[] columnName = {"MaNV", "MatKhau", "TenNV", "SDT", "DaiChi", "ChucVu", "GioiTinh","HinhAnh"};
        Object[][] rows = new Object[list.size()][8];
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getMaNV();
            rows[i][1] = list.get(i).getMatKhau();
            rows[i][2] = list.get(i).getTenNV();
            rows[i][3] = list.get(i).getSDT();
            rows[i][4] = list.get(i).getDiaChi();
            rows[i][5] = list.get(i).getChucVu() ? "Quản lý" : "Nhân viên";
            rows[i][6] = list.get(i).getGioiTinh() ? "Nam" : "Nữ";
            if (list.get(i).getHinhanh() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getHinhanh()).getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH));
                rows[i][7] = image;
            } else {
                rows[i][7] = null;
            }
        }
        TheModel1 model = new TheModel1(rows, columnName);
        tableNhanVien.setModel(model);
        tableNhanVien.setRowHeight(120);
        tableNhanVien.getColumnModel().getColumn(7).setPreferredWidth(150);
    }

}
