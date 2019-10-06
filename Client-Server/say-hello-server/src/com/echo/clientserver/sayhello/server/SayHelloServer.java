/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echo.clientserver.sayhello.server;

import com.echo.clientserver.sayhello.SayHello;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author R
 */
public class SayHelloServer extends UnicastRemoteObject implements SayHello{
    
    public SayHelloServer()throws RemoteException {
    }
    
    public String sayHello(String nama) throws RemoteException {
        System.out.println("Client dengan nama "+nama+" Melakukan Request");
        return "Hello " +nama;
    }
}
