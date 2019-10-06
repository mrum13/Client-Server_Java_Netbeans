package client.ta.java_file;

import java.sql.*;

public class KoneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if (koneksi == null){
            try {String url = "jdbc:mysql://localhost:3306/db_client"; // nama databasenya login
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
