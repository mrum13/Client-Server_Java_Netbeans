/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service;

import com.wordpress.yyaayyaatt.model.Kelas;
import java.util.List;

/**
 *
 * @author bahrie
 */
public interface KelasService {

    void insert(Kelas a);

    void delete(Kelas a);

    List<Kelas> getAll();

    List<Kelas> getKelasByKode(String a);
    
    Kelas getKelasByDosen(String a);

    List<Kelas> getCari(String cari);

    Kelas getKelas(Integer a);
}
