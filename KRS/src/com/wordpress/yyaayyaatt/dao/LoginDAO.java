/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.dao;

import com.wordpress.yyaayyaatt.model.Login;
import org.springframework.stereotype.Component;

@Component
public class LoginDAO extends BaseDaoHibernate<Login> {
    public Login getID(Integer id){
        return (Login) sessionFactory.getCurrentSession()
                .createQuery("from Login a where a.id=:id")
                .setParameter("id", id)
                .uniqueResult();
    }
       public Login getUsers(String users, String password){
        return (Login) sessionFactory.getCurrentSession()
                .createQuery("from Login u where u.users=:users AND u.password=:password")
                .setParameter("users", users)
                .setParameter("password", password)
                .uniqueResult();
    }
    
}
