/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocking.agustus.h3.interfes;

/**
 *
 * @author vfz
 */
public class cetak {
    public static void main(String[]args)
    {
        System.out.println("Komputer : ");
        pc pcbaru=new pc();
        pcbaru.kanan();
        pcbaru.kiri();
        pcbaru.doubleklik();
        System.out.println("===============");
        
        System.out.println("PC : ");
        pisi pisib=new pisi();
        pisib.enter();
        System.out.println("===============");
        
        System.out.println("Laptop : ");
        laptop laptopb=new laptop();
        laptopb.jenis();
        laptopb.kanan();
        laptopb.kiri();
        laptopb.doubleklik();
        laptopb.enter();
    }
}
