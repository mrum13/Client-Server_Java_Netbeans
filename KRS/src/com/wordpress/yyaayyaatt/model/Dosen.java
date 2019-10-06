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
 * @author bahrie
 */
@Entity
@Table(name = "Dosen")
public class Dosen implements Serializable {

    @Id@GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "kd_dosen")
    private String kd_dosen;
    
    @Column(name = "nipy")
    private String nipy;
    
    @Column(name = "dosen")
    private String dosen;
    
    @Column(name = "pwd")
    private String pwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNipy() {
        return nipy;
    }

    public void setNipy(String nipy) {
        this.nipy = nipy;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getKd_dosen() {
        return kd_dosen;
    }

    public void setKd_dosen(String kd_dosen) {
        this.kd_dosen = kd_dosen;
    }
}
