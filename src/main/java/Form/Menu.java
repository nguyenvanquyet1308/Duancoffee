package Form;

import DAO.BanDAO;
import DAO.ChiTietHoaDonDAO;
import DAO.HoaDonDAO;
import DAO.KhachHangDAO;
import DAO.LoaiDAO;
import DAO.SanPhamDAO;
import Entity.Ban;
import Entity.ChiTietHoaDon;
import Entity.HoaDon;
import Entity.KhachHang;
import Entity.Loai;
import Entity.SanPham;
import FormImport.addtable;
import JavaSwingThuVien.TheModel;
import ThuVien.Auth;
import ThuVien.DialogHelper;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguyenvanquyet
 */
public class Menu extends javax.swing.JInternalFrame {

    /**
     * Creates new form Menu 418,374
     */
    BanDAO daoBan = new BanDAO();
    SanPhamDAO daosp = new SanPhamDAO();
    LoaiDAO daoloai = new LoaiDAO();
    HoaDonDAO daohd = new HoaDonDAO();
    KhachHangDAO daokh = new KhachHangDAO();
    ChiTietHoaDonDAO daohdct = new ChiTietHoaDonDAO();
    addtable showAddtable;
    int width = 421;
    int height = 374;
    int row = -1;

    public Menu() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        fillcomboBoxBan();
        filltableSanPham();
        fillcomboboxLoai();
        fillTableHDCT();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        cbxLoai = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbxMaBan = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSanPham = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        panelHoaDon = new javax.swing.JPanel();
        txtmaHoaDon = new JavaSwingThuVien.TextField();
        txtmaKH = new JavaSwingThuVien.TextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txttenKh = new JavaSwingThuVien.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDuavaohoadon = new javax.swing.JButton();
        lblmaSP = new javax.swing.JLabel();
        lbltenSP = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        lblLoai = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ThanhTien = new javax.swing.JLabel();
        JdatengayKG = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtsdt = new JavaSwingThuVien.TextField();
        spinnerSoLuong = new javax.swing.JSpinner();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableHDCT = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cbxLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Loại: ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Tìm kiếm: ");

        txtTimKiem.setBackground(new java.awt.Color(250, 250, 250));
        txtTimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Mã Bàn :");

        cbxMaBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxMaBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton5.setText("Thêm Bàn");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSanPhamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableSanPham);

        jButton2.setText("Tạo hóa đơn mới");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        panelHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        panelHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtmaHoaDon.setText("HD01");
        txtmaHoaDon.setLabelText("Mã Hóa đơn");

        txtmaKH.setLabelText("Mã khách hàng");

        btnThem.setBackground(new java.awt.Color(176, 166, 149));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Add Shopping Cart.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(176, 166, 149));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(51, 51, 51));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setPreferredSize(new java.awt.Dimension(90, 31));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txttenKh.setLabelText("Tên khách hàng");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Mã SP :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Tên SP :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Số lượng :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Giá :");

        btnDuavaohoadon.setBackground(new java.awt.Color(176, 166, 149));
        btnDuavaohoadon.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnDuavaohoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/addbill.png"))); // NOI18N
        btnDuavaohoadon.setText("Đưa vào hóa đơn");

        lblmaSP.setText("jLabel2");

        lbltenSP.setText("jLabel3");

        lblGia.setText("jLabel7");

        lblLoai.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Loại :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Thành tiền :");

        ThanhTien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ThanhTien.setForeground(new java.awt.Color(204, 0, 0));
        ThanhTien.setText("jLabel2");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Ngày Tạo ");

        txtsdt.setLabelText("Số điện thoại");

        spinnerSoLuong.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

        javax.swing.GroupLayout panelHoaDonLayout = new javax.swing.GroupLayout(panelHoaDon);
        panelHoaDon.setLayout(panelHoaDonLayout);
        panelHoaDonLayout.setHorizontalGroup(
            panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHoaDonLayout.createSequentialGroup()
                        .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelHoaDonLayout.createSequentialGroup()
                        .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHoaDonLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblmaSP, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                        .addComponent(lbltenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelHoaDonLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(32, 32, 32)
                                        .addComponent(lblLoai))
                                    .addGroup(panelHoaDonLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(spinnerSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(66, 66, 66))
                            .addGroup(panelHoaDonLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JdatengayKG, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHoaDonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDuavaohoadon))
                    .addGroup(panelHoaDonLayout.createSequentialGroup()
                        .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txttenKh, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 132, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelHoaDonLayout.setVerticalGroup(
            panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHoaDonLayout.createSequentialGroup()
                        .addComponent(txtmaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttenKh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JdatengayKG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblmaSP)
                    .addComponent(jLabel3)
                    .addComponent(lblLoai))
                .addGap(18, 18, 18)
                .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltenSP)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(spinnerSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblGia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDuavaohoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ThanhTien))
                .addGap(3, 3, 3))
        );

        tableHDCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane4.setViewportView(tableHDCT);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Left.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxMaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addComponent(panelHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(cbxLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel13)
                        .addComponent(cbxMaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new addtable().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
//        OpenMenu();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // CloseMenu();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void tableSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSanPhamMouseClicked
        if (evt.getClickCount() == 1) {
            this.row = tableSanPham.getSelectedRow();
            this.edit();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tableSanPhamMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        InsertHoaDon();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        InsertHoadonchitiet();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        deleteChitiethoadon();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JdatengayKG;
    private javax.swing.JLabel ThanhTien;
    private javax.swing.JButton btnDuavaohoadon;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxLoai;
    private javax.swing.JComboBox<String> cbxMaBan;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblLoai;
    private javax.swing.JLabel lblmaSP;
    private javax.swing.JLabel lbltenSP;
    private javax.swing.JPanel panelHoaDon;
    private javax.swing.JSpinner spinnerSoLuong;
    private javax.swing.JTable tableHDCT;
    private javax.swing.JTable tableSanPham;
    private javax.swing.JTextField txtTimKiem;
    private JavaSwingThuVien.TextField txtmaHoaDon;
    private JavaSwingThuVien.TextField txtmaKH;
    private JavaSwingThuVien.TextField txtsdt;
    private JavaSwingThuVien.TextField txttenKh;
    // End of variables declaration//GEN-END:variables

    void fillcomboBoxBan() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxMaBan.getModel();
        model.removeAllElements();
        List<Ban> list = daoBan.selectAll();
        for (Ban kh : list) {
            model.addElement(kh);
        }
    }

    void filltableSanPham() {
        ArrayList<SanPham> list = daosp.BindTable();
        String[] columnName = {"MaSP", "TenSP", "Gia", "MaLoai", "MoTa", "HinhAnh"};
        Object[][] rows = new Object[list.size()][6];
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getMaSP();
            rows[i][1] = list.get(i).getTenSP();
            rows[i][2] = list.get(i).getGia();
            rows[i][3] = list.get(i).getMaLoai();
            rows[i][4] = list.get(i).getMoTa();
            if (list.get(i).getHinhanh() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getHinhanh()).getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH));
                rows[i][5] = image;
            } else {
                rows[i][5] = null;
            }
        }
        TheModel model = new TheModel(rows, columnName);
        tableSanPham.setModel(model);
        tableSanPham.setRowHeight(120);
        tableSanPham.getColumnModel().getColumn(5).setPreferredWidth(150);
    }

    void fillTableHDCT() {
        DefaultTableModel model = (DefaultTableModel) tableHDCT.getModel();
        model.setRowCount(0);
        try {
            String mahd = txtmaHoaDon.getText();
            List<ChiTietHoaDon> list = daohdct.selectMaHD(mahd);
            for (ChiTietHoaDon hdct : list) {
                Object[] row = {hdct.getHoaDonCT(), hdct.getMaHD(), hdct.getMaSP(), hdct.getSoLuong(), hdct.getGiaTien()};
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }

    public void fillcomboboxLoai() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxLoai.getModel();
        model.removeAllElements();
        List<Loai> list = daoloai.selectAll();
        for (Loai kh : list) {
            model.addElement(kh);
        }
    }

    void OpenMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < width; i++) {
                    panelHoaDon.setSize(i, height);
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }).start();
    }

    void CloseMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = width - 1; i > 0; i--) {
                    panelHoaDon.setSize(i, height);
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }

                }
            }
        }).start();
    }

    public void setForm(SanPham sp) {
        lblGia.setText(String.valueOf(sp.getGia()));
        lblLoai.setText(sp.getMaLoai());
        lblmaSP.setText(sp.getMaSP());
        lbltenSP.setText(sp.getTenSP());
    }

    public HoaDon getFormHoaDon() {
        HoaDon hd = new HoaDon();
        hd.setMaHD(txtmaHoaDon.getText());
        hd.setMaKH(txtmaKH.getText());
        hd.setMaBan((int) cbxMaBan.getSelectedIndex());
        hd.setMaNV(Auth.user.getMaNV());
        hd.setNgayDatHang(JdatengayKG.getDate());
        hd.setThanhTien(0);
        hd.setTrangThai(false);
        return hd;
    }

    public KhachHang getFormKhachHang() {
        KhachHang kh = new KhachHang();
        kh.setMaKH(txtmaKH.getText());
        kh.setTenKH(txttenKh.getText());
        kh.setSDT(txtsdt.getText());
        kh.setMaban((int) cbxMaBan.getSelectedIndex());
        return kh;
    }

    public ChiTietHoaDon getFormCTHD() {
        ChiTietHoaDon cthd = new ChiTietHoaDon();
        cthd.setMaHD(txtmaHoaDon.getText());
        cthd.setMaSP(lblmaSP.getText());
        cthd.setSoLuong((int) spinnerSoLuong.getValue());
        cthd.setGiaTien(Float.parseFloat(lblGia.getText()));
        return cthd;

    }

    public void InsertKhachang() {
        KhachHang kh = getFormKhachHang();
        try {
            daokh.insert(kh);
            filltableSanPham();
            fillcomboBoxBan();
            fillcomboboxLoai();
            System.out.println("insert khách hàng thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi khách hàng khi tạo hóa đơn");
            System.out.println(e);
        }
    }

    public void InsertHoaDon() {
        HoaDon hd = getFormHoaDon();

        try {
            InsertKhachang();
            daohd.insert(hd);
            fillTableHDCT();
            filltableSanPham();
            fillcomboBoxBan();
            fillcomboboxLoai();
            DialogHelper.alert(this, "Tạo hóa đơn thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Tạo hóa đơn thất bại");
            System.out.println(e);
        }
    }

    public void InsertHoadonchitiet() {
        ChiTietHoaDon hdct = getFormCTHD();
        try {
            daohdct.insert(hdct);
            fillTableHDCT();
            fillcomboBoxBan();
            filltableSanPham();
            System.out.println("thêm thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Insert lỗi");
            System.out.println(e);
        }
    }

    public void deleteChitiethoadon() {
        try {
            int[] rows = tableHDCT.getSelectedRows();
            if (rows.length > 0 && DialogHelper.confirm(this, "Bạn có muốn xóa sản phẩm này không?")) {
                for (int row : rows) {
                    int makh = (int) tableHDCT.getValueAt(row, 0);
                    daohdct.delete(makh);
                    DialogHelper.alert(this, "Xóa sản phẩm thành công");
                    fillTableHDCT();
                    filltableSanPham();
                }
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi khi xóa sản phẩm");
            System.out.println(e);
        }
    }

    public void edit() {
        String maSp = (String) tableSanPham.getValueAt(row, 0);
        SanPham sp = daosp.selectById(maSp);
        this.setForm(sp);
    }

    public void TaoHoaDonMoi() {

    }

}
