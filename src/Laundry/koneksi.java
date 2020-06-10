/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Silfi Gabrilia
 */
public class koneksi {
    com.mysql.jdbc.Connection getConnection;
    public koneksi(){
    }
    public static Connection bukaKoneksi() throws SQLException{
        Connection con = null;
            try{
            String url = "jdbc:mysql://localhost/koneksi";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Selamat Anda Sudah Terhubung Dengan Data Base");
            return con;
        }
        
        catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Coba Lagi");
            System.out.println("No Connection open");
            return null;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Tidak Ditemukan");
            System.out.println("Could't open connection");
            return null;
        }
    }
    public static void main (String[]args) throws SQLException{
        bukaKoneksi();
    }
    
}
