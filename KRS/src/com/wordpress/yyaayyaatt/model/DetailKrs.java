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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author bahrie
 */
@Entity
@Table(name = "DetailKrs")
public class DetailKrs implements Serializable {

    @Id@GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "wktu")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date wktu;
    @ManyToOne
    @JoinColumn(name="nim")
    private Mahasiswa mahasiswa;
    @ManyToOne
    @JoinColumn(name = "kd_mk")
    private Mk mk;
    
    @Column(name = "semester")
    private String semester;

    public Date getWktu() {
        return wktu;
    }

    public void setWktu(Date wktu) {
        this.wktu = wktu;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Mk getMk() {
        return mk;
    }

    public void setMk(Mk mk) {
        this.mk = mk;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

}
