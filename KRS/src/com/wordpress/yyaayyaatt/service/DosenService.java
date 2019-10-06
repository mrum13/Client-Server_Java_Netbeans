/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service;

import com.wordpress.yyaayyaatt.model.Dosen;
import java.util.List;

/**
 *
 * @author bahrie
 */
public interface DosenService {

    void insert(Dosen a);

    void delete(Dosen a);

    List<Dosen> getAll();

    List<Dosen> getDosenByKode(String a);

    List<Dosen> getDosenByNipy(String a);

    List<Dosen> getDosenByNama(String a);

    List<Dosen> getCari(String cari);

    Dosen getDosen(int a);
}
