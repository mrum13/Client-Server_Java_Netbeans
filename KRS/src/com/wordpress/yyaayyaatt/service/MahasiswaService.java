/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service;

import com.wordpress.yyaayyaatt.model.Mahasiswa;
import java.util.List;

/**
 *
 * @author bahrie
 */
public interface MahasiswaService {


    void insert(Mahasiswa a);

    void delete(Mahasiswa a);

    List<Mahasiswa> getAll();

    List<Mahasiswa> getMahasiswaByNim(String a);

    List<Mahasiswa> getMahasiswaByKelas(String a);

    List<Mahasiswa> getMahasiswaByJk(String a);

    List<Mahasiswa> getMahasiswaByJurusan(String a);
    
    List<Mahasiswa> getCari(String cari);
    
    Mahasiswa getMahasiswa(int a);
    Mahasiswa getUsers(String user, String pass);
}
