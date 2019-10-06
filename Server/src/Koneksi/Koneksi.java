/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author R
 */
public class Koneksi {
    private static Connection connection=null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/clientserver","root", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());

            }
        return connection;
    }
    public static void main(String[] args) {

    Koneksi.getConnection();

    }
}
