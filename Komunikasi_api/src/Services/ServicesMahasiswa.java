/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entitas.Mahasiswa;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
/**
 *
 * @author R
 */
public interface ServicesMahasiswa extends Remote{
    List getMahasiswa()throws RemoteException;//untuk select data menampung data mahasiswa
    void insert(Mahasiswa mahasiswa) throws RemoteException;
    void update(Mahasiswa mahasiswa) throws RemoteException;
    void delete(Mahasiswa mahasiswa) throws RemoteException;
}
