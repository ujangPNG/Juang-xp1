/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocking.agustus.h2.inheritance;
import javax.swing.JOptionPane;
/**
 *
 * @author vfz
 */
public class mainMbil extends mbil {
    public static void main(String[]args){
        mainMbil ob = new mainMbil();
        String merk,warna,harga;
        
        merk=JOptionPane.showInputDialog("Merk Mobil : ");
        ob.setMerk(merk);
        ob.tampil("Merk Mobil : "+ob.getMerk());
        
        warna=JOptionPane.showInputDialog("Warna Mobil : ");
        ob.setWarna(warna);
        ob.tampil("Warna : "+ob.getWarna());
        
        harga=JOptionPane.showInputDialog("Harga Mobil : ");
        ob.setHarga(harga);
        ob.tampil("Harga Mobil : "+ob.getHarga());
        
        ob.hapus();
        merk=null;
        warna=null;
        harga=null;
        ob=null;
        
        System.exit(0);
        
    }
}
