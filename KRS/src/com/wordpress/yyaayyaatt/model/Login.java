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
@Table(name = "login")
public class Login implements Serializable {

    @Id@GeneratedValue
    @Column(name = "id")
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "mahasiswa")
    private Mahasiswa mahasiswa;
    
    @ManyToOne
    @JoinColumn(name = "dosen")
    private Dosen dosen;

    @Column(name = "users")
    private String users;

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private int status;

    @Column(name = "ua")
    private int ua;

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUa() {
        return ua;
    }

    public void setUa(int ua) {
        this.ua = ua;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

}
