/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service.impl;

import com.wordpress.yyaayyaatt.dao.DosenDAO;
import com.wordpress.yyaayyaatt.model.Dosen;
import com.wordpress.yyaayyaatt.service.DosenService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author agoes
 */

@Service("dosenService")
@Transactional(readOnly=true)
public class DosenServiceImpl implements DosenService {

    @Autowired
    private DosenDAO dosenDAO;
    @Transactional(readOnly=false)
    public void insert(Dosen a){
        dosenDAO.save(a);
    }

    @Transactional(readOnly=false)
    public void delete(Dosen a){
        dosenDAO.delete(a);
    }

    @Override
    public List<Dosen> getAll() {
        return dosenDAO.getAll();
    }

    @Override
    public List<Dosen> getCari(String cari) {
        return dosenDAO.getCari(cari);
    }

    @Override
    public Dosen getDosen(int a) {
        return dosenDAO.getID(a);
    }

    @Override
    public List<Dosen> getDosenByKode(String a) {
        return dosenDAO.getDosenByKode(a);
    }

    @Override
    public List<Dosen> getDosenByNipy(String a) {
        return dosenDAO.getDosenByNipy(a);
    }

    @Override
    public List<Dosen> getDosenByNama(String a) {
        return dosenDAO.getDosenByNama(a);
    }
}
