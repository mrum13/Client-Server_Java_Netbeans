/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author bahrie
 */
@Entity
@Table(name = "WaktuKrs")
public class WaktuKrs implements Serializable {

    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "id_wktu")
    private String id_wktu;
    
    @Column(name = "semester")
    private String semester;
    
    @Column(name = "ta")
    private String ta;
    
    @Column(name = "tanggal_pengisian")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggal_pengisian;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_wktu() {
        return id_wktu;
    }

    public void setId_wktu(String id_wktu) {
        this.id_wktu = id_wktu;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getTa() {
        return ta;
    }

    public void setTa(String ta) {
        this.ta = ta;
    }

    public Date getTanggal_pengisian() {
        return tanggal_pengisian;
    }

    public void setTanggal_pengisian(Date tanggal_pengisian) {
        this.tanggal_pengisian = tanggal_pengisian;
    }
}
