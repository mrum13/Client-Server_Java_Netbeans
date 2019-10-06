/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InputMk.java
 *
 * Created on Oct 19, 2010, 7:48:17 PM
 */
package com.wordpress.yyaayyaatt.JIFrame;

import com.wordpress.yyaayyaatt.model.Dosen;
import com.wordpress.yyaayyaatt.model.Kelas;
import com.wordpress.yyaayyaatt.model.Pembimbing;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import krs.KRS;

/**
 *
 * @author bahrie
 */
public class InputKelas extends javax.swing.JInternalFrame {

    List<Kelas> kelases = new ArrayList<Kelas>();
    List<Dosen> dosens = new ArrayList<Dosen>();
    List<Pembimbing> pembimbings = new ArrayList<Pembimbing>();
    private Pembimbing pembimbing;
    private Kelas kelas;
    private Dosen dosen;

    /**
     * Creates new form DataMk
     */
    public InputKelas() {
        initComponents();
        statusAwal();
    }

    void isiListDosen() {
        dosens = KRS.getDosenService().getAll();
        cmbPemb.removeAllItems();
        for (Dosen pemb : dosens) {
            cmbPemb.addItem(pemb.getDosen());
        }
    }

    void kosongkanText() {
        txtKelas.setText("");
        txtNmKelas.setText("");
        txtAkad.setText("");
//        cmbPemb.removeAllItems();
        txtAkad.setText("");
    }

    void isiTabelKelas() {
        try {
            kelases = KRS.getKelasService().getAll();
            Object[][] data = new Object[kelases.size()][4];

            int x = 0;
            for (Kelas k : kelases) {
                data[x][0] = k.getKd_kelas();
                data[x][1] = k.getNama();
                data[x][2] = k.getTakad();
                data[x][3] = k.getPembimbing();
                x++;
            }
            String[] judul = {"Kode Kelas", "Kelas", "Thn Akademik", "Pembimbing"};
            tableMk.setModel(new DefaultTableModel(data, judul));
            jScrollPane1.setViewportView(tableMk);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    private void statusAwal() {
        this.kosongkanText();
        this.isiListDosen();
        isiTabelKelas();
        btnTambah.setEnabled(true);
        Enabled(false);
        btnEdit.setText("Edit");
        btnTambah.setText("Tambah");
    }

    void klikTable() {
        if (tableMk.getSelectedRow() >= 0) {
            kelas = kelases.get(tableMk.getSelectedRow());
            kelas = KRS.getKelasService().getKelas(kelas.getId());
            System.out.println("kelas:" + kelas);
            loadModelToForm();
        }
    }

    private void loadModelToForm() {
        txtAkad.setText(kelas.getTakad());
        txtKelas.setText(kelas.getKd_kelas());
        txtNmKelas.setText(kelas.getNama());
        cmbPemb.setSelectedItem(kelas.getPembimbing());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new com.apotik.widget.Panel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMk = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAkad = new javax.swing.JTextField();
        cmbPemb = new javax.swing.JComboBox();
        txtNmKelas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Input Kelas & Pembimbing");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/report/logoPolForm.png"))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input Kelas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        jPanel4.setOpaque(false);

        tableMk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMkMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMk);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        jPanel1.setOpaque(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kode Kelas :");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Kelas :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Thn. Akademik :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pembimbing :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKelas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAkad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbPemb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNmKelas))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNmKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAkad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbPemb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        jPanel3.setOpaque(false);

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/tambah.gif"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/kurang.gif"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/resep.gif"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/exit.gif"))); // NOI18N
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnEdit)
                    .addComponent(btnBatal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        if (btnTambah.getText().equals("Tambah")) {
            Enabled(true);
            kosongkanText();
            txtKelas.requestFocusInWindow();
            btnTambah.setText("Simpan");
        } else if (btnTambah.getText().equals("Simpan")) {
            if (txtNmKelas.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Isi Semua Data", "Peringatan", JOptionPane.ERROR_MESSAGE);
            } else {
                String kode = null, nama=null;
                List<Kelas> k = KRS.getKelasService().getKelasByKode(txtKelas.getText());
                for (Kelas k1 : k) {
                    kode = k1.getKd_kelas();
                    nama = k1.getNama();
                }
                if (kode == null) {
                    this.SimpanData();
                statusAwal();
                }else{
                    JOptionPane.showConfirmDialog(InputKelas.this, "Kode sudah terdaftar","Peringatan",JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }
}//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed

        if (kelas != null) {
            KRS.getKelasService().delete(kelas);
            statusAwal();
            JOptionPane.showMessageDialog(this, "Berhasil");
            kosongkanText();
            statusAwal();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal!!!");
//            }
        }
}//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (btnEdit.getText().equals("Edit")) {
            btnEdit.setText("Simpan");
            btnHapus.setEnabled(false);
            Enabled(true);
            txtKelas.requestFocusInWindow();
        } else if (btnEdit.getText().equals("Simpan")) {
            SimpanData();
            statusAwal();
        }
}//GEN-LAST:event_btnEditActionPerformed
    void Enabled(Boolean b) {
        txtAkad.setEnabled(b);
        txtKelas.setEnabled(b);
        txtNmKelas.setEnabled(b);
        cmbPemb.setEnabled(b);
    }
    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        this.statusAwal();
}//GEN-LAST:event_btnBatalActionPerformed

    private void tableMkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMkMouseClicked
        // TODO add your handling code here:
        klikTable();
        btnHapus.setEnabled(true);
        btnEdit.setEnabled(true);
        btnTambah.setEnabled(false);
    }//GEN-LAST:event_tableMkMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox cmbPemb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.apotik.widget.Panel panel1;
    private javax.swing.JTable tableMk;
    private javax.swing.JTextField txtAkad;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNmKelas;
    // End of variables declaration//GEN-END:variables

    private void SimpanData() {
        if (kelas == null) {
            kelas = new Kelas();
        }
        kelas.setKd_kelas(txtKelas.getText());
        kelas.setNama(txtNmKelas.getText());
        kelas.setPembimbing(cmbPemb.getSelectedItem().toString());
        kelas.setTakad(txtAkad.getText());
        KRS.getKelasService().insert(kelas);

        kelas = new Kelas();
//To change body of generated methods, choose Tools | Templates.
    }
}
