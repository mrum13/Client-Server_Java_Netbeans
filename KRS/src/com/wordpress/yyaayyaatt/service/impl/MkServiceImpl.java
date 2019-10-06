/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service.impl;

import com.wordpress.yyaayyaatt.dao.MkDAO;
import com.wordpress.yyaayyaatt.model.Mk;
import com.wordpress.yyaayyaatt.service.MkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author agoes
 */

@Service("mkService")
@Transactional(readOnly=true)
public class MkServiceImpl implements MkService {

    @Autowired
    private MkDAO mkDAO;
    @Transactional(readOnly=false)
    public void insert(Mk a){
        mkDAO.save(a);
    }

    @Transactional(readOnly=false)
    public void delete(Mk a){
        mkDAO.delete(a);
    }

    @Override
    public List<Mk> getAll() {
        return mkDAO.getAll();
    }

    @Override
    public List<Mk> getCari(String cari) {
        return mkDAO.getCari(cari);
    }

    @Override
    public Mk getID(int a) {
        return mkDAO.getID(a);
    }

    @Override
    public List<Mk> getMkByKode(String a) {
        return mkDAO.getMkByKode(a);
    }

    @Override
    public List<Mk> getMkBySks(String a) {
        return mkDAO.getMkBySks(a);
    }

    @Override
    public List<Mk> getMkByTakad(String a) {
        return mkDAO.getMkByTakad(a);
    }

    @Override
    public List<Mk> getMkByDosen(String a) {
        return mkDAO.getMkByDosen(a);
    }
}
