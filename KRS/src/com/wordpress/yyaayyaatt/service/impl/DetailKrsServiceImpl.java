/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service.impl;

import com.wordpress.yyaayyaatt.dao.DetailKrsDAO;
import com.wordpress.yyaayyaatt.model.DetailKrs;
import com.wordpress.yyaayyaatt.service.DetailKrsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author agoes
 */

@Service("detailKrsService")
@Transactional(readOnly=true)
public class DetailKrsServiceImpl implements DetailKrsService {

    @Autowired
    private DetailKrsDAO detailKrsDAO;
    @Transactional(readOnly=false)
    public void insert(DetailKrs a){
        detailKrsDAO.save(a);
    }

    @Transactional(readOnly=false)
    public void delete(DetailKrs a){
        detailKrsDAO.delete(a);
    }

    @Override
    public List<DetailKrs> getAll() {
//To change body of generated methods, choose Tools | Templates.
        return detailKrsDAO.getAll();
    }

    @Override
    public List<DetailKrs> getDetailKrsByKdMk(String a) {
        //To change body of generated methods, choose Tools | Templates.
        return detailKrsDAO.getDetailKrsByKdMk(a);
    }

    @Override
    public DetailKrs getID(Integer a) {
//To change body of generated methods, choose Tools | Templates.
        return detailKrsDAO.getID(a.toString());
    }

    @Override
    public List<DetailKrs> getDetailKrsById(int id) {
        return detailKrsDAO.getDetailKrsById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetailKrs> getDetailKrsBySemester(int id,String semester) {
        return detailKrsDAO.getDetailKrsBySmtr(id, semester);
    }
}
