/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocking.agustus.h2.constructor;

public class ConstructorKendaraan {
    private String merk;
    private static String pemilik;
    
    protected ConstructorKendaraan(){
        merk = null;
    }
    protected ConstructorKendaraan(String merk) {
        this.merk = merk;
        merk = null;
    }
    protected void setMerk(String merk){
        this.merk = merk;
    }
    protected String getMerk(){
        return merk;
    }
    protected static void setPemilik(String pemilik){
        ConstructorKendaraan.pemilik = pemilik;
    }
    protected static String getPemilik() {
        return ConstructorKendaraan.pemilik;
    }
    protected void tampil(String a)
    {
        System.out.println(a);
        a = null;
    }
    protected void hapus()
    {
        merk = null;
        pemilik = null;
    }
}
