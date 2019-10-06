/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service;

import com.wordpress.yyaayyaatt.model.WaktuKrs;
import java.util.List;

/**
 *
 * @author bahrie
 */
public interface WaktuKrsService {


    void insert(WaktuKrs a);

    void delete(WaktuKrs a);

    List<WaktuKrs> getAll();
    
    List<WaktuKrs> getCari(String cari);
    
    WaktuKrs getID(int a);
}
