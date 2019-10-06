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
 * @author bahrie
 */
@Entity
@Table(name = "Mk")
public class Mk implements Serializable {

    @Id@GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "kd_mk")
    private String kd_mk;
    @Column(name = "mk")
    private String mk;
    @Column(name = "sks")
    private int sks;
    @Column(name = "takad")
    private String takad;
    @ManyToOne
    @JoinColumn(name = "kd_dosen")
    private Dosen dosen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getTakad() {
        return takad;
    }

    public void setTakad(String takad) {
        this.takad = takad;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }


    public String getKd_mk() {
        return kd_mk;
    }

    public void setKd_mk(String kd_mk) {
        this.kd_mk = kd_mk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
