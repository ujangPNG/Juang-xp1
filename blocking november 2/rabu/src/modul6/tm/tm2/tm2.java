/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6.tm.tm2;

/**
 *
 * @author vfz
 */
public class tm2 {
        public static void main(String[]args)
    {
        Encapsulation2 objek=new Encapsulation2();
        objek.ModifNama("Aulia Fitri");
        objek.ModifAddress("Jalan Gatot Subroto No.15 Medan");
        objek.ModifNim(191232009);
        System.out.println("Nama: "+objek.getNama());
        System.out.println("Alamat: "+objek.getAddress());
        System.out.println("Nim: "+objek.getNim());
        //===============================================================
        objek.Modifuniv("UGM");
        objek.Modiffakultas("Informatika");
        objek.Modifjurusan("Komputer");
        objek.Modifemail("tesakun123@gmail.com");
        objek.Modifhobi("Mancing");
        objek.Modifkeahlian("Ngoding");
        objek.Modifpekerjaan("Nganggur");
        objek.Modifkarya("Model V-Tuber");
       
        //============================================================
        System.out.println("Jurusan: "+objek.getjurusan());
        System.out.println("Fakultas: "+objek.getfakultas());
        System.out.println("Universitas: "+objek.getuniv());
        System.out.println("Email: "+objek.getemail());
        System.out.println("Hobi: "+objek.gethobi());
        System.out.println("Keahlian: "+objek.getkeahlian());
        System.out.println("Pekerjaan: "+objek.getpekerjaan());
        System.out.println("Karya: "+objek.getkarya());
    }
}
