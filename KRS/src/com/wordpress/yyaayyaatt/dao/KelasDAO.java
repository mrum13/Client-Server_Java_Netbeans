/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.dao;

import com.wordpress.yyaayyaatt.model.Kelas;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author agoes
 */
@Component
public class KelasDAO extends BaseDaoHibernate<Kelas> {
    public  List<Kelas> getKelasByKode(String kd_kelas) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Kelas s where s.kd_kelas=:kd_kelas")
                .setParameter("kd_kelas", kd_kelas)
                .list();
                //.uniqueResult();
    }
    public Kelas getKelas(Integer kd_kelas) {
        return (Kelas) sessionFactory.getCurrentSession()
                .createQuery("from Kelas s where s.id=:id")
                .setParameter("id", kd_kelas)
//                .list();
                .uniqueResult();
    }
    
    public  List<Kelas> getKelasByKelas(String nama) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Kelas s where s.nama=:nama")
                .setParameter("nama", nama)
                .list();
                //.uniqueResult();
    }
    
    public  Kelas getKelasByDosen(String nama) {
        return (Kelas) sessionFactory.getCurrentSession()
                .createQuery("from Kelas s where s.pembimbing=:nama")
                .setParameter("nama", nama)
//                .list();
                .uniqueResult();
    }
    @SuppressWarnings("unchecked")
    public List<Kelas> getCari(String cari) {
        System.out.print(cari);
        String searchFor = "%" + cari + "%";
        String query="from Kelas n where n.nama like '"+searchFor+"' or n.kd_kelas like '"+searchFor+"' or n.takad like '"+searchFor+"'";
        System.out.print(query);
        return sessionFactory.getCurrentSession()
        .createQuery(query)
        .list();

     }
}
