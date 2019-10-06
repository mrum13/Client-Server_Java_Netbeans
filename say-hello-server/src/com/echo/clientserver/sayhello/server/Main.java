/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echo.clientserver.sayhello.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author R
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException{
        Registry registry = LocateRegistry.createRegistry(1099);
        
        SayHelloServer sayHello = new SayHelloServer();
        registry.rebind("sayHello", sayHello);
        
        System.out.println("Server telah berjalan");
    }
}
    