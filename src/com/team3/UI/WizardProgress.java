/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team3.UI;

import com.team3.DAO.DAO_HoaDon;
import com.team3.DAO.DAO_KhachHang;
import com.team3.DAO.DAO_LoaiPhong;
import com.team3.DAO.DAO_PhieuDangKy;
import com.team3.DAO.DAO_Phong;
import com.team3.Helpers.DateHelper;
import com.team3.Helpers.DialogHelper;
import com.team3.Helpers.ShareHelper;
import com.team3.Helpers.StringParseHelper;
import com.team3.Model.Model_HoaDon;
import com.team3.Model.Model_KhachHang;
import com.team3.Model.Model_LoaiPhong;
import com.team3.Model.Model_PhieuDangKy;
import com.team3.Model.Model_Phong;
import com.team3.UI.JPanel.SoDoPhong;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Dell Vostro
 */
public class WizardProgress extends javax.swing.JDialog {

    int trangthai;
    String maPhong;
    String tenphong;
    DAO_Phong pDAO = new DAO_Phong();
    DAO_PhieuDangKy pdkDAO = new DAO_PhieuDangKy();
    DAO_KhachHang khDAO = new DAO_KhachHang();
    DAO_HoaDon hdDAO = new DAO_HoaDon();
    DAO_LoaiPhong lpDAO = new DAO_LoaiPhong();
    static int xx, yy;

    /**
     * Creates new form WizardProgress
     */
    public WizardProgress(java.awt.Frame parent, boolean modal, String masoPhong, String tenPhong, int trangThai) {
        super(parent, modal);
        initComponents();
        trangthai = trangThai;
        maPhong = masoPhong;
        tenphong = tenPhong;
        Model_Phong mdl = this.pDAO.findById(maPhong);
        Model_LoaiPhong mdllp = this.lpDAO.findById(mdl.getMaLoaiPhong());
        switch (trangThai) {
            case 0:
                lblTrangThai.setText("Chưa đặt trước");
                Model_Phong mlp = this.pDAO.findById(maPhong);
                Model_LoaiPhong mdlp = this.lpDAO.findById(mlp.getMaLoaiPhong());
                double price = (mdlp.getDonGia() * 30) / 100;
                lblTienCoc.setText(String.valueOf(price) + " vnđ");
                lblTenPhong.setText(tenPhong);
                lblLoaiPhong.setText(mdllp.getTenLP());
                dccNgayNhan.setDateFormatString("dd/MM/yyyy");
                dccNgayNhan.setDate(new Date());
                dccNTDK.setDateFormatString("dd/MM/yyyy");
                dccNTDK.setDate(new Date());
                break;
            case 1:
                lblTrangThai.setText("Đã đặt trước");
                lblTienCoc.setText("Đã thanh toán");
                lblLoaiPhong.setText(mdllp.getTenLP());
                lblTenPhong.setText(tenPhong);
                dccNgayNhan.setDateFormatString("dd/MM/yyyy");
                dccNgayNhan.setDate(new Date());
                dccNTDK.setDateFormatString("dd/MM/yyyy");
                dccNTDK.setDate(new Date());
                this.loadInfomationReservedCustomer();
                break;
            case 2:
                dccNgayNhan.setDateFormatString("dd/MM/yyyy");
                dccNgayNhan.setDate(new Date());
                Dimension dm = new Dimension();
                dm.setSize(0, 0);
                dccNgayNhan.setPreferredSize(dm);
                lblNgayNhan.setText(DateHelper.toString2(dccNgayNhan.getDate(), new String[0]));
                dccNTDK.setDateFormatString("dd/MM/yyyy");
                dccNTDK.setDate(new Date());
                lblTrangThai.setText("Đăng ký trực tiếp");
                Model_Phong mlpn = this.pDAO.findById(maPhong);
                Model_LoaiPhong mdlps = this.lpDAO.findById(mlpn.getMaLoaiPhong());
                double prices = (mdlps.getDonGia() * 30) / 100;
                lblTienCoc.setText(String.valueOf(prices) + " vnđ");
                lblLoaiPhong.setText(mdllp.getTenLP());
                lblTenPhong.setText(tenPhong);
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblClose3 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblIconApp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblAnhCMND = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblTenPhong = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblLoaiPhong = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtQuocTich = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        dccNgayNhan = new com.toedter.calendar.JDateChooser();
        dccNTDK = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        lblTienCoc = new javax.swing.JLabel();
        lblNgayNhan = new javax.swing.JLabel();
        tgbtn_loadInfo = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(48, 55, 79)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(48, 55, 79));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/team3/Images/icons/close.png"))); // NOI18N
        lblClose3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClose3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClose3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblClose3MousePressed(evt);
            }
        });
        jPanel5.add(lblClose3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 30, 30));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Thông tin đăng ký");
        jPanel5.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 700, 30));

        lblIconApp.setBackground(new java.awt.Color(153, 255, 102));
        lblIconApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/team3/Images/icons/iconApp.png"))); // NOI18N
        lblIconApp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(lblIconApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Họ tên");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("CMND");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 102, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("SDT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 142, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Quốc tịch");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Giới tính");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 223, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 262, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Địa chỉ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Ảnh CMND");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        lblAnhCMND.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAnhCMND.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnhCMND.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAnhCMND.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAnhCMND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnhCMNDMouseClicked(evt);
            }
        });
        jPanel1.add(lblAnhCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 220, 150));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Ngày nhận phòng");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Ngày trả dự kiến");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Tiền cọc trước (30%)");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Thông tin phòng đang đăng ký");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel14.setText("Phòng");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        lblTenPhong.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblTenPhong.setText("P101");
        jPanel1.add(lblTenPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 80, -1));

        lblTrangThai.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblTrangThai.setText("Chưa đặt trước");
        jPanel1.add(lblTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 150, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel17.setText("Loại");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        lblLoaiPhong.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblLoaiPhong.setText("Deluxe");
        jPanel1.add(lblLoaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 90, -1));

        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 280, -1));

        txtCMND.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCMNDActionPerformed(evt);
            }
        });
        jPanel1.add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 280, -1));

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 280, -1));

        txtQuocTich.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtQuocTich, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 280, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 280, -1));

        rdoNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");
        jPanel1.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        rdoNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoNu.setText("Nữ");
        jPanel1.add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        txtDiaChi.setColumns(20);
        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDiaChi.setRows(5);
        jScrollPane1.setViewportView(txtDiaChi);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 280, 100));

        dccNgayNhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(dccNgayNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 150, -1));
        jPanel1.add(dccNTDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 150, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Làm mới thông tin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Lưu thông tin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 10, 410));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Trạng thái đăng ký");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        lblTienCoc.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblTienCoc.setText("Chưa thanh toán");
        jPanel1.add(lblTienCoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 150, -1));

        lblNgayNhan.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        lblNgayNhan.setText("Ngày nhận");
        jPanel1.add(lblNgayNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 150, 20));

        tgbtn_loadInfo.setText("Load thông tin Khách Hàng cũ");
        tgbtn_loadInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtn_loadInfoActionPerformed(evt);
            }
        });
        jPanel1.add(tgbtn_loadInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 405, 280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblClose3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose3MouseClicked
        this.dispose();
    }//GEN-LAST:event_lblClose3MouseClicked

    private void lblClose3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose3MouseEntered
        lblClose3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/team3/Images/icons/close2.png")));
    }//GEN-LAST:event_lblClose3MouseEntered

    private void lblClose3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose3MouseExited
        lblClose3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/team3/Images/icons/close.png")));
    }//GEN-LAST:event_lblClose3MouseExited

    private void lblClose3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose3MousePressed
        this.dispose();
    }//GEN-LAST:event_lblClose3MousePressed

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.save();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (trangthai == 0 || trangthai == 2) {
            clear();
        } else {
            this.loadInfomationReservedCustomer();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblAnhCMNDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnhCMNDMouseClicked
        UploadImage();
    }//GEN-LAST:event_lblAnhCMNDMouseClicked

    private void txtCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCMNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCMNDActionPerformed

    private void tgbtn_loadInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtn_loadInfoActionPerformed
        if (tgbtn_loadInfo.isSelected()) {
            this.loadCMND();
        } else {
            this.clear();
        }
    }//GEN-LAST:event_tgbtn_loadInfoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WizardProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WizardProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WizardProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WizardProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                WizardProgress dialog = new WizardProgress(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dccNTDK;
    private com.toedter.calendar.JDateChooser dccNgayNhan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAnhCMND;
    private javax.swing.JLabel lblClose3;
    private javax.swing.JLabel lblIconApp;
    private javax.swing.JLabel lblLoaiPhong;
    private javax.swing.JLabel lblNgayNhan;
    private javax.swing.JLabel lblTenPhong;
    private javax.swing.JLabel lblTienCoc;
    public static javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JToggleButton tgbtn_loadInfo;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtQuocTich;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    Model_KhachHang getModelKH() {
        Model_KhachHang model = new Model_KhachHang();
        model.setHoTen(txtTen.getText());
        model.setQuocTich(txtQuocTich.getText());
        model.setEmail(txtEmail.getText());
        model.setDiaChi(txtDiaChi.getText());
        model.setSdt(txtSDT.getText());
        model.setCmnd(txtCMND.getText());
        model.setHinh(lblAnhCMND.getToolTipText());
        model.setNgayThem(DateHelper.toDate(DateHelper.toString(DateHelper.now(), new String[0]), new String[0]));
        if (rdoNam.isSelected()) {
            model.setGioiTinh(true);
        } else {
            model.setGioiTinh(false);
        }
        return model;
    }

    Model_PhieuDangKy getModelPhieuDK() {
        Model_PhieuDangKy model = new Model_PhieuDangKy();
        model.setMaNV(ShareHelper.user.getMaNV());
//        model.setMaKH(Integer.parseInt(txtMaKH.getText()));
        model.setMaPhong(Integer.parseInt(maPhong));
        model.setNgayNhanPhong(dccNgayNhan.getDate());
        model.setNgayTraPhongDuKien(dccNTDK.getDate());
        model.setNgayTraPhongThucTe(dccNTDK.getDate());
        model.setNgayLap(DateHelper.now());
        model.setTrangThai(0);
//        model.setMaPhieuDK((int) tblPDK.getValueAt(tblPDK.getSelectedRow(), 0));
        return model;
    }

    Model_HoaDon getModelHoaDon() {
        Model_HoaDon model = new Model_HoaDon();
        model.setNgayThanhToan(DateHelper.now());
        model.setHinhThucThanhToan(0);
//        model.setMaKH();
        model.setMaKM(null);
        model.setMaNV(ShareHelper.user.getMaNV());
//        model.setMaPhieuDK();
        Model_Phong mlp = this.pDAO.findById(maPhong);
        Model_LoaiPhong mdl = this.lpDAO.findById(mlp.getMaLoaiPhong());
        double price = (mdl.getDonGia() * 30) / 100;
        model.setTongTien(price);
        model.setTrangThai(0);
        return model;
    }

    void saveInfomationReserved() {
        try {
            Model_KhachHang khnext = this.khDAO.findByCMND(txtCMND.getText());
            Model_PhieuDangKy mdlpdk = getModelPhieuDK();
            mdlpdk.setMaKH(khnext.getMaKH());
            Model_PhieuDangKy dknext = this.pdkDAO.findByIdKHActive(String.valueOf(mdlpdk.getMaKH()));
            Model_HoaDon hdmdl = getModelHoaDon();
            hdmdl.setMaKH(khnext.getMaKH());
            hdmdl.setMaPhieuDK(dknext.getMaPhieuDK());
            Model_Phong mdlp = this.pDAO.findById(maPhong);
            mdlp.setTrangThai(1);
            this.pDAO.update(mdlp);
            DialogHelper.alert(this, "Lưu thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi CSDL, không thể lưu thông tin!");
            e.printStackTrace();
        }
    }

    void saveInfomationGetInstantly(int trangThai) {
        Model_KhachHang mdlkh = getModelKH();
        try {
            this.khDAO.insert(mdlkh);
            Model_KhachHang khnext = this.khDAO.findByCMND(txtCMND.getText());
            Model_PhieuDangKy mdlpdk = getModelPhieuDK();
            mdlpdk.setMaKH(khnext.getMaKH());
            this.pdkDAO.insert(mdlpdk);
            Model_PhieuDangKy dknext = this.pdkDAO.findByIdKHActive(String.valueOf(mdlpdk.getMaKH()));
            Model_HoaDon hdmdl = getModelHoaDon();
            hdmdl.setMaKH(khnext.getMaKH());
            hdmdl.setMaPhieuDK(dknext.getMaPhieuDK());
            this.hdDAO.insert(hdmdl);
            Model_Phong mdlp = this.pDAO.findById(maPhong);
            if (trangThai == 0) {
                mdlp.setTrangThai(5);
                this.pDAO.update(mdlp);
            } else if (trangThai == 2) {
                mdlp.setTrangThai(1);
                this.pDAO.update(mdlp);
            }
            DialogHelper.alert(this, "Lưu thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi CSDL, không thể lưu thông tin!");
            e.printStackTrace();
        }
    }

    void saveInfomationOldCustomer(int trangThai) {
        Model_KhachHang mdlkh = getModelKH();
        try {
            this.khDAO.update(mdlkh);
            Model_KhachHang khnext = this.khDAO.findByCMND(txtCMND.getText());
            Model_PhieuDangKy mdlpdk = getModelPhieuDK();
            mdlpdk.setMaKH(khnext.getMaKH());
            this.pdkDAO.insert(mdlpdk);
            Model_PhieuDangKy dknext = this.pdkDAO.findByIdKHActive(String.valueOf(mdlpdk.getMaKH()));
            Model_HoaDon hdmdl = getModelHoaDon();
            hdmdl.setMaKH(khnext.getMaKH());
            hdmdl.setMaPhieuDK(dknext.getMaPhieuDK());
            this.hdDAO.insert(hdmdl);
            Model_Phong mdlp = this.pDAO.findById(maPhong);
            if (trangThai == 0) {
                mdlp.setTrangThai(5);
                this.pDAO.update(mdlp);
            } else if (trangThai == 2) {
                mdlp.setTrangThai(1);
                this.pDAO.update(mdlp);
            }
            DialogHelper.alert(this, "Lưu thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi CSDL, không thể lưu thông tin!");
            e.printStackTrace();
        }
    }

    void loadInfomationReservedCustomer() {
        Model_PhieuDangKy mdlpdk = this.pdkDAO.findByMaPhongActive3(maPhong);
        if (mdlpdk != null) {
            Model_KhachHang mdlkh = this.khDAO.findById(mdlpdk.getMaKH());
            dccNgayNhan.setDate(mdlpdk.getNgayNhanPhong());
            dccNTDK.setDate(mdlpdk.getNgayTraPhongDuKien());
            txtTen.setText(mdlkh.getHoTen());
            txtCMND.setText(mdlkh.getCmnd());
            txtSDT.setText(mdlkh.getSdt());
            txtQuocTich.setText(mdlkh.getQuocTich());
            if (mdlkh.isGioiTinh() == true) {
                rdoNam.setSelected(true);
                rdoNu.setSelected(false);
            } else {
                rdoNam.setSelected(false);
                rdoNu.setSelected(true);
            }
            txtEmail.setText(mdlkh.getEmail());
            txtDiaChi.setText(mdlkh.getDiaChi());
            if (mdlkh.getHinh() != null) {
                Image im = ShareHelper.readLogo(mdlkh.getHinh()).getImage();
                ImageIcon icon = new ImageIcon(im.getScaledInstance(lblAnhCMND.getWidth(), lblAnhCMND.getHeight(), im.SCALE_SMOOTH));
                lblAnhCMND.setIcon(icon);
            } else {
                lblAnhCMND.setIcon(null);
            }
        } else {
            DialogHelper.alert(this, "Phiếu đăng ký không tồn tại! Lỗi Database!");
        }
    }

    void UploadImage() {
        JFileChooser jfile = new JFileChooser();
        jfile.setDialogTitle("Chọn hình chứng minh nhân dân");
        if (jfile.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = jfile.getSelectedFile();
            if (ShareHelper.savelogo(file)) {
                Image im = ShareHelper.readLogo(file.getName()).getImage();
                ImageIcon icon = new ImageIcon(im.getScaledInstance(lblAnhCMND.getWidth(), lblAnhCMND.getHeight(), im.SCALE_SMOOTH));
                lblAnhCMND.setIcon(icon);
                lblAnhCMND.setToolTipText(file.getName());
            }
        }
    }

    void save() {
//        Date dm = DateHelper.toDate(DateHelper.toString(DateHelper.now(), new String[0]), new String[0]);
        switch (trangthai) {
            case 0:
                if (check()) {
                    if (tgbtn_loadInfo.isSelected()) {
                        this.saveInfomationOldCustomer(0);
                        this.dispose();
                        SoDoPhong.btnShowAll.doClick();
                    } else {
                        this.saveInfomationGetInstantly(0);
                        this.dispose();
                        SoDoPhong.btnShowAll.doClick();
                    }
                }
                break;
            case 1:
                if (check()) {
                    if (!tgbtn_loadInfo.isSelected()) {
                        this.saveInfomationReserved();
                        this.dispose();
                        SoDoPhong.btnShowAll.doClick();
                    }
                }
                break;
            case 2:
                if (check()) {
                    if (tgbtn_loadInfo.isSelected()) {
                        this.saveInfomationOldCustomer(2);
                        this.dispose();
                        SoDoPhong.btnShowAll.doClick();
                    } else {
                        this.saveInfomationGetInstantly(2);
                        this.dispose();
                        SoDoPhong.btnShowAll.doClick();
                    }
                }
                break;
        }
    }

    boolean checkCMNDexist() {
        List<Model_KhachHang> list = khDAO.select();
        for (Model_KhachHang kh : list) {
            if (txtCMND.getText().trim().equalsIgnoreCase(kh.getCmnd().trim())) {
                DialogHelper.alert(this, "Số CMND đã tồn tại, vui lòng load thông tin");
                txtCMND.requestFocus();
                return false;
            }
        }
        return true;
    }

    boolean checkEmail() {
        String email = "\\w+@\\w+\\.\\w+";
        String email2 = "\\w+@\\w+\\.\\w+\\.\\w+";
        if (txtEmail.getText().trim().matches(email) || txtEmail.getText().trim().matches(email2)) {
            return true;
        } else {
            DialogHelper.alert(this, "Email phải đúng định dạng");
            txtEmail.requestFocus();
            return false;
        }
    }

    boolean checkQuoctich() {
        if (!txtQuocTich.getText().trim().matches("^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ"
                + "ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ"
                + "ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s]+$") || txtQuocTich.getText().trim().equals("")) {
            DialogHelper.alert(this, "Quốc tịch không được nhập số");
            txtQuocTich.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    boolean checkHoten() {
        if (!txtTen.getText().trim().matches("^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ"
                + "ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ"
                + "ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s]+$") || txtTen.getText().trim().equals("")) {
            DialogHelper.alert(this, "Họ tên không được nhập số");
            txtTen.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    boolean checkCMND() {
        String cmnd = "[0-9]{9,12}";
        if (txtCMND.getText().trim().matches(cmnd)) {
            return true;
        } else {
            DialogHelper.alert(this, "Chứng minh chỉ nhập số và có từ 9 - 12 số");
            txtCMND.requestFocus();
            return false;
        }
    }

    boolean checkSDT() {
        String sdt = "[0-9]{9,10}";
        if (txtSDT.getText().trim().matches(sdt)) {
            return true;
        } else {
            DialogHelper.alert(this, "Điện thoại chỉ nhập số và có từ 9 - 10 số");
            txtSDT.requestFocus();
            return false;
        }

    }

    boolean checkLength() {
        if (txtTen.getText().length() > 0 && txtCMND.getText().length() > 0 && txtSDT.getText().length() > 0 && txtEmail.getText().length() > 0
                && txtQuocTich.getText().length() > 0 && txtDiaChi.getText().length() > 0) {
            return true;
        } else {
            DialogHelper.alert(this, "Tất cả thông tin không được để trống");
            return false;
        }
    }

    boolean checkDate() {
        Date dm = DateHelper.toDate(DateHelper.toString(DateHelper.now(), new String[0]), new String[0]);
        if (dccNgayNhan.getDate().before(dm)) {
            DialogHelper.alert(this, "Ngày nhận không được nằm trước ngày hôm nay!");
            return false;
        } else if (dccNTDK.getDate().before(dccNgayNhan.getDate())) {
            DialogHelper.alert(this, "Ngày trả không được nằm trước ngày nhận!");
            return false;
        } else if (dccNgayNhan.getDate().after(dccNTDK.getDate())) {
            DialogHelper.alert(this, "Ngày nhận không được nằm sau ngày trả!");
            return false;
        } else {
            return true;
        }
    }

    boolean check() {
        if (checkLength() && checkHoten() && checkCMND() && checkSDT() && checkEmail() && checkQuoctich() && checkDate() && tgbtn_loadInfo.isSelected()) {
            return true;
        } else if (checkLength() && checkHoten() && checkCMNDexist() && checkCMND() && checkSDT() && checkEmail() && checkQuoctich() && checkDate()) {
            return true;
        } else {
            return false;
        }
    }

    void clear() {
        dccNgayNhan.setDate(new Date());
        dccNTDK.setDate(new Date());
        txtTen.setText("");
        txtQuocTich.setText("");
        txtEmail.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        txtCMND.setText("");
        lblAnhCMND.setIcon(null);
        rdoNam.setSelected(true);
        rdoNu.setSelected(false);
    }

    void loadCMND() {
        if ((txtCMND.getText() != "" || !txtCMND.getText().isEmpty()) && checkCMND()) {
            Model_KhachHang mdlkh = this.khDAO.findByCMND(txtCMND.getText().trim());
            if (mdlkh != null) {
                txtTen.setText(mdlkh.getHoTen());
                txtSDT.setText(mdlkh.getSdt());
                txtCMND.setText(mdlkh.getCmnd());
                txtQuocTich.setText(mdlkh.getQuocTich());
                txtEmail.setText(mdlkh.getEmail());
                txtDiaChi.setText(mdlkh.getDiaChi());
                if (mdlkh.isGioiTinh() == true) {
                    rdoNam.setSelected(true);
                    rdoNu.setSelected(false);
                } else {
                    rdoNam.setSelected(false);
                    rdoNu.setSelected(true);
                }
                txtEmail.setText(mdlkh.getEmail());
                txtDiaChi.setText(mdlkh.getDiaChi());
                if (mdlkh.getHinh() != null) {
                    Image im = ShareHelper.readLogo(mdlkh.getHinh()).getImage();
                    ImageIcon icon = new ImageIcon(im.getScaledInstance(lblAnhCMND.getWidth(), lblAnhCMND.getHeight(), im.SCALE_SMOOTH));
                    lblAnhCMND.setIcon(icon);
                } else {
                    lblAnhCMND.setIcon(null);
                }
            } else {
                DialogHelper.alert(this, "CMND không có trên hệ thống. Hãy tạo mới KH!");
            }
        } else {
            DialogHelper.alert(this, "Vui lòng nhập CMND đúng dạng");
        }
    }
}