/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import Package_AksesRMI.AksesMahasiswa;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author R
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws RemoteException{
        // TODO code application logic here
        Registry registry=LocateRegistry.createRegistry(1099);

        AksesMahasiswa aksesMahasiswa=new AksesMahasiswa();
        registry.rebind("mahasiswa",(Remote) aksesMahasiswa);

        System.out.println("server jalan");
    }
    
}
