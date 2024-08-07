/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author vfz
 */
public class arrayMain1 {
    public static void main(String[]args){
        array1 ob=new array1();
        String mahasiswa[]={"Dono","Danu","Dana","Dini","Doni"};
        int deret[]={2,5,6,9,7};
        ob.tampil("Daftar Mahasiswa : ");
        ob.setMhs(mahasiswa);
        ob.tampil(ob.getMhs());
        ob.tampil("=====================");
        ob.tampil("Deret : ");
        ob.setDeret(deret);
        ob.tampil(ob.getDeret());
        ob.tampil("Hasil Penjumlahan Deret : ");
        ob.setJum(deret);
        ob.tampil(ob.getJum());
        
        ob.hapus();
        mahasiswa=null;
        deret=null;
        ob=null;
    }
}
  