/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.yyaayyaatt.service.impl;

import com.wordpress.yyaayyaatt.dao.MahasiswaDAO;
import com.wordpress.yyaayyaatt.model.Mahasiswa;
import com.wordpress.yyaayyaatt.service.MahasiswaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author agoes
 */

@Service("mahasiswaService")
@Transactional(readOnly=true)
public class MahasiswaServiceImpl implements MahasiswaService {

    @Autowired
    private MahasiswaDAO mahasiswaDAO;
    @Transactional(readOnly=false)
    public void insert(Mahasiswa a){
        mahasiswaDAO.save(a);
    }

    @Transactional(readOnly=false)
    public void delete(Mahasiswa a){
        mahasiswaDAO.delete(a);
    }

    @Override
    public List<Mahasiswa> getAll() {
        return mahasiswaDAO.getAll();
    }

    @Override
    public List<Mahasiswa> getMahasiswaByNim(String a) {
        return mahasiswaDAO.getMahasiswaByNim(a);
    }

    @Override
    public List<Mahasiswa> getMahasiswaByKelas(String a) {
        return mahasiswaDAO.getMahasiswaByKelas(a);
    }

    @Override
    public List<Mahasiswa> getMahasiswaByJk(String a) {
        return mahasiswaDAO.getMahasiswaByJk(a);
    }

    @Override
    public List<Mahasiswa> getMahasiswaByJurusan(String a) {
        return mahasiswaDAO.getMahasiswaByJurusan(a);
    }

    @Override
    public List<Mahasiswa> getCari(String cari) {
        return mahasiswaDAO.getCari(cari);
    }

    @Override
    public Mahasiswa getMahasiswa(int a) {
        return mahasiswaDAO.getID(a);
    }

    @Override
    public Mahasiswa getUsers(String user, String pass) {
        return mahasiswaDAO.getUsers(user, pass);//To change body of generated methods, choose Tools | Templates.
    }
}
