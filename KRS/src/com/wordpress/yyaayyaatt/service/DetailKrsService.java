/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service;

import com.wordpress.yyaayyaatt.model.DetailKrs;
import java.util.List;

/**
 *
 * @author bahrie
 */
public interface DetailKrsService {

    void insert(DetailKrs a);

    void delete(DetailKrs a);

    List<DetailKrs> getAll();

    List<DetailKrs> getDetailKrsByKdMk(String a);

    List<DetailKrs> getDetailKrsBySemester(int id, String semester);

    List<DetailKrs> getDetailKrsById(int id);
    
    DetailKrs getID(Integer a);
}
