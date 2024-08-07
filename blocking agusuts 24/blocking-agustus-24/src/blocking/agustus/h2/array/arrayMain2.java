/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocking.agustus.h2.array;

/**
 *
 * @author vfz
 */
public class arrayMain2 {
    public static void main(String[]args){
        array2 ob=new array2();
        String[][]Mhs={
            {"NIM","NAMA"},
            {"NIM","David"},
            {"NIM","Ahamad"},
            {"NIM","Ratih"},
            {"NIM","Dina"}
        };
        ob.tampil("Data Mahasiswa : ");
        ob.setMahasiswa(Mhs);
        ob.tampil(ob.getMahasiswa());
        ob.tampil("================");
        int[][]data={
            {1,2},
            {3,4},
            {5,6}
        };
        int pengali=2;
        ob.tampil("Data Matrik : ");
        ob.setData(data);
        ob.tampil(ob.getData());
        ob.tampil("Data Matrik x "+pengali+" : ");
        ob.setKali(data,pengali);
        ob.tampil(ob.getKali());
        
        ob.hapus();
        Mhs=null;
        data=null;
        ob=null;
        }
    }

