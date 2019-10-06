/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service.impl;

import com.wordpress.yyaayyaatt.dao.PembimbingDAO;
import com.wordpress.yyaayyaatt.model.Pembimbing;
import com.wordpress.yyaayyaatt.service.PembimbingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author agoes
 */

@Service("pembimbingService")
@Transactional(readOnly=true)
public class PembimbingServiceImpl implements PembimbingService {

    @Autowired
    private PembimbingDAO pembimbingDAO;
    @Transactional(readOnly=false)
    public void insert(Pembimbing a){
        pembimbingDAO.save(a);
    }

    @Transactional(readOnly=false)
    public void delete(Pembimbing a){
        pembimbingDAO.delete(a);
    }

    @Override
    public List<Pembimbing> getAll() {
        return pembimbingDAO.getAll();
    }

    @Override
    public List<Pembimbing> getCari(String cari) {
        return pembimbingDAO.getCari(cari);
    }

    @Override
    public Pembimbing getPembimbing(String a) {
        return pembimbingDAO.getById(a);
    }

    @Override
    public List<Pembimbing> getPembimbingByKode(String a) {
        return pembimbingDAO.getPembimbingByKode(a);
    }

    @Override
    public List<Pembimbing> getPembimbingByKelas(String a) {
    //To change body of generated methods, choose Tools | Templates.
        return pembimbingDAO.getPembimbingByKelas(a);
    }

    @Override
    public Pembimbing getID(int id) {
        return pembimbingDAO.getID(id); //To change body of generated methods, choose Tools | Templates.
    }
}
