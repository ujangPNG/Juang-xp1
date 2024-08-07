/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author PC-10
 */
public class Mobil extends Kendaraan {
    private long harga;
    protected String namaClass = "Mobil";
    
    protected void setHarga(String harga) {
        this.harga = Long.parseLong(harga);
        harga = null;
    }
    
    protected long getHarga() {
        return harga;
    }
    
    protected String keterangan()
    {
        return (namaClass+" : Ini adalah class "+namaClass);
    }
    
    public String keterangan_Kenderaan()
    {
        return super.namaClass+"  :  "+super.keterangan();
    }
    
    protected void hapus()
    {
        harga = 0;
        super.hapus();
    }
}