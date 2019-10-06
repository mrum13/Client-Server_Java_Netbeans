/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service.impl;

import com.wordpress.yyaayyaatt.dao.WaktuKrsDAO;
import com.wordpress.yyaayyaatt.model.WaktuKrs;
import com.wordpress.yyaayyaatt.service.WaktuKrsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author agoes
 */

@Service("waktuKrsService")
@Transactional(readOnly=true)
public class WaktuKrsServiceImpl implements WaktuKrsService {

    @Autowired
    private WaktuKrsDAO waktuKrsDAO;
    @Transactional(readOnly=false)
    public void insert(WaktuKrs a){
        waktuKrsDAO.save(a);
    }

    @Transactional(readOnly=false)
    public void delete(WaktuKrs a){
        waktuKrsDAO.delete(a);
    }

    @Override
    public List<WaktuKrs> getAll() {
        return waktuKrsDAO.getAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WaktuKrs> getCari(String cari) {
        return waktuKrsDAO.getCari(cari); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public WaktuKrs getID(int a) {
        return waktuKrsDAO.getID(a);//To change body of generated methods, choose Tools | Templates.
    }
}
