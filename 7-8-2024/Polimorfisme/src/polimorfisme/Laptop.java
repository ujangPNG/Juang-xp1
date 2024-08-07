/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;


public abstract class Laptop {
    protected String merk,pemilik;
    
    protected abstract void setMerk(String merk);
    protected abstract String getMerk();
    protected abstract void setPemilik(String pemilik);
    protected abstract String getPemilik();
    protected abstract void tampil ();
    protected abstract void hapus();
    
    protected void hidupkanLaptop() {
        System.out.println("Hidupkan Laptop");
    }

    void getPemilik(String pemilik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
