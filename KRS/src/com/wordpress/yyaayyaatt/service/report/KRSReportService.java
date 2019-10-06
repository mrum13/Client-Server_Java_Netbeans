/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service.report;

import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author agoes
 */
public interface KRSReportService {
   JasperPrint getKRSByNim(String nim);
   JasperPrint getKRSAll();
   JasperPrint getMKAll();
   JasperPrint getMKByDosen(String dosen);
   JasperPrint getMKByTa(String ta);
   JasperPrint getMhsAll();
   JasperPrint getMhsByKelas(String kelas);
}
