/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service;

import com.wordpress.yyaayyaatt.model.Mk;
import java.util.List;

/**
 *
 * @author bahrie
 */
public interface MkService {

    void insert(Mk a);
    void delete(Mk a);
    List<Mk> getAll();
    List<Mk> getMkByKode(String a);
    List<Mk> getMkBySks(String a);
    List<Mk> getMkByTakad(String a);
    List<Mk> getMkByDosen(String a);
    List<Mk> getCari(String cari);
    Mk getID(int a);
}
