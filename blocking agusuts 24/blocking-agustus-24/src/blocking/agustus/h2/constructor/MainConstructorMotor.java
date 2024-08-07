/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocking.agustus.h2.constructor;

public class MainConstructorMotor {
    public static void main(String args [])
    {
        String pemilik = "Ntan";
        String merk = "Honda Beat";
        String warna = "Merah";
        
        ConstructorKendaraan.setPemilik(pemilik);
        System.out.println("Pemilik kendaraan = "+ ConstructorKendaraan.getPemilik());
        System.out.println("==============================");
        
        ConstructorKendaraan ob = new ConstructorKendaraan(merk);
        ob.tampil("Merk Kendaraan = "+ ob.getMerk());
        ob.tampil("Pemilik Kendaraan = "+ConstructorKendaraan.getPemilik());
        System.out.println("===================");
        
        ConstructorKendaraan ob2 = new ConstructorKendaraan();
        ob2.tampil("Merk Kendaraan (instant variable) = "+ob2.getMerk());
        ob2.tampil("Merk Kendaraan (instant variable) = "+ConstructorKendaraan.getPemilik());
        System.out.println("===================");
        
        ConstructorMotor ob3 = new ConstructorMotor(merk,warna);
        ob3.tampil("Merk Motor = "+ob3.getMerk());
        ob3.tampil("Warna Motor = "+ob3.getWarna());
        ob3.tampil("Pemilik Motor = "+ConstructorMotor.getPemilik());
        
        pemilik = null;
        merk = null;
        warna = null;
        ob.hapus();
        ob = null;
        ob2 = null;
        ob3 = null;
    }
}
