/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service.impl.report;

import com.wordpress.yyaayyaatt.model.report.Krs;
import com.wordpress.yyaayyaatt.model.report.MahasiswaReport;
import com.wordpress.yyaayyaatt.model.report.MkReport;
import com.wordpress.yyaayyaatt.service.report.KRSReportService;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author agoes
 */
@Service("kRSReportService")
@Transactional(readOnly = true)
public class KRSReportServiceImpl implements KRSReportService {

    private static final Logger log = Logger.getLogger(KRSReportServiceImpl.class);
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public JasperPrint getKRSByNim(String nim) {
        try {
            List<Krs> krses
                    = sessionFactory.getCurrentSession()
                    .createQuery("select s.mahasiswa.nama AS nama, s.mahasiswa.kelas AS kelas, s.mk.kd_mk AS kd_mk, s.mk.mk AS mk, s.mk.sks AS sks, s.mk.takad AS takad from DetailKrs s WHERE s.mahasiswa.nim=:nim")
                    .setParameter("nim", nim)
                    .setResultTransformer(
                            Transformers.aliasToBean(Krs.class))
                    .list();

            InputStream is = KRSReportServiceImpl.class
                    .getResourceAsStream("/report/LapKrs.jasper");
            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("nim", nim);
            return JasperFillManager.fillReport(is, parameters,
                    new JRBeanCollectionDataSource(krses));
        } catch (JRException ex) {
            System.out.println("error ========================================================================= \n" + ex);
            log.error("error generate SiswaReport", ex);
        }
        return null;  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JasperPrint getMKAll() {
        try {
            List<MkReport> krses
                    = sessionFactory.getCurrentSession()
                    .createQuery("select m.takad AS takad,m.sks AS sks,m.mk AS mk,m.kd_mk AS kd_mk,m.dosen.dosen AS dosen from Mk m")
                    .setResultTransformer(
                            Transformers.aliasToBean(MkReport.class))
                    .list();

            InputStream is = KRSReportServiceImpl.class
                    .getResourceAsStream("/report/LapMkAll.jasper");
            Map<String, Object> parameters = new HashMap<String, Object>();
//            parameters.put("nim", nim);
            return JasperFillManager.fillReport(is, parameters,
                    new JRBeanCollectionDataSource(krses));
        } catch (JRException ex) {
            System.out.println("error ========================================================================= \n" + ex);
            log.error("error generate SiswaReport", ex);
        }
        return null;
    }

    @Override
    public JasperPrint getMKByDosen(String dosen) {
        try {
            List<MkReport> krses
                    = sessionFactory.getCurrentSession()
                    .createQuery("select m.dosen.dosen AS dosen,m.takad AS takad,m.sks AS sks,m.mk AS mk,m.kd_mk AS kd_mk from Mk m WHERE m.dosen.kd_dosen=:dosen")
                    .setParameter("dosen", dosen)
                            .setResultTransformer(
                            Transformers.aliasToBean(MkReport.class))
                    .list();

            InputStream is = KRSReportServiceImpl.class
                    .getResourceAsStream("/report/LapMkByDosen.jasper");
            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("dosen", dosen);
            return JasperFillManager.fillReport(is, parameters,
                    new JRBeanCollectionDataSource(krses));
        } catch (JRException ex) {
            System.out.println("error ========================================================================= \n" + ex);
            log.error("error generate SiswaReport", ex);
        }
        return null;
    }

    @Override
    public JasperPrint getMKByTa(String ta) {
        try {
            List<MkReport> krses
                    = sessionFactory.getCurrentSession()
                    .createQuery("select m.dosen.dosen AS dosen,m.takad AS takad,m.sks AS sks,m.mk AS mk,m.kd_mk AS kd_mk from Mk m WHERE m.takad=:ta")
                    .setParameter("ta", ta)
                            .setResultTransformer(
                            Transformers.aliasToBean(MkReport.class))
                    .list();

            InputStream is = KRSReportServiceImpl.class
                    .getResourceAsStream("/report/LapMkByTa.jasper");
            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("ta", ta);
            return JasperFillManager.fillReport(is, parameters,
                    new JRBeanCollectionDataSource(krses));
        } catch (JRException ex) {
            System.out.println("error ========================================================================= \n" + ex);
            log.error("error generate SiswaReport", ex);
        }
        return null;
    }

    @Override
    public JasperPrint getKRSAll() {
        try {
            List<Krs> krses
                    = sessionFactory.getCurrentSession()
                    .createQuery("select s.mahasiswa.nim AS nim,s.mahasiswa.nama AS nama, s.mahasiswa.kelas AS kelas, s.mk.kd_mk AS kd_mk, s.mk.mk AS mk, s.mk.sks AS sks, s.mk.takad AS takad from DetailKrs s")
//                    .setParameter("nim", nim)
                    .setResultTransformer(
                            Transformers.aliasToBean(Krs.class))
                    .list();

            InputStream is = KRSReportServiceImpl.class
                    .getResourceAsStream("/report/LapKrsAll.jasper");
            Map<String, Object> parameters = new HashMap<String, Object>();
//            parameters.put("nim", nim);
            return JasperFillManager.fillReport(is, parameters,
                    new JRBeanCollectionDataSource(krses));
        } catch (JRException ex) {
            System.out.println("error ========================================================================= \n" + ex);
            log.error("error generate SiswaReport", ex);
        }
        return null;
    }

    @Override
    public JasperPrint getMhsAll() {
         try {
            List<MahasiswaReport> mahasiswaReports
                    = sessionFactory.getCurrentSession()
                    .createQuery("SELECT  m.thnmasuk AS thnmasuk, m.jumlah_krs AS jumlah_krs, m.jk AS jk, m.kelas AS kelas, m.nama AS nama, m.nim AS nim FROM Mahasiswa m")
//                    .setParameter("nim", nim)
                    .setResultTransformer(
                            Transformers.aliasToBean(MahasiswaReport.class))
                    .list();

            InputStream is = KRSReportServiceImpl.class
                    .getResourceAsStream("/report/LapMhsAll.jasper");
            Map<String, Object> parameters = new HashMap<String, Object>();
//            parameters.put("nim", nim);
            return JasperFillManager.fillReport(is, parameters,
                    new JRBeanCollectionDataSource(mahasiswaReports));
        } catch (JRException ex) {
            System.out.println("error ========================================================================= \n" + ex);
            log.error("error generate SiswaReport", ex);
        }
        return null;
    }

    @Override
    public JasperPrint getMhsByKelas(String kelas) {
        try {
            List<MahasiswaReport> mahasiswaReports
                    = sessionFactory.getCurrentSession()
                    .createQuery("SELECT  m.thnmasuk AS thnmasuk, m.jumlah_krs AS jumlah_krs, m.jk AS jk, m.nama AS nama, m.nim AS nim FROM Mahasiswa m WHERE m.kelas=:kelas")
                    .setParameter("kelas", kelas)
                    .setResultTransformer(
                            Transformers.aliasToBean(MahasiswaReport.class))
                    .list();

            InputStream is = KRSReportServiceImpl.class
                    .getResourceAsStream("/report/LapMhsByKelas.jasper");
            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("kelas", kelas);
            return JasperFillManager.fillReport(is, parameters,
                    new JRBeanCollectionDataSource(mahasiswaReports));
        } catch (JRException ex) {
            System.out.println("error ========================================================================= \n" + ex);
            log.error("error generate SiswaReport", ex);
        }
        return null;
    }
}
