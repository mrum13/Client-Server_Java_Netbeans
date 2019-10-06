/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author bahrie
 */
@Entity
@Table(name = "Mahasiswa")
public class Mahasiswa implements Serializable {

    @Id@GeneratedValue
    @Column(name = "id")
    private int id;
    
    @Column(name = "nim")
    private String nim;
    
    @Column(name = "nama")
    private String nama;
    
    @Column(name = "kelas")
    private String kelas;
    
    @Column(name = "tgllahir")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tgllahir;
    
    @Column(name = "jk")
    private String jk;
    
    @Column(name = "asalsek")
    private String asalsek;
    
    @Column(name = "foto")
    private String foto;
    
    @Column(name = "thnmasuk")
    private int thnmasuk;
    
    @Column(name = "jumlah_krs")
    private int jumlah_krs;
    
    @Column(name = "pwd")
    private String pwd;
    
    @Column(name = "status")
    private int status;

    public int getId() {
        return id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(Date tgllahir) {
        this.tgllahir = tgllahir;
    }


    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getJumlah_krs() {
        return jumlah_krs;
    }

    public void setJumlah_krs(int jumlah_krs) {
        this.jumlah_krs = jumlah_krs;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
//
//    public String getTgllahir() {
//        return tgllahir;
//    }
//
//    public void setTgllahir(String tgllahir) {
//        this.tgllahir = tgllahir;
//    }

//    public Date getTgllahir() {
//        return tgllahir;
//    }
//
//    public void setTgllahir(Date tgllahir) {
//        this.tgllahir = tgllahir;
//    }
    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAsalsek() {
        return asalsek;
    }

    public void setAsalsek(String asalsek) {
        this.asalsek = asalsek;
    }

    public int getThnmasuk() {
        return thnmasuk;
    }

    public void setThnmasuk(int thnmasuk) {
        this.thnmasuk = thnmasuk;
    }

}
