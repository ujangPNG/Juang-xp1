package blocking.agustus.h2.inheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vfz
 */
public class kendaraan {
    private String merk,warna;
    protected String klas="Kendaraan";
    
    protected void setMerk(String merk){
        this.merk=merk;
        merk=null;
    }
    protected String getMerk(){
        return merk;
    }
    protected void setWarna(String warna){
        this.warna=warna;
        warna=null;
    }
    protected String getWarna(){
        return warna;
    }
    protected void tampil(String a){
        System.out.println(a);
        a=null;
    }    
    
    protected String keterangan(){
            return("ini adalah class "+klas);
        }
    protected void hapus(){
        warna=null;
        merk=null;
        klas=null;
    }
    
}
