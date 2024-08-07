/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocking.agustus.h2.inheritance;

/**
 *
 * @author vfz
 */
public class mbil extends kendaraan{
    private long harga;
    protected String klas="mobil";
    protected void setHarga(String harga){
        this.harga=Long.parseLong(harga);
        harga=null;
    }
    protected long getHarga(){
        return harga;
    }
    protected String keterangan(){
        return (klas+" : ini adalah klas "+klas);
    }
    public String keterangan_k(){
        return super.klas+" : "+super.keterangan();
    }
    protected void hapus(){
        harga=0;
        super.hapus();
    }
}
