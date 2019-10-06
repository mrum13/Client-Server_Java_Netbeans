/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wordpress.yyaayyaatt.JIFrame.report;

import com.wordpress.yyaayyaatt.model.Kelas;
import java.util.List;
import krs.KRS;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;
/**
 *
 * @author 085741161625
 */
public class JIFMahasiswaReport extends javax.swing.JInternalFrame {
    private List<Kelas> kelases;

    /**
     * Creates new form JIFMahasiswaReport
     */
    public JIFMahasiswaReport() {
        initComponents();
        cmbKelas();
        cmbKelas.setVisible(false);
    }
void cmbKelas(){
    cmbKelas.removeAllItems();
    kelases = KRS.getKelasService().getAll();
    for (Kelas kelas : kelases) {
        cmbKelas.addItem(kelas.getNama());
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
        panel1 = new com.apotik.widget.Panel();
        jPanel2 = new javax.swing.JPanel();
        pnlReport = new javax.swing.JPanel();
        btnPreview = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rBtnByKelas = new javax.swing.JRadioButton();
        rBtnAll = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        cmbKelas = new javax.swing.JComboBox();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Laporan Data Mahasiswa");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Report Preview", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        pnlReport.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlReport.setOpaque(false);
        pnlReport.setLayout(new java.awt.BorderLayout());
        jPanel2.add(pnlReport, java.awt.BorderLayout.CENTER);

        btnPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/images/contents.png"))); // NOI18N
        btnPreview.setText("Preview");
        btnPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviewActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        jPanel1.setOpaque(false);

        buttonGroup1.add(rBtnByKelas);
        rBtnByKelas.setForeground(new java.awt.Color(255, 204, 204));
        rBtnByKelas.setText("By Kelas");
        rBtnByKelas.setOpaque(false);
        rBtnByKelas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rBtnByKelasItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rBtnAll);
        rBtnAll.setForeground(new java.awt.Color(255, 255, 255));
        rBtnAll.setSelected(true);
        rBtnAll.setText("Semua");
        rBtnAll.setOpaque(false);
        rBtnAll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rBtnAllItemStateChanged(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pilihan : ");

        cmbKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBtnAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rBtnByKelas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(rBtnAll)
                    .addComponent(rBtnByKelas))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPreview)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviewActionPerformed
        // TODO add your handling code here:
        JasperPrint print = null;
        if (rBtnAll.isSelected()) {
            print = KRS.getkRSReportService().getMhsAll();
        } else if (rBtnByKelas.isSelected()) {
            print = KRS.getkRSReportService().getMhsByKelas(cmbKelas.getSelectedItem().toString());
//        }else if (rBtnByTa.isSelected()) {
//            print = KRS.getkRSReportService().getMKByTa(cmbTA.getSelectedItem().toString());
        }
        System.err.println("print = " + print);
        JRViewer viewer = new JRViewer(print);

        pnlReport.removeAll();
        pnlReport.add(viewer);
        pnlReport.updateUI();
    }//GEN-LAST:event_btnPreviewActionPerformed

    private void rBtnAllItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rBtnAllItemStateChanged
        // TODO add your handling code here:
        if (rBtnAll.isSelected()) {
            cmbKelas.setVisible(false);
        }
    }//GEN-LAST:event_rBtnAllItemStateChanged

    private void rBtnByKelasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rBtnByKelasItemStateChanged
        // TODO add your handling code here:
        if (rBtnByKelas.isSelected()) {
            cmbKelas.setVisible(true);
        }
    }//GEN-LAST:event_rBtnByKelasItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPreview;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbKelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.apotik.widget.Panel panel1;
    private javax.swing.JPanel pnlReport;
    private javax.swing.JRadioButton rBtnAll;
    private javax.swing.JRadioButton rBtnByKelas;
    // End of variables declaration//GEN-END:variables
}
