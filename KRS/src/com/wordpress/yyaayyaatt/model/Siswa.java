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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author agoes
 */
@Entity
@Table(name = "Siswa")
public class Siswa implements Serializable{
    //Data Siswa 
    @Id
    @Column(name = "no_induk",length = 10, nullable = false, unique = true)
    private String no_induk;
    
    @Column(name="id_anggota")
    private String id_anggota;
    
    @Column(name = "nisn",length = 100, nullable = false)
    private String nisn;
    
    @Column(name = "nm_lengkap",length = 100, nullable = false)
    private String nm_lengkap;
    
    @Column(name = "nm_panggilan",length = 100, nullable = false)
    private String nm_panggilan;
    
    @Column(name = "tmpt_lhr",length = 100, nullable = false)
    private String tmpt_lhr;
    
     @Column(name = "tgl_lhr")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tgl_lhr;
    
    @Column(name = "jk")
    private String jk;
    
    @Column(name = "kelas")
    private String kelas;
    
    @Column(name = "jurusan")
    private String jurusan;
    
    @Column(name = "alamat",length = 100, nullable = false)
    private String alamat;
    
    @Column(name = "no_telp")
    private String no_telp;
    
    @Column(name = "agama")
    private String agama;
    
    @Column(name = "anakke")
    private String anakke;
    
    @Column(name = "jml_saudara")
    private int jml_saudara;
    
    @Column(name = "status",length = 100, nullable = false)
    private String status;

    @Column(name = "thn_akademik")
    private String thn_akademik;

    @Column(name = "thn_masuk")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date thn_masuk;

    @Column(name = "asal_sek",length = 100, nullable = false)
    private String asal_sek;
    
    @Column(name = "thn_lulus")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date thn_lulus;
    
    @Column(name = "lm_bljr")
    private String lm_bljr;
    
    @Column(name = "nm_ibu",length = 100, nullable = false)
    private String nm_ibu;
    
    @Column(name = "tmpt_lhr_ibu",length = 100, nullable = false)
    private String tmpt_lhr_ibu;
    
     @Column(name = "tgl_lhr_ibu")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tgl_lhr_ibu;
     
    @Column(name = "telp_ibu",length = 100)
    private String telp_ibu;
    
    @Column(name = "agama_ibu",length = 100)
    private String agama_ibu;
    
    @Column(name = "keadaan",length = 100)
    private String keadaan;
    
    @Column(name = "pddkan_ibu",length = 100)
    private String pddkan_ibu;
     
    @Column(name = "krj_ibu",length = 100)
    private String krj_ibu;
    
    @Column(name = "hasil",length = 100)
    private String hasil;
    
    @Column(name = "goldar",length = 100)
    private String goldar;
    
    @Column(name = "t_berat",length = 100)
    private String t_berat;
    
    @Column(name = "dari_scol",length = 100)
    private String dari_scol;
    
    @Column(name = "thn_pindah",length = 100)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date thn_pindah;
    
    @Column(name = "masuk_ke",length = 100)
    private String masuk_ke;
    
    
    @Column(name = "foto",length = 100, nullable = false)
    private String foto;
    public Siswa() {
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNo_induk() {
        return no_induk;
    }

    public void setNo_induk(String no_induk) {
        this.no_induk = no_induk;
    }

    public String getNisn() {
        return nisn;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
    }

    

    public String getNm_lengkap() {
        return nm_lengkap;
    }

    public void setNm_lengkap(String nm_lengkap) {
        this.nm_lengkap = nm_lengkap;
    }

    public String getNm_panggilan() {
        return nm_panggilan;
    }

    public void setNm_panggilan(String nm_panggilan) {
        this.nm_panggilan = nm_panggilan;
    }

    public String getTmpt_lhr() {
        return tmpt_lhr;
    }

    public void setTmpt_lhr(String tmpt_lhr) {
        this.tmpt_lhr = tmpt_lhr;
    }

    public Date getTgl_lhr() {
        return tgl_lhr;
    }

    public void setTgl_lhr(Date tgl_lhr) {
        this.tgl_lhr = tgl_lhr;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(String id_anggota) {
        this.id_anggota = id_anggota;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getAnakke() {
        return anakke;
    }

    public void setAnakke(String anakke) {
        this.anakke = anakke;
    }

    public int getJml_saudara() {
        return jml_saudara;
    }

    public void setJml_saudara(int jml_saudara) {
        this.jml_saudara = jml_saudara;
    }

    public String getThn_akademik() {
        return thn_akademik;
    }

    public void setThn_akademik(String thn_akademik) {
        this.thn_akademik = thn_akademik;
    }


    public Date getThn_masuk() {
        return thn_masuk;
    }

    public void setThn_masuk(Date thn_masuk) {
        this.thn_masuk = thn_masuk;
    }

    public String getAsal_sek() {
        return asal_sek;
    }

    public void setAsal_sek(String asal_sek) {
        this.asal_sek = asal_sek;
    }

    public Date getThn_lulus() {
        return thn_lulus;
    }

    public void setThn_lulus(Date thn_lulus) {
        this.thn_lulus = thn_lulus;
    }

    public String getLm_bljr() {
        return lm_bljr;
    }

    public void setLm_bljr(String lm_bljr) {
        this.lm_bljr = lm_bljr;
    }

    public String getNm_ibu() {
        return nm_ibu;
    }

    public void setNm_ibu(String nm_ibu) {
        this.nm_ibu = nm_ibu;
    }

    public String getTmpt_lhr_ibu() {
        return tmpt_lhr_ibu;
    }

    public void setTmpt_lhr_ibu(String tmpt_lhr_ibu) {
        this.tmpt_lhr_ibu = tmpt_lhr_ibu;
    }

    public Date getTgl_lhr_ibu() {
        return tgl_lhr_ibu;
    }

    public void setTgl_lhr_ibu(Date tgl_lhr_ibu) {
        this.tgl_lhr_ibu = tgl_lhr_ibu;
    }

    public String getTelp_ibu() {
        return telp_ibu;
    }

    public void setTelp_ibu(String telp_ibu) {
        this.telp_ibu = telp_ibu;
    }

    public String getAgama_ibu() {
        return agama_ibu;
    }

    public void setAgama_ibu(String agama_ibu) {
        this.agama_ibu = agama_ibu;
    }

    public String getKeadaan() {
        return keadaan;
    }

    public void setKeadaan(String keadaan) {
        this.keadaan = keadaan;
    }

    public String getPddkan_ibu() {
        return pddkan_ibu;
    }

    public void setPddkan_ibu(String pddkan_ibu) {
        this.pddkan_ibu = pddkan_ibu;
    }

    public String getKrj_ibu() {
        return krj_ibu;
    }

    public void setKrj_ibu(String krj_ibu) {
        this.krj_ibu = krj_ibu;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    public String getGoldar() {
        return goldar;
    }

    public void setGoldar(String goldar) {
        this.goldar = goldar;
    }

    public String getT_berat() {
        return t_berat;
    }

    public void setT_berat(String t_berat) {
        this.t_berat = t_berat;
    }

    public String getDari_scol() {
        return dari_scol;
    }

    public void setDari_scol(String dari_scol) {
        this.dari_scol = dari_scol;
    }

    public Date getThn_pindah() {
        return thn_pindah;
    }

    public void setThn_pindah(Date thn_pindah) {
        this.thn_pindah = thn_pindah;
    }

    public String getMasuk_ke() {
        return masuk_ke;
    }

    public void setMasuk_ke(String masuk_ke) {
        this.masuk_ke = masuk_ke;
    }
    
    
}
