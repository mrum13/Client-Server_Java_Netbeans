/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.JFrame;

import com.wordpress.yyaayyaatt.JIFrame.DosenIFrame;
import com.wordpress.yyaayyaatt.JIFrame.InputDosen;
import com.wordpress.yyaayyaatt.JIFrame.InputKelas;
import com.wordpress.yyaayyaatt.JIFrame.InputMhs;
import com.wordpress.yyaayyaatt.JIFrame.InputMk;
import com.wordpress.yyaayyaatt.JIFrame.InputPembimbing;
import com.wordpress.yyaayyaatt.JIFrame.InputUsers;
import com.wordpress.yyaayyaatt.JIFrame.MahasiswaJIFrame;
import com.wordpress.yyaayyaatt.JIFrame.report.JIFKRSReport;
import com.wordpress.yyaayyaatt.JIFrame.report.JIFMKReport;
import com.wordpress.yyaayyaatt.JIFrame.report.JIFMahasiswaReport;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Mr.Blue
 */
public class MainMenu extends javax.swing.JFrame {

    LoginDialog ld;
    int klik = 0;

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        setExtendedState(MainMenu.MAXIMIZED_BOTH);
        Timer digitalClock = new Timer(100, trigerClock);
        digitalClock.start();
        klikButton(klik);
        if (ld.uacess == 20) {
            setTitle("Form Pengecekan KRS, Selamat Datang .:: "+ld.nama+" ::.");
            jMenu2.setVisible(false);
            jMenu4.setVisible(false);
            lblStatus.setText(ld.nama+"    ");
        } else if (ld.uacess == 30) {
            setTitle("Form Pengisian KRS, Selamat Datang .:: "+ld.nama+" ::.");
            lblStatus.setText("Nama : "+ld.nama+" Kelas : "+ld.kelas+" Total SKS : "+ld.sks+"    ");
            jMenu2.setVisible(false);
            jMenu3.setVisible(false);
        } else{
            setTitle("Anda Login Sebagai Administrator .:: "+ld.nama+" ::.");
            lblStatus.setText(ld.nama+"    ");
        }
    }
    ActionListener trigerClock = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            SimpleDateFormat hari = new SimpleDateFormat("EEEEEEE, dd MMMMMMMMM yyyy");
            SimpleDateFormat jam = new SimpleDateFormat("HH:mm:ss");
            String jam2 = jam.format(new Date());
            String hari2 = hari.format(new Date());
            lblJam.setText(jam2+" - "+hari2+"   ");
        }
    };

    void klikButton(int klik) {
        if (klik == 0) {
            btnLogout.setVisible(true);
            btnClose.setVisible(false);
            btnDosen.setVisible(false);
            btnMasterDosen.setVisible(false);
            btnMasterKelas.setVisible(false);
            btnMasterMhs.setVisible(false);
            btnMasterMk.setVisible(false);
            btnMasterPemb.setVisible(false);
            btnMasterUsers.setVisible(false);
            btnLap.setVisible(false);
            btnLapMhs.setVisible(false);
            btnLapMk.setVisible(false);
            btnMahasiswa.setVisible(false);

        } else if (klik == 1) {
            btnLogout.setVisible(true);
            btnClose.setVisible(true);

            btnDosen.setVisible(false);
            btnMasterDosen.setVisible(false);
            btnMasterKelas.setVisible(false);
            btnMasterMhs.setVisible(false);
            btnMasterMk.setVisible(false);
            btnMasterPemb.setVisible(false);
            btnMasterUsers.setVisible(false);
            btnLap.setVisible(false);
            btnLapMhs.setVisible(false);
            btnLapMk.setVisible(false);
            btnMahasiswa.setVisible(false);

            jMenu1.setSelected(true);
            jMenu2.setSelected(false);
            jMenu3.setSelected(false);
            jMenu4.setSelected(false);
            jMenu5.setSelected(false);

        } else if (klik == 2) {
            btnMasterDosen.setVisible(true);
            btnMasterKelas.setVisible(true);
            btnMasterMhs.setVisible(true);
            btnMasterMk.setVisible(true);
            btnMasterPemb.setVisible(true);
            btnMasterUsers.setVisible(true);

            btnDosen.setVisible(false);
            btnLap.setVisible(false);
            btnLapMhs.setVisible(false);
            btnLapMk.setVisible(false);
            btnMahasiswa.setVisible(false);
            btnLogout.setVisible(false);
            btnClose.setVisible(false);

            jMenu1.setSelected(false);
            jMenu2.setSelected(true);
            jMenu3.setSelected(false);
            jMenu4.setSelected(false);
            jMenu5.setSelected(false);
            
        } else if (klik == 3) {
            btnDosen.setVisible(true);

            btnMasterDosen.setVisible(false);
            btnMasterKelas.setVisible(false);
            btnMasterMhs.setVisible(false);
            btnMasterMk.setVisible(false);
            btnMasterPemb.setVisible(false);
            btnMasterUsers.setVisible(false);
            btnLap.setVisible(false);
            btnLapMhs.setVisible(false);
            btnLapMk.setVisible(false);
            btnMahasiswa.setVisible(false);
            btnLogout.setVisible(false);
            btnClose.setVisible(false);

            jMenu1.setSelected(false);
            jMenu2.setSelected(false);
            jMenu3.setSelected(true);
            jMenu4.setSelected(false);
            jMenu5.setSelected(false);
            
        } else if (klik == 4) {
            btnMahasiswa.setVisible(true);

            btnDosen.setVisible(false);
            btnMasterDosen.setVisible(false);
            btnMasterKelas.setVisible(false);
            btnMasterMhs.setVisible(false);
            btnMasterMk.setVisible(false);
            btnMasterPemb.setVisible(false);
            btnMasterUsers.setVisible(false);
            btnLap.setVisible(false);
            btnLapMhs.setVisible(false);
            btnLapMk.setVisible(false);
            btnLogout.setVisible(false);
            btnClose.setVisible(false);

            jMenu1.setSelected(false);
            jMenu2.setSelected(false);
            jMenu3.setSelected(false);
            jMenu4.setSelected(true);
            jMenu5.setSelected(false);
            
        } else {
            btnLap.setVisible(true);
            btnLapMhs.setVisible(true);
            btnLapMk.setVisible(true);

            btnMahasiswa.setVisible(false);
            btnDosen.setVisible(false);
            btnMasterDosen.setVisible(false);
            btnMasterKelas.setVisible(false);
            btnMasterMhs.setVisible(false);
            btnMasterMk.setVisible(false);
            btnMasterPemb.setVisible(false);
            btnMasterUsers.setVisible(false);
            btnLogout.setVisible(false);
            btnClose.setVisible(false);
            
            jMenu1.setSelected(false);
            jMenu2.setSelected(false);
            jMenu3.setSelected(false);
            jMenu4.setSelected(false);
            jMenu5.setSelected(true);

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

        jPanelImage1 = new org.tm.container.JPanelImage();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        jToolBar1 = new javax.swing.JToolBar();
        btnMahasiswa = new com.apotik.widget.ButtonBig();
        btnDosen = new com.apotik.widget.ButtonBig();
        btnLap = new com.apotik.widget.ButtonBig();
        btnLapMhs = new com.apotik.widget.ButtonBig();
        btnLapMk = new com.apotik.widget.ButtonBig();
        btnMasterMhs = new com.apotik.widget.ButtonBig();
        btnMasterMk = new com.apotik.widget.ButtonBig();
        btnMasterDosen = new com.apotik.widget.ButtonBig();
        btnMasterPemb = new com.apotik.widget.ButtonBig();
        btnMasterKelas = new com.apotik.widget.ButtonBig();
        btnMasterUsers = new com.apotik.widget.ButtonBig();
        btnLogout = new com.apotik.widget.ButtonBig();
        btnClose = new com.apotik.widget.ButtonBig();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        lblStatus = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        lblKantor = new javax.swing.JLabel();
        jSplitPane3 = new javax.swing.JSplitPane();
        lblAlamat = new javax.swing.JLabel();
        lblJam = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KARTU RENCANA STUDI");
        setUndecorated(true);
        setResizable(false);

        jPanelImage1.setPosition(1);
        jPanelImage1.setWallpaper(new javax.swing.ImageIcon(getClass().getResource("/krs/immg.jpg"))); // NOI18N
        jPanelImage1.setLayout(new java.awt.BorderLayout());

        panelGlass1.setRound(false);

        jToolBar1.setFloatable(false);
        jToolBar1.setOpaque(false);

        btnMahasiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/social_cc_bcc.png"))); // NOI18N
        btnMahasiswa.setText("Pengisian");
        btnMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMahasiswaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMahasiswa);

        btnDosen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/social_person.png"))); // NOI18N
        btnDosen.setText("Cek");
        btnDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosenActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDosen);

        btnLap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/collections_view_as_list.png"))); // NOI18N
        btnLap.setText("KRS");
        btnLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLap);

        btnLapMhs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/collections_view_as_list.png"))); // NOI18N
        btnLapMhs.setText("Mahasiswa");
        btnLapMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapMhsActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLapMhs);

        btnLapMk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/collections_view_as_list.png"))); // NOI18N
        btnLapMk.setText("Mata Kuliah");
        btnLapMk.setFocusable(false);
        btnLapMk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapMkActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLapMk);

        btnMasterMhs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/social_cc_bcc.png"))); // NOI18N
        btnMasterMhs.setText("Mahasiswa");
        btnMasterMhs.setFocusable(false);
        btnMasterMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasterMhsActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMasterMhs);

        btnMasterMk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/device_access_storage.png"))); // NOI18N
        btnMasterMk.setText("Mata Kuliah");
        btnMasterMk.setFocusable(false);
        btnMasterMk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasterMkActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMasterMk);

        btnMasterDosen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/social_person.png"))); // NOI18N
        btnMasterDosen.setText("Dosen");
        btnMasterDosen.setFocusable(false);
        btnMasterDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasterDosenActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMasterDosen);

        btnMasterPemb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/social_group.png"))); // NOI18N
        btnMasterPemb.setText("Pembimbing");
        btnMasterPemb.setFocusable(false);
        btnMasterPemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasterPembActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMasterPemb);

        btnMasterKelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/hardware_computer.png"))); // NOI18N
        btnMasterKelas.setText("Kelas");
        btnMasterKelas.setFocusable(false);
        btnMasterKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasterKelasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMasterKelas);

        btnMasterUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/social_cc_bcc.png"))); // NOI18N
        btnMasterUsers.setText("Users");
        btnMasterUsers.setFocusable(false);
        btnMasterUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasterUsersActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMasterUsers);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/device_access_secure.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setFocusable(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLogout);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/social_cc_bcc.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.setFocusable(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jToolBar1.add(btnClose);

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanelImage1.add(panelGlass1, java.awt.BorderLayout.PAGE_START);

        jDesktopPane1.setOpaque(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        jPanelImage1.add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        lblStatus.setText("jLabel1");
        jSplitPane1.setLeftComponent(lblStatus);

        lblKantor.setText("Kampus: Politeknik Harapan Bersama Tegal");
        jSplitPane2.setLeftComponent(lblKantor);

        lblAlamat.setText("Alamat: Jln. Dewi Sartika no. 71 Tegal Telp. (0283) 350567");
        jSplitPane3.setLeftComponent(lblAlamat);

        lblJam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJam.setText("jLabel7");
        jSplitPane3.setRightComponent(lblJam);

        jSplitPane2.setRightComponent(jSplitPane3);

        jSplitPane1.setRightComponent(jSplitPane2);

        jMenu1.setText("File");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Master");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Dosen");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Mahasiswa");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Report");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE))
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosenActionPerformed
        // TODO add your handling code here:
        DosenIFrame d = new DosenIFrame(ld.dosen);
        jDesktopPane1.add(d);
        d.setVisible(true);
    }//GEN-LAST:event_btnDosenActionPerformed

    private void btnMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMahasiswaActionPerformed
        // TODO add your handling code here:
        MahasiswaJIFrame j = new MahasiswaJIFrame(ld.nim);
        jDesktopPane1.add(j);
        j.setVisible(true);
    }//GEN-LAST:event_btnMahasiswaActionPerformed

    private void btnLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapActionPerformed
        // TODO add your handling code here:
        JIFKRSReport a = new JIFKRSReport();
        jDesktopPane1.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_btnLapActionPerformed

    private void btnLapMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapMhsActionPerformed
        // TODO add your handling code here:
        JIFMahasiswaReport a = new JIFMahasiswaReport();
        jDesktopPane1.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_btnLapMhsActionPerformed

    private void btnLapMkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapMkActionPerformed
        // TODO add your handling code here:
        JIFMKReport l = new JIFMKReport();
        jDesktopPane1.add(l);
        l.setVisible(true);
    }//GEN-LAST:event_btnLapMkActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        klik = 3;
        klikButton(klik);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void btnMasterMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasterMhsActionPerformed
        // TODO add your handling code here:
        InputMhs i = new InputMhs();
        jDesktopPane1.add(i);
        i.setVisible(true);
    }//GEN-LAST:event_btnMasterMhsActionPerformed

    private void btnMasterMkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasterMkActionPerformed
        // TODO add your handling code here:
        InputMk a = new InputMk();
        jDesktopPane1.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_btnMasterMkActionPerformed

    private void btnMasterDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasterDosenActionPerformed
        // TODO add your handling code here:
        InputDosen id = new InputDosen();
        jDesktopPane1.add(id);
        id.setVisible(true);
    }//GEN-LAST:event_btnMasterDosenActionPerformed

    private void btnMasterPembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasterPembActionPerformed
        // TODO add your handling code here:
        InputPembimbing i = new InputPembimbing();
        jDesktopPane1.add(i);
        i.setVisible(true);
    }//GEN-LAST:event_btnMasterPembActionPerformed

    private void btnMasterKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasterKelasActionPerformed
        // TODO add your handling code here:
        InputKelas l = new InputKelas();
        jDesktopPane1.add(l);
        l.setVisible(true);
    }//GEN-LAST:event_btnMasterKelasActionPerformed

    private void btnMasterUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasterUsersActionPerformed
        // TODO add your handling code here:
        InputUsers a = new InputUsers();
        jDesktopPane1.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_btnMasterUsersActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        klik = 1;
        klikButton(klik);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        klik = 2;
        klikButton(klik);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        klik = 4;
        klikButton(klik);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        klik = 5;
        klikButton(klik);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int y = JOptionPane.showConfirmDialog(MainMenu.this, "Ingin keluar dari Akun anda?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        System.out.println("y = " + y);
        if (y == 0) {
        dispose();
        LoginDialog l = new LoginDialog(this, rootPaneCheckingEnabled);
        l.setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        int y = JOptionPane.showConfirmDialog(MainMenu.this, "Yakin ingin keluar dari Aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        System.out.println("y = " + y);
        if (y == 0) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apotik.widget.ButtonBig btnClose;
    private com.apotik.widget.ButtonBig btnDosen;
    private com.apotik.widget.ButtonBig btnLap;
    private com.apotik.widget.ButtonBig btnLapMhs;
    private com.apotik.widget.ButtonBig btnLapMk;
    private com.apotik.widget.ButtonBig btnLogout;
    private com.apotik.widget.ButtonBig btnMahasiswa;
    private com.apotik.widget.ButtonBig btnMasterDosen;
    private com.apotik.widget.ButtonBig btnMasterKelas;
    private com.apotik.widget.ButtonBig btnMasterMhs;
    private com.apotik.widget.ButtonBig btnMasterMk;
    private com.apotik.widget.ButtonBig btnMasterPemb;
    private com.apotik.widget.ButtonBig btnMasterUsers;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private org.tm.container.JPanelImage jPanelImage1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblJam;
    private javax.swing.JLabel lblKantor;
    private javax.swing.JLabel lblStatus;
    private usu.widget.glass.PanelGlass panelGlass1;
    // End of variables declaration//GEN-END:variables
}
