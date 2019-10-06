/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.dao;

import com.wordpress.yyaayyaatt.model.Mahasiswa;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author agoes
 */
@Component
public class MahasiswaDAO extends BaseDaoHibernate<Mahasiswa> {
    public Mahasiswa getID(Integer id){
        return (Mahasiswa) sessionFactory.getCurrentSession()
                .createQuery("from Mahasiswa a where a.id=:id")
                .setParameter("id", id)
                .uniqueResult();
    }
       public Mahasiswa getUsers(String username, String pass){
        return (Mahasiswa) sessionFactory.getCurrentSession()
                .createQuery("from Mahasiswa u where u.nim=:id_user AND u.pwd=:pass")
                .setParameter("id_user", username)
                .setParameter("pass", pass)
                .uniqueResult();
    }
    public  List<Mahasiswa> getMahasiswaByNim(String nim) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Mahasiswa s where s.nim=:nim")
                .setParameter("nim", nim)
                .list();
                //.uniqueResult();
    }
    
    public  List<Mahasiswa> getMahasiswaByKelas(String kelas) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Mahasiswa s where s.kelas=:kelas")
                .setParameter("kelas", kelas)
                .list();
                //.uniqueResult();
    }
    
    public  List<Mahasiswa> getMahasiswaByJurusan(String jurusan) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Mahasiswa s where s.jurusan=:jurusan")
                .setParameter("jurusan", jurusan)
                .list();
    }
    
    public  List<Mahasiswa> getMahasiswaByJk(String jk) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Mahasiswa s where s.jk=:jk")
                .setParameter("jk", jk)
                .list();
    }
    
    @SuppressWarnings("unchecked")
    public List<Mahasiswa> getCari(String cari) {
        System.out.print(cari);
        String searchFor = "%" + cari + "%";
        String query="from Mahasiswa n where n.nama like '"+searchFor+"' or n.nim like '"+searchFor+"' or n.kelas like '"+searchFor+"'";
        System.out.print(query);
        return sessionFactory.getCurrentSession()
        .createQuery(query)
        .list();

     }
}
