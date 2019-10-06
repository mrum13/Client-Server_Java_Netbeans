/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Script;

import java.sql.*;
/**
 *
 * @author R
 */
public class koneksiDatabase {
    private static Connection koneksi;
        public static Connection getKoneksi(){
        if (koneksi == null){
            try {String url = "jdbc:mysql://localhost:3306/proyekCS"; // nama databasenya login
                String user="root"; // username mysql root
                String pass=""; //passwordnya kosong

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url , user, pass);

            } 
            catch(SQLException t){
               System.out.print("Gagal melakukan koneksi ke database");
            }
        }
    return koneksi;
    }
}
