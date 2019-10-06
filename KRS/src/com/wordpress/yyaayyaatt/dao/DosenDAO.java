/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.dao;

import com.wordpress.yyaayyaatt.model.Dosen;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author agoes
 */
@Component
public class DosenDAO extends BaseDaoHibernate<Dosen> {
    
    public Dosen getID(int id){
        return (Dosen) sessionFactory.getCurrentSession()
                .createQuery("from Dosen b where b.id=:id")
                .setParameter("id", id)
                .uniqueResult();
    }
    public  List<Dosen> getDosenByKode(String kd_dosen) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Dosen s where s.kd_dosen=:kd_dosen")
                .setParameter("kd_dosen", kd_dosen)
                .list();
                //.uniqueResult();
    }
    
    public  List<Dosen> getDosenByNipy(String nipy) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Dosen s where s.nipy=:nipy")
                .setParameter("nipy", nipy)
                .list();
                //.uniqueResult();
    }
    
    public  List<Dosen> getDosenByNama(String dosen) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Dosen s where s.dosen=:dosen")
                .setParameter("dosen", dosen)
                .list();
    }
    
    @SuppressWarnings("unchecked")
    public List<Dosen> getCari(String cari) {
        System.out.print(cari);
        String searchFor = "%" + cari + "%";
        String query="from Dosen n where n.kd_dosen like '"+searchFor+"' or n.nipy like '"+searchFor+"' or n.dosen like '"+searchFor+"'";
        System.out.print(query);
        return sessionFactory.getCurrentSession()
        .createQuery(query)
        .list();

     }
}
