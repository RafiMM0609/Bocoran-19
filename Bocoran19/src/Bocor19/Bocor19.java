/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bocor19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kamlesh
 */
public class Bocor19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LayarUtama mr=new LayarUtama();
        mr.setLocationRelativeTo(null);
        mr.setVisible(true);
    }

    static class Admin {

        public Admin() {
        }
    }

    static class PesanYuk {

        public PesanYuk() {
        }
    }

    static class ColumnStats {

        public ColumnStats() {
        }
    }
 
public class config {
    private Connection mysqlconfig;
    public Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/bocor-19"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }    
}    
    
}
