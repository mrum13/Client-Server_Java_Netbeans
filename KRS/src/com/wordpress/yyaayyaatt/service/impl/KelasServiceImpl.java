/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service.impl;

import com.wordpress.yyaayyaatt.dao.KelasDAO;
import com.wordpress.yyaayyaatt.model.Kelas;
import com.wordpress.yyaayyaatt.service.KelasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author agoes
 */

@Service("kelasService")
@Transactional(readOnly=true)
public class KelasServiceImpl implements KelasService {

    @Autowired
    private KelasDAO kelasDAO;
    @Transactional(readOnly=false)
    public void insert(Kelas a){
        kelasDAO.save(a);
    }

    @Transactional(readOnly=false)
    public void delete(Kelas a){
        kelasDAO.delete(a);
    }

    @Override
    public List<Kelas> getAll() {
        return kelasDAO.getAll();
    }
    
    @Override
    public List<Kelas> getCari(String cari) {
        return kelasDAO.getCari(cari);
    }

    @Override
    public Kelas getKelas(Integer a) {
        return kelasDAO.getKelas(a);
    }

    @Override
    public List<Kelas> getKelasByKode(String a) {
        return kelasDAO.getKelasByKode(a);
    }

    @Override
    public Kelas getKelasByDosen(String a) {
        return kelasDAO.getKelasByDosen(a); //To change body of generated methods, choose Tools | Templates.
    }
}
