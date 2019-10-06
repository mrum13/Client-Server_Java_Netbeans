/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service.impl;

import com.wordpress.yyaayyaatt.dao.SiswaDAO;
import com.wordpress.yyaayyaatt.model.Siswa;
import com.wordpress.yyaayyaatt.service.SiswaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author agoes
 */

@Service("siswaService")
@Transactional(readOnly=true)
public class SiswaServiceImpl implements SiswaService {

    @Autowired
    private SiswaDAO siswaDAO;
    @Transactional(readOnly=false)
    public void insert(Siswa a){
        siswaDAO.save(a);
    }

    @Transactional(readOnly=false)
    public void delete(Siswa a){
        siswaDAO.delete(a);
    }

    @Override
    public List<Siswa> getAll(){
        return siswaDAO.getAll();
    }

    @Override
    public List<Siswa> getSiswaByNis(String a){
        return siswaDAO.getSiswaByNis(a);

    }

    @Override
    public List<Siswa> getSiswaByNisn(String a) {
        return siswaDAO.getSiswaByNisn(a);
    }

    @Override
    public List<Siswa> getSiswaByKelas(String a){
        return siswaDAO.getSiswaByKelas(a);
    }

    @Override
    public List<Siswa> getSiswaByJk(String a){
        return siswaDAO.getSiswaByJk(a);
    }

    @Override
    public List<Siswa> getSiswaByJurusan(String a){
        return siswaDAO.getSiswaByJurusan(a);
    }

    @Override
    public List<Siswa> getSiswaByStatus(String a){
         return siswaDAO.getSiswaByStatus(a);
    }

    @Override
    public List<Siswa> getCari(String cari) {
        return siswaDAO.getCari(cari);
    }

    @Override
    public Siswa getSiswa(String a) {
        return siswaDAO.getById(a);
    }
}
