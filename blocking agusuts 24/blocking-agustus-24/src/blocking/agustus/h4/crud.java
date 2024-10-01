
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
@SuppressWarnings("unused")
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
    public String simpan(String id,String nama,String alamat){
        CRUDquery="insert into siswa values(?,?,?)";
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
        return null;
    }
    public String ubah(String id,String nama,String alamat){
         CRUDquery="update siswa set nama=?, alamat=? where id=?";
        try{
            CRUDpsmt=CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nama);
            CRUDpsmt.setString(2, alamat);
            CRUDpsmt.setString(3,id);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        }catch(Exception e){
        System.out.println(e);
        }
        return null;
    }
    public String hapus(String id){
         CRUDquery="delete from siswa where id=?";
        try{
            CRUDpsmt=CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, id);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        }catch(Exception e){
        System.out.println(e);
        }
        return null;
    }
    public String cari(String nama){
         CRUDquery="SELECT*FROM siswa where nama like ? or nama like ?";
        try{
            CRUDpsmt=CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, "%" + nama + "%");
            CRUDpsmt.setString(2, "%" + nama + "%");
            CRUDpsmt.executeQuery();
            CRUDpsmt.close();
        }catch(Exception e){
        System.out.println(e);
        }
        return null;
    }
}
