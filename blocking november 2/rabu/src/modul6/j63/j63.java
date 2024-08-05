/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6.j63;

/**
 *
 * @author vfz
 */
public class j63 {
    public static void main(String[]args)
    {
        Encapsulation objek=new Encapsulation();
        objek.ModifNama("Aulia Fitri");
        objek.ModifAddress("Jalan Gatot Subroto No.15 Medan");
        objek.ModifNim(191232009);
        System.out.println("Nama: "+objek.getNama());
        System.out.println("Alamat: "+objek.getAddress());
        System.out.println("Nim: "+objek.getNim());
    }
}
