/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.dao;

import com.wordpress.yyaayyaatt.model.WaktuKrs;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author agoes
 */
@Component
public class WaktuKrsDAO extends BaseDaoHibernate<WaktuKrs> {
  
    public WaktuKrs getID(int id){
        return (WaktuKrs) sessionFactory.getCurrentSession()
                .createQuery("from WaktuKrs b where b.id=:id")
                .setParameter("id", id)
                .uniqueResult();
    }
    
    @SuppressWarnings("unchecked")
    public List<WaktuKrs> getCari(String cari) {
        System.out.print(cari);
        String searchFor = "%" + cari + "%";
        String query="from WaktuKrs n where n.ta like '"+searchFor+"' or n.semester like '"+searchFor+"' or n.tanggal_pengisian like '"+searchFor+"'";
        System.out.print(query);
        return sessionFactory.getCurrentSession()
        .createQuery(query)
        .list();

     }
}
