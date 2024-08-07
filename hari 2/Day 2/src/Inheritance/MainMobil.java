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
import javax.swing.JOptionPane;
public class MainMobil extends Mobil {
    public static void main (String []args) {
        MainMobil ob = new MainMobil();
        String merk, warna, harga;
        
        merk = JOptionPane.showInputDialog("Merk Mobil :");
        ob.setmerk(merk);
        ob.tampil("Merk Mobil : " + ob.getMerk());
        
        warna = JOptionPane.showInputDialog("Warna Mobil : ");
        ob.setWarna(warna);
        ob.tampil("Warna Mobil : " + ob.getWarna());
        
        harga = JOptionPane.showInputDialog("Harga Mobil : ");
        ob.setHarga(harga);
        ob.tampil("Harga Mobil : " + ob.getHarga());
        
        ob.hapus();
        merk = null;
        warna = null;
        harga = null;
        ob = null;
        
        System.exit(0);
    }

    private void setMerk(String merk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
