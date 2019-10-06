/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service.impl;

import com.wordpress.yyaayyaatt.dao.LoginDAO;
import com.wordpress.yyaayyaatt.model.Login;
import com.wordpress.yyaayyaatt.service.LoginService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author agoes
 */

@Service("loginService")
@Transactional(readOnly=true)
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDAO mahasiswaDAO;
    @Transactional(readOnly=false)
    public void insert(Login a){
        mahasiswaDAO.save(a);
    }

    @Transactional(readOnly=false)
    public void delete(Login a){
        mahasiswaDAO.delete(a);
    }

    @Override
    public List<Login> getAll() {
        return mahasiswaDAO.getAll();
    }

    @Override
    public Login getUsers(String user, String pass) {
        return mahasiswaDAO.getUsers(user, pass);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Login getID(int id) {
        return mahasiswaDAO.getID(id);//To change body of generated methods, choose Tools | Templates.
    }
}
