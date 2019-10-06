/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InputMhs.java
 *
 * Created on Oct 19, 2010, 7:43:53 PM
 */
package com.wordpress.yyaayyaatt.JIFrame;

import com.wordpress.yyaayyaatt.model.Dosen;
import com.wordpress.yyaayyaatt.model.Kelas;
import com.wordpress.yyaayyaatt.model.Mahasiswa;
import com.wordpress.yyaayyaatt.model.Pembimbing;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import krs.KRS;

/**
 *
 * @author bahrie
 */
public class InputMhs extends javax.swing.JInternalFrame {

    private List<Mahasiswa> mahasiswas = new ArrayList<Mahasiswa>();
    private List<Dosen> dosens = new ArrayList<Dosen>();
    private List<Kelas> kelases = new ArrayList<Kelas>();
    private List<Pembimbing> pembimbings = new ArrayList<Pembimbing>();
    private Kelas kelas;
    private Mahasiswa mahasiswa;
    Pembimbing pembimbing;
    int row;
    private Date date;
    private String file;

    /**
     * Creates new form InputMhs
     */
    public InputMhs() {
        initComponents();
        statusAwal();
    }

    void loadCmbKelas() {
        kelases = KRS.getKelasService().getAll();
//        cmbKelas.removeAllItems();
        for (Kelas kls : kelases) {
            cmbKelas.addItem(kls.getNama());
        }
    }
    void setIsitabel() {
        try {
            mahasiswas = KRS.getMahasiswaService().getAll();
            Object data[][] = new Object[mahasiswas.size()][5];
            int x = 0;
            for (Mahasiswa mahasiswa : mahasiswas) {
                data[x][0] = mahasiswa.getNim();
                data[x][1] = mahasiswa.getNama();
                data[x][2] = mahasiswa.getJumlah_krs();
                x++;
            }
            String[] judul = {"Nim", "Nama", "SKS"};
            tableMhs.setModel(new DefaultTableModel(data, judul));
            jScrollPane1.setViewportView(tableMhs);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    public static String implode(String[] arr_str) {
        StringBuilder sb = new StringBuilder();

        for (String s : arr_str) {

            sb.append(s);

        }

        return sb.toString();
    }

    void buatNim() {
        String thn = String.valueOf(yearChooser.getYear()).toString().substring(2, 4); //09 040 001
        String kdProdi = "040", nim;
        mahasiswas = KRS.getMahasiswaService().getAll();
        String data[] = new String[mahasiswas.size()];
        for (Mahasiswa mahasiswa : mahasiswas) {
            data[0] = mahasiswa.getNim();
        }
        String nimTerakhir = implode(data);
        System.out.println("nim terakhir :" + nimTerakhir);
        String hasilAkhir;
        if (nimTerakhir.isEmpty()) {
            nim = thn + kdProdi + "001";
            txtNim.setText(nim);
        } else {
            String id = nimTerakhir.substring(4, 8);
            System.out.println(id);
            Integer id1 = Integer.parseInt(id);
            id1 = id1 + 1;
            if (id1 < 10) {
                hasilAkhir = "00" + (String.valueOf(id1));
            } else if (id1 < 100) {
                hasilAkhir = "0" + (String.valueOf(id1));
            } else {
                hasilAkhir = String.valueOf(id1);
            }
            nim = thn + kdProdi + String.valueOf(hasilAkhir);
            txtNim.setText(nim);
        }

    }

    void kosongkanText() {
        txtNama.setText("");
        txtNim.setText("");
        txtPwd.setText("");
        txtFoto.setText("");
        dateChooser.setDate(new Date());
    }

    void enableForm(boolean b) {
        txtNama.setEnabled(b);
        txtNim.setEnabled(b);
        txtPwd.setEnabled(b);txtFoto.setEnabled(b);
        cmbAsalSek.setEnabled(b);
//        cmbBln.setEnabled(b);
        cmbJk.setEnabled(b);
//        cmbTgl.setEnabled(b);
//        cmbThn.setEnabled(b);
        dateChooser.setEnabled(b);
//        yearChooser.setEnabled(b);
        cmbKelas.setEnabled(b);
        
    }

    void isitext() {
        Mahasiswa mahasiswa = mahasiswas.get(row);
        txtNama.setText(mahasiswa.getNama());
        txtNim.setText(mahasiswa.getNim());
        cmbKelas.removeAllItems();
        for (Dosen dsn : dosens) {
            cmbKelas.addItem(dsn.getDosen());
        }
        txtPwd.setText(mahasiswa.getPwd());
    }

    void statusAwal() {
        this.kosongkanText();
        this.loadCmbKelas();
        this.enableForm(false);
        setIsitabel();
        render();
        btnTambah.setEnabled(true);
        btnEdit.setEnabled(false);
        btnHapus.setEnabled(false);
    }

    void simpanOrUpdate() {
        if (mahasiswa == null) {
            mahasiswa = new Mahasiswa();
        }
        mahasiswa.setNim(txtNim.getText());
        mahasiswa.setNama(txtNama.getText());
        mahasiswa.setAsalsek(cmbAsalSek.getSelectedItem().toString());
        mahasiswa.setKelas(cmbKelas.getSelectedItem().toString());
        mahasiswa.setTgllahir(dateChooser.getDate());
        mahasiswa.setJk(cmbJk.getSelectedItem().toString());
        mahasiswa.setPwd(txtPwd.getText());
        mahasiswa.setThnmasuk(yearChooser.getYear());
        mahasiswa.setFoto(txtFoto.getText());
        KRS.getMahasiswaService().insert(mahasiswa);
        this.statusAwal();
        mahasiswa = new Mahasiswa();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileBrowserImage1 = new usu.widget.FileBrowserImage();
        panel1 = new com.apotik.widget.Panel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMhs = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmbKelas = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        yearChooser = new com.toedter.calendar.JYearChooser();
        jPanel3 = new javax.swing.JPanel();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        resetBotton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cmbJk = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cmbAsalSek = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtFoto = new javax.swing.JPasswordField();
        cBox = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        pnlImage = new org.tm.container.JPanelImage();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Input Mahasiswa");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/report/logoPolForm.png"))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input Mahasiswa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        jPanel4.setOpaque(false);

        tableMhs.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMhs);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input Mahasiswa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        jPanel2.setOpaque(false);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kelas :");

        cmbKelas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbKelasItemStateChanged(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password :");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Thn. Masuk :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPwd)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(yearChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(yearChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        resetBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/exit.gif"))); // NOI18N
        resetBotton.setText("Batal");
        resetBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBottonActionPerformed(evt);
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
                .addComponent(resetBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnEdit)
                    .addComponent(resetBotton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input Mahasiswa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        jPanel1.setOpaque(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NIM :");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama :");

        cmbJk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pria", "Wanita" }));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Asal Sekolah :");

        cmbAsalSek.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SMA", "SMK", "SMEA", "SUPM", "Other" }));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tgl Lahir :");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jenis Kelamin :");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Foto :");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/search2.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtFoto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtFotoPropertyChange(evt);
            }
        });
        txtFoto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFotoKeyReleased(evt);
            }
        });

        cBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbAsalSek, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbJk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNim)
                    .addComponent(txtNama)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cBox)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbAsalSek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbJk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        pnlImage.setPosition(1);

        javax.swing.GroupLayout pnlImageLayout = new javax.swing.GroupLayout(pnlImage);
        pnlImage.setLayout(pnlImageLayout);
        pnlImageLayout.setHorizontalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );
        pnlImageLayout.setVerticalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        jPanel5.add(pnlImage, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 287, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        this.enableForm(true);
        if (mahasiswa != null) {
            KRS.getMahasiswaService().delete(mahasiswa);
            statusAwal();
            JOptionPane.showMessageDialog(this, "Hapus Sukses!!!");
        } else {
            JOptionPane.showMessageDialog(this, "Hapus Gagal!");
//            }
        }
}//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        this.enableForm(true);
        if (btnEdit.getText().equals("Edit")) {
            btnHapus.setEnabled(false);
            btnEdit.setText("Simpan");
            enableForm(true);
        } else if (btnEdit.getText().equals("Simpan")) {
            try {
                simpanOrUpdate();
                JOptionPane.showMessageDialog(this, "Edit Sukses");
                statusAwal();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(InputMhs.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.kosongkanText();
            this.enableForm(false);
            //kembali ke awal
            this.btnTambah.setEnabled(true);
            this.btnEdit.setText("Edit");
        }
}//GEN-LAST:event_btnEditActionPerformed

    private void resetBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBottonActionPerformed
        this.statusAwal();
        btnTambah.setText("Tambah");
}//GEN-LAST:event_resetBottonActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        if (btnTambah.getText().equals("Tambah")) {
            kosongkanText();
            this.enableForm(true);
            txtNim.setEnabled(false);
            txtNama.requestFocus();
            this.buatNim();
            btnTambah.setText("Simpan");
        } else if (btnTambah.getText().equals("Simpan")) {
            if (txtNim.getText().isEmpty()
                    && txtNama.getText().isEmpty()
                    && txtPwd.getText().isEmpty()) {
                JOptionPane.showMessageDialog(InputMhs.this, "Isi Semua Data!!!", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String nim = null, nama = null;
                List<Mahasiswa> m = KRS.getMahasiswaService().getMahasiswaByNim(txtNim.getText());
                for (Mahasiswa m1 : m) {
                    nim = m1.getNim();
                    nama = m1.getNama();
                }
                if(nim==null){
                simpanOrUpdate();
                btnTambah.setText("Tambah");
                }else{
                    JOptionPane.showMessageDialog(InputMhs.this, "NIM sudah terpakai oleh "+nama);
                    txtNim.requestFocusInWindow();
                }
            }
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void tableMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMhsMouseClicked
        // TODO add your handling code here:
        klikTable();
        txtFotoKeyReleased(null);
        btnTambah.setEnabled(false);
        btnEdit.setEnabled(true);
        btnHapus.setEnabled(true);
    }//GEN-LAST:event_tableMhsMouseClicked

    private void cmbKelasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbKelasItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKelasItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        fileBrowserImage1.setSelectedFile(null);
        fileBrowserImage1.showOpenDialog(this);
        file = fileBrowserImage1.getSelectedFile().toString();

        file = file.replace('\\', '/');
        txtFoto.setText(file);

        ImageIcon icon = new ImageIcon(file); // jangan lupa import class ImageIcon
        pnlImage.setWallpaper(icon);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFotoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFotoKeyReleased
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(txtFoto.getText());
        pnlImage.setWallpaper(icon);
    }//GEN-LAST:event_txtFotoKeyReleased

    private void txtFotoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtFotoPropertyChange
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(txtFoto.getText());
        pnlImage.setWallpaper(icon);
    }//GEN-LAST:event_txtFotoPropertyChange

    private void cBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cBoxItemStateChanged
        // TODO add your handling code here:
        if(cBox.isSelected()){
            txtNim.setEnabled(true);
            txtNim.requestFocusInWindow();
        }else{
            txtNim.setEnabled(false);
        }
    }//GEN-LAST:event_cBoxItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JCheckBox cBox;
    private javax.swing.JComboBox cmbAsalSek;
    private javax.swing.JComboBox cmbJk;
    private javax.swing.JComboBox cmbKelas;
    private com.toedter.calendar.JDateChooser dateChooser;
    private usu.widget.FileBrowserImage fileBrowserImage1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.apotik.widget.Panel panel1;
    private org.tm.container.JPanelImage pnlImage;
    private javax.swing.JButton resetBotton;
    private javax.swing.JTable tableMhs;
    private javax.swing.JPasswordField txtFoto;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JPasswordField txtPwd;
    private com.toedter.calendar.JYearChooser yearChooser;
    // End of variables declaration//GEN-END:variables
void klikTable() {
        if (tableMhs.getSelectedRow() >= 0) {
            mahasiswa = mahasiswas.get(tableMhs.getSelectedRow());
            mahasiswa = KRS.getMahasiswaService().getMahasiswa(mahasiswa.getId());
            System.out.print("mahasiswa = " + mahasiswa);
            loadModelToForm();
        }
    }

    private void loadModelToForm() {
        txtNim.setText(mahasiswa.getNim());
        txtNama.setText(mahasiswa.getNama());
        cmbAsalSek.setSelectedItem(mahasiswa.getAsalsek());
        dateChooser.setDate(mahasiswa.getTgllahir());
        cmbJk.setSelectedItem(mahasiswa.getJk());
        cmbKelas.setSelectedItem(mahasiswa.getKelas());
        txtPwd.setText(mahasiswa.getPwd());
        yearChooser.setYear(mahasiswa.getThnmasuk());
        txtFoto.setText(mahasiswa.getFoto());
    }
    
    private void render(){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );

            tableMhs.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            tableMhs.getColumnModel().getColumn(0).setPreferredWidth(8);
            tableMhs.getColumnModel().getColumn(1).setPreferredWidth(120);
            tableMhs.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            tableMhs.getColumnModel().getColumn(2).setPreferredWidth(8);
    }
}
