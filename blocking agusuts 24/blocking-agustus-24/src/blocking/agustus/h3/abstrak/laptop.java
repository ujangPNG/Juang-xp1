/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocking.agustus.h3.abstrak;

/**
 *
 * @author vfz
 */
public abstract class laptop {
    protected String merk,pemilik;
    protected abstract void setMerk(String merk);
    protected abstract String getMerk();
    protected abstract void setPemilik(String pemilik);
    protected abstract String getPemilik();
    protected abstract void tampil();
    protected abstract void hapus();
    
    protected void hidupkan(){
        System.out.println("Hidupkan Laptop");
    }
}
