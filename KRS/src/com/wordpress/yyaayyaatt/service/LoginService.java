/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service;

import com.wordpress.yyaayyaatt.model.Login;
import java.util.List;

/**
 *
 * @author bahrie
 */
public interface LoginService {


    void insert(Login a);

    void delete(Login a);

    List<Login> getAll();

    Login getID(int id);
    Login getUsers(String user, String pass);
}
