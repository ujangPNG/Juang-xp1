/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocking.agustus.h4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author vfz
 */
public class crud {
    private String id,nama,alamat;
    private Connection CRUDkoneksi;
    private PreparedStatement CRUDpsmt;
    private Statement CRUDstat;
    private ResultSet CRUDhasil;
    private String CRUDquery;
    
    public crud(){
        try{
            koneksiSql connection = new koneksiSql();
            CRUDkoneksi=connection.getKoneksi();
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    public void setID(String id){
        this.id=id;
    }
    public String getID(){
        return id;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    public ResultSet tampilData(){
        CRUDquery="select * from siswa";
        try{
            CRUDstat=CRUDkoneksi.createStatement();
            CRUDhasil=CRUDstat.executeQuery(CRUDquery);
        }catch(Exception e){
            
        }return CRUDhasil;
    }
    public void simpan(String id,String nama,String alamat){
        CRUDquery="insert into siswa values( , , )";
        try{
            CRUDpsmt=CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, id);
            CRUDpsmt.setString(2, nama);
            CRUDpsmt.setString(3,alamat);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        }catch(Exception e){
        System.out.println(e);
        }
    }
    public void ubah(String id,String nama,String alamat){
         CRUDquery="insert into siswa values( , , )";
        try{
            CRUDpsmt=CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, id);
            CRUDpsmt.setString(2, nama);
            CRUDpsmt.setString(3,alamat);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        }catch(Exception e){
        System.out.println(e);
        }
    }
    public void hapus(String id){
         CRUDquery="insert into siswa values( , , )";
        try{
            CRUDpsmt=CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, id);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        }catch(Exception e){
        System.out.println(e);
        }
    }
}
