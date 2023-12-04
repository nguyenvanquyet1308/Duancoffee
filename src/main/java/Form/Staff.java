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
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
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
    NhanVienDAO daonv = new NhanVienDAO();
    addStaff addstaff = new addStaff();
    JFileChooser fileChooser = new JFileChooser("H:\\MonDuAn1\\BaiTap\\Duancoffee\\src\\main\\java\\ImageProduct");

    public Staff() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        //    filltable();
        filltablenhanvien();
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
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
        txtmaNhanVien = new JavaSwingThuVien.TextField();
        txttenNhanVien = new JavaSwingThuVien.TextField();
        txtsdt = new JavaSwingThuVien.TextField();
        txtdiaChi = new JavaSwingThuVien.TextField();
        jLabel6 = new javax.swing.JLabel();
        txtmatKhau = new JavaSwingThuVien.TextField();
        rdoquanLy = new javax.swing.JRadioButton();
        lblhinhAnh = new javax.swing.JLabel();
        rdonhanVien = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        rdoNu = new javax.swing.JRadioButton();
        btnThem1 = new JavaSwingThuVien.MyButton();
        btnSua = new JavaSwingThuVien.MyButton();
        btnMoi = new JavaSwingThuVien.MyButton();

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
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Circled Right.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Go Back.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Left Arrow.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        txtmaNhanVien.setLabelText("Mã nhân viên");

        txttenNhanVien.setLabelText("Tên nhân viên");

        txtsdt.setLabelText("Số điện thoại");

        txtdiaChi.setLabelText("Địa chỉ");

        jLabel6.setBackground(new java.awt.Color(153, 153, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Chức vụ:");

        txtmatKhau.setLabelText("Mật khẩu");

        buttonGroup1.add(rdoquanLy);
        rdoquanLy.setText("Quản lý");

        lblhinhAnh.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hình ảnh", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        lblhinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhinhAnhMouseClicked(evt);
            }
        });

        buttonGroup1.add(rdonhanVien);
        rdonhanVien.setText("Nhân viên");

        buttonGroup2.add(rdoNam);
        rdoNam.setText("Nam");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Gioi tính: ");

        buttonGroup2.add(rdoNu);
        rdoNu.setText("Nữ");

        btnThem1.setText("Thêm");
        btnThem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem1.setRadius(20);
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setRadius(20);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMoi.setRadius(20);
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdiaChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtsdt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txttenNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtmaNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(lblhinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addComponent(txtmatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdoquanLy)
                                .addGap(13, 13, 13)
                                .addComponent(rdonhanVien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdoNam)))
                        .addGap(13, 13, 13)
                        .addComponent(rdoNu)
                        .addGap(84, 84, 84)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                                .addComponent(jButton7))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtmaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txttenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblhinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoquanLy)
                            .addComponent(rdonhanVien)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        new addStaff().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void tableNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNhanVienMouseClicked
        if (evt.getClickCount() == 1) {
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
        filltablenhanvien();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void lblhinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhinhAnhMouseClicked

        chonAnh();
        // TODO add your handling code here:
    }//GEN-LAST:event_lblhinhAnhMouseClicked

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        insertNhanVien();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        updateNhanVien();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        Moi();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMoiActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        first();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        last();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        next();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        prev();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JavaSwingThuVien.MyButton btnMoi;
    private JavaSwingThuVien.MyButton btnSua;
    private JavaSwingThuVien.MyButton btnThem;
    private JavaSwingThuVien.MyButton btnThem1;
    private JavaSwingThuVien.MyButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblhinhAnh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdonhanVien;
    private javax.swing.JRadioButton rdoquanLy;
    private javax.swing.JTable tableNhanVien;
    private JavaSwingThuVien.TextField txtTimKiem;
    private JavaSwingThuVien.TextField txtdiaChi;
    private JavaSwingThuVien.TextField txtmaNhanVien;
    private JavaSwingThuVien.TextField txtmatKhau;
    private JavaSwingThuVien.TextField txtsdt;
    private JavaSwingThuVien.TextField txttenNhanVien;
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
            NhanVien nv = daonv.selectById(maNV);
            if (nv != null) {
                setForm(nv);
                System.out.println("leen");
                //  new addStaff().setVisible(true);
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
                        daonv.delete(MaNV);
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

    private static byte[] convertIconToByteArray(Icon icon) {
        BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.createGraphics();
        icon.paintIcon(null, g, 0, 0);
        g.dispose();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", baos);
        } catch (IOException e) {
            System.out.println(e);
        }
        return baos.toByteArray();
    }

    public void setForm(NhanVien nv) {
        txtmaNhanVien.setText(nv.getMaNV());
        txtmatKhau.setText(nv.getMatKhau());
        txttenNhanVien.setText(nv.getTenNV());
        txtsdt.setText(nv.getSDT());
        txtdiaChi.setText(nv.getDiaChi());
        txtmaNhanVien.setText(nv.getMaNV());
        rdoNam.setSelected(nv.getGioiTinh());
        rdoNu.setSelected(!nv.getGioiTinh());
        rdonhanVien.setSelected(!nv.getChucVu());
        rdoquanLy.setSelected(nv.getChucVu());
        ImageIcon imageIcon = new ImageIcon(nv.getHinhanh());
        lblhinhAnh.setIcon(imageIcon);
    }

    NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtmaNhanVien.getText());
        nv.setMatKhau(txtmatKhau.getText());
        nv.setTenNV(txttenNhanVien.getText());
        nv.setSDT(txtsdt.getText());
        nv.setDiaChi(txtdiaChi.getText());
        nv.setChucVu(rdoquanLy.isSelected());
        nv.setGioiTinh(rdoNam.isSelected());
        Icon icon = lblhinhAnh.getIcon();
        byte[] imageBytes = convertIconToByteArray(lblhinhAnh.getIcon());
        nv.setHinhanh(imageBytes);
        return nv;
    }

    void chonAnh() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            ThuVien.Xlmage.save(file);//lưu hình vào thư mục logo
            ImageIcon icon = ThuVien.Xlmage.read(file.getName());//đọc hình ảnh từ logo
            lblhinhAnh.setIcon(icon);
            lblhinhAnh.setToolTipText(file.getName());//giữ tên hình tooltip
        }
    }

    void filltablenhanvien() {
        MyQuery mq = new MyQuery();
        String keyword = txtTimKiem.getText();
        ArrayList<NhanVien> list = mq.selectByKeywordSaff(keyword);
        String[] columnName = {"MaNV", "MatKhau", "TenNV", "SDT", "DaiChi", "ChucVu", "GioiTinh", "HinhAnh"};
        Object[][] rows = new Object[list.size()][8];
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getMaNV();
            rows[i][1] = list.get(i).getMatKhau();
            rows[i][2] = list.get(i).getTenNV();
            rows[i][3] = list.get(i).getSDT();
            rows[i][4] = list.get(i).getDiaChi();
            rows[i][5] = list.get(i).getChucVu() ? "Quản lý" : "Nhân Viên";
            rows[i][6] = list.get(i).getGioiTinh() ? "Nam" : "Nữ";
            if (list.get(i).getHinhanh() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getHinhanh()).getImage().getScaledInstance(110, 80, Image.SCALE_SMOOTH));
                rows[i][7] = image;
            } else {
                rows[i][7] = null;
            }
        }
        TheModel1 model = new TheModel1(rows, columnName);
        tableNhanVien.setModel(model);
        tableNhanVien.setRowHeight(80);
        tableNhanVien.getColumnModel().getColumn(7).setPreferredWidth(110);
    }

    void insertNhanVien() {
        if (kiemthunhanvien() == false) {
            return;
        }
        NhanVien model = getForm();
        try {
            daonv.insert(model);
            DialogHelper.alert(this, "Thêm mới thành công!");
            filltablenhanvien();
        } catch (Exception e) {
            DialogHelper.alert(this, "Thêm mới thất bại!");
            System.out.println(e);
        }
    }

    void updateNhanVien() {
        NhanVien nv = getForm();
        try {
            daonv.update(nv);
            filltablenhanvien();
            DialogHelper.alert(this, "Sửa nhân viên thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi sửa nhân viên");
        }
    }

    public void Moi() {
        txtdiaChi.setText("");
        txtmaNhanVien.setText("");
        txtmatKhau.setText("");
        txtsdt.setText("");
        txttenNhanVien.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        lblhinhAnh.setIcon(null);
    }

    boolean kiemthunhanvien() {
        if (txtmaNhanVien.getText().equals("")) {
            DialogHelper.alert(this, "Bạn cần điền mã nhân viên !");
            return false;
        }
        if (txtdiaChi.getText().equals("")) {
            DialogHelper.alert(this, "Bạn cần điền địa chỉ nhân viên !");
            return false;
        }
        if (txtmatKhau.getText().equals("")) {
            DialogHelper.alert(this, "Bạn cần điền mật khẩu nhân viên !");
            return false;
        }
        if (txtsdt.getText().equals("")) {
            DialogHelper.alert(this, "Bạn cần điền SDT nhân viên !");
            return false;
        }
        if (txttenNhanVien.getText().equals("")) {
            DialogHelper.alert(this, "Bạn cần điền Tên nhân viên !");
            return false;
        }
        if (!rdoNam.isSelected() && !rdoNam.isSelected()) {
            DialogHelper.alert(this, "Bạn cần chọn giới tính cho nhân viên !");
            return false;
        }
        if (!rdonhanVien.isSelected() && !rdoquanLy.isSelected()) {
            DialogHelper.alert(this, "Bạn cần chọn chức vụ !");
            return false;
        }
        List<NhanVien> nv = daonv.selectAll();
        for (NhanVien nhanVien : nv) {
            if (txtmaNhanVien.getText().equals(nhanVien.getMaNV())) {
                DialogHelper.alert(this, "Mã nhân viên đã có !");
                return false;
            }
        }

        return true;
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tableNhanVien.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tableNhanVien.getRowCount() - 1;
        this.edit();
    }

}
