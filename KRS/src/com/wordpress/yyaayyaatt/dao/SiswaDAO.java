/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.dao;

import com.wordpress.yyaayyaatt.model.Siswa;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author agoes
 */
@Component
public class SiswaDAO extends BaseDaoHibernate<Siswa> {
    public  List<Siswa> getSiswaByNis(String no_induk) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Siswa s where s.no_induk=:no_induk")
                .setParameter("no_induk", no_induk)
                .list();
                //.uniqueResult();
    }
    
    public  List<Siswa> getSiswaByNisn(String nisn) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Siswa s where s.nisn=:nisn")
                .setParameter("nisn", nisn)
                .list();
                //.uniqueResult();
    }
    
    public  List<Siswa> getSiswaByKelas(String kelas) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Siswa s where s.kelas=:kelas")
                .setParameter("kelas", kelas)
                .list();
                //.uniqueResult();
    }
    
    public  List<Siswa> getSiswaByJurusan(String jurusan) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Siswa s where s.jurusan=:jurusan")
                .setParameter("jurusan", jurusan)
                .list();
    }
    
    public  List<Siswa> getSiswaByJk(String jk) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Siswa s where s.jk=:jk")
                .setParameter("jk", jk)
                .list();
    }
    
    public  List<Siswa> getSiswaByStatus(String status) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Siswa s where s.status=:status")
                .setParameter("status", status)
                .list();
    }
    
    @SuppressWarnings("unchecked")
    public List<Siswa> getCari(String cari) {
        System.out.print(cari);
        String searchFor = "%" + cari + "%";
        String query="from Siswa n where n.nm_lengkap like '"+searchFor+"' or n.no_induk like '"+searchFor+"' or n.nisn like '"+searchFor+"'";
        System.out.print(query);
        return sessionFactory.getCurrentSession()
        .createQuery(query)
        .list();

     }
}
