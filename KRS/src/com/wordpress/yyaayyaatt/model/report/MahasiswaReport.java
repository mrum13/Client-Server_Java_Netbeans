/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wordpress.yyaayyaatt.model.report;

/**
 *
 * @author 085741161625
 */
public class MahasiswaReport {
    
    private String nim;
    private String nama;
    private int jumlah_krs;
    private String kelas;
    private String jk;
    private int thnmasuk;

    public int getThnmasuk() {
        return thnmasuk;
    }

    public void setThnmasuk(int thnmasuk) {
        this.thnmasuk = thnmasuk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah_krs() {
        return jumlah_krs;
    }

    public void setJumlah_krs(int jumlah_krs) {
        this.jumlah_krs = jumlah_krs;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

}
