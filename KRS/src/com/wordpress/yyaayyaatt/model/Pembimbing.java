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
import javax.persistence.Table;

/**
 *
 * @author acer3250
 */
@Entity
@Table(name = "pembimbing")
public class Pembimbing implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    
    @Column(name = "kode_pembimbing", length = 10, nullable = false, unique = true)
    private String kode_pembimbing;
    
    @Column(name = "dosen")
    private String dosen;
    
    public String getKode_pembimbing() {
        return kode_pembimbing;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKode_pembimbing(String kode_pembimbing) {
        this.kode_pembimbing = kode_pembimbing;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }
}
