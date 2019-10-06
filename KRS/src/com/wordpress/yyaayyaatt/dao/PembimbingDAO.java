/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.dao;

import com.wordpress.yyaayyaatt.model.Pembimbing;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author agoes
 */
@Component
public class PembimbingDAO extends BaseDaoHibernate<Pembimbing> {
    public  List<Pembimbing> getPembimbingByKode(String kode_pembimbing) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Pembimbing s where s.kode_pembimbing=:kode_pembimbing")
                .setParameter("kode_pembimbing", kode_pembimbing)
                .list();
                //.uniqueResult();
    }public Pembimbing getID(int id) {
        return (Pembimbing) sessionFactory.getCurrentSession()
                .createQuery("from Pembimbing s where s.id=:kode_pembimbing")
                .setParameter("kode_pembimbing", id)
//                .list();
                .uniqueResult();
    }
    public  List<Pembimbing> getPembimbingByKelas(String kelas) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Pembimbing s where s.nama=:kelas")
                .setParameter("kelas", kelas)
                .list();
                //.uniqueResult();
    }
    
    @SuppressWarnings("unchecked")
    public List<Pembimbing> getCari(String cari) {
        System.out.print(cari);
        String searchFor = "%" + cari + "%";
        String query="from Pembimbing n where n.nm_lengkap like '"+searchFor+"' or n.no_induk like '"+searchFor+"' or n.nisn like '"+searchFor+"'";
        System.out.print(query);
        return sessionFactory.getCurrentSession()
        .createQuery(query)
        .list();

     }
}
