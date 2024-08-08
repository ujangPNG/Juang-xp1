package blocking.agustus.h4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vfz
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class koneksiSql {
    private Connection connect;
     private String DriverName="com.mysql.jdbc.Driver";
     private String jdbc="jdbc:mysql://";
     private String host="localhost:";
     private String port ="3306/";
     private String database="bloking";
     private String url=jdbc+host+port+database;
     private String username="root";
     private String password="";
     public Connection getKoneksi()throws SQLException{
         if(connect==null){
             try{
                 Class.forName(DriverName);
                 System.out.println("class driver ada");
                 try{
                     connect=DriverManager.getConnection(url,username,password);
                     System.out.println("koneksi sukses ");
                 }catch(SQLException se){
                     System.out.println("koneksi gagal : "+se);
                     System.exit(0);
                 }
             }catch(ClassNotFoundException cnfe){
                 System.out.println("driver tidak ditemukan, kesalahan pada : "+cnfe);
                 System.exit(0);
             }
         }
         return connect;
     }
}
