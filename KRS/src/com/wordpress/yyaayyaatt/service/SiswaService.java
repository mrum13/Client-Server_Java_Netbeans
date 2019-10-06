/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service;

import com.wordpress.yyaayyaatt.model.Siswa;
import java.util.List;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author agoes
 */
public interface SiswaService {

    void insert(Siswa a);

    void delete(Siswa a);

    List<Siswa> getAll();

    List<Siswa> getSiswaByNis(String a);

    List<Siswa> getSiswaByNisn(String a);

    List<Siswa> getSiswaByKelas(String a);

    List<Siswa> getSiswaByJk(String a);

    List<Siswa> getSiswaByJurusan(String a);

    List<Siswa> getSiswaByStatus(String a);
    
    List<Siswa> getCari(String cari);
    
    Siswa getSiswa(String a);
}
