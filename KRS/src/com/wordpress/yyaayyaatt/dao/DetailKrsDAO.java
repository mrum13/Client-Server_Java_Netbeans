
package com.wordpress.yyaayyaatt.dao;

import com.wordpress.yyaayyaatt.model.DetailKrs;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class DetailKrsDAO extends BaseDaoHibernate<DetailKrs> {

    public List<DetailKrs> getDetailKrsByKdMk(String kd_mk) {
        return sessionFactory.getCurrentSession()
                .createQuery("from DetailKrs s where s.kd_mk=:kd_mk")
                .setParameter("kd_mk", kd_mk)
                .list();
        //.uniqueResult();
    }

    public List<DetailKrs> getDetailKrsById(int id) {
        return sessionFactory.getCurrentSession()
                .createQuery("from DetailKrs s where s.mahasiswa.id=:id")
                .setParameter("id", id)
                .list();
        //.uniqueResult();
    }

    public List<DetailKrs> getDetailKrsBySmtr(int id, String semester) {
        return sessionFactory.getCurrentSession()
                .createQuery("from DetailKrs s where s.semester=:semester "
                        + "and s.mahasiswa.id=:id")
                .setParameter("id", id)
                .setParameter("semester", semester)
                .list();
        //.uniqueResult();
    }
    
    public List<DetailKrs> getDetailKrsByIdAndSmtr(int id, String semester) {
        return sessionFactory.getCurrentSession()
                .createQuery("from DetailKrs s where s.semester=:semester and "
                        + "s.mahasiswa.id=:id")
                .setParameter("id", id)
                .setParameter("semester", semester)
                .list();
        //.uniqueResult();
    }

    public DetailKrs getID(String id) {
        return (DetailKrs) sessionFactory.getCurrentSession()
                .createQuery("from DetailKrs b where b.id=:id")
                .setParameter("id", id)
                .uniqueResult();
    }

    @SuppressWarnings("unchecked")
    public List<DetailKrs> getCari(String cari) {
        System.out.print(cari);
        String searchFor = "%" + cari + "%";
        String query = "from DetailKrs n where n.nama like '" + searchFor + 
                "' or n.kd_kelas like '" + searchFor + "' or n.takad like '" 
                + searchFor + "'";
        System.out.print(query);
        return sessionFactory.getCurrentSession()
                .createQuery(query)
                .list();

    }
}
