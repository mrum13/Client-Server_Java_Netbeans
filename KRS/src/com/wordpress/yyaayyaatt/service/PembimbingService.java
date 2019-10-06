/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service;

import com.wordpress.yyaayyaatt.model.Pembimbing;
import java.util.List;

/**
 *
 * @author bahrie
 */
public interface PembimbingService {


    void insert(Pembimbing a);

    void delete(Pembimbing a);

    List<Pembimbing> getAll();

    List<Pembimbing> getPembimbingByKode(String a);
    List<Pembimbing> getPembimbingByKelas(String a);
    
    List<Pembimbing> getCari(String cari);
    
    Pembimbing getPembimbing(String a);
    Pembimbing getID(int id);
}
