/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author agoes
 */
@Entity
@Table(name = "Kelas")
public class Kelas implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", length = 10, nullable = false, unique = true)
    private int id;
    @Column(name = "kd_kelas")
    private String kd_kelas;

    @Column(name = "nama")
    private String nama;

    @Column(name = "takad")
    private String takad;

    @Column(name = "pembimbing")
    private String pembimbing;

    public String getPembimbing() {
        return pembimbing;
    }

    public void setPembimbing(String pembimbing) {
        this.pembimbing = pembimbing;
    }

    public String getKd_kelas() {
        return kd_kelas;
    }

    public void setKd_kelas(String kd_kelas) {
        this.kd_kelas = kd_kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTakad() {
        return takad;
    }

    public void setTakad(String takad) {
        this.takad = takad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
