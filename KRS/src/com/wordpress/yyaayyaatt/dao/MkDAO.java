/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.dao;

import com.wordpress.yyaayyaatt.model.Mk;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author agoes
 */
@Component
public class MkDAO extends BaseDaoHibernate<Mk> {
    public  List<Mk> getMkByKode(String kd_mk) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Mk s where s.kd_mk=:kd_mk")
                .setParameter("kd_mk", kd_mk)
                .list();
                //.uniqueResult();
    }
    public Mk getID(int id) {
        return (Mk) sessionFactory.getCurrentSession()
                .createQuery("from Mk s where s.id=:id")
                .setParameter("id", id)
//                .list();
                .uniqueResult();
    }
    
    public  List<Mk> getMkBySks(String sks) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Mk s where s.sks=:sks")
                .setParameter("sks", sks)
                .list();
                //.uniqueResult();
    }
    
    public  List<Mk> getMkByTakad(String takad) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Mk s where s.takad=:takad")
                .setParameter("takad", takad)
                .list();
                //.uniqueResult();
    }
    
    public  List<Mk> getMkByDosen(String dosen) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Mk s where s.dosen.dosen=:dosen")
                .setParameter("dosen", dosen)
                .list();
    }
    
    @SuppressWarnings("unchecked")
    public List<Mk> getCari(String cari) {
        System.out.print(cari);
        String searchFor = "%" + cari + "%";
        String query="from Mk n where n.kd_mk like '"+searchFor+"' or n.mk like '"+searchFor+"' or n.sks like '"+searchFor+"'";
        System.out.print(query);
        return sessionFactory.getCurrentSession()
        .createQuery(query)
        .list();

     }
}
