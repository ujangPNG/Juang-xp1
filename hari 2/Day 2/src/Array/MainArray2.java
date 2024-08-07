/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author vfz
 */
public class MainArray2 {
    public static void main(String[] args)
    {   Array2 ob = new Array2();
        String [][] Mhs = {
            {"NIM", "NAMA"},
            {"17650123", "DAVID"},
            {"17650124", "AHMAD"},
            {"17650125", "RATIH"},
            {"17650126", "DINA"},
        };
        ob.tampil("Data Mahasiswa : ");
        ob.setMahasiswa(Mhs);
        ob.tampil(ob.getMahasiswa());
        ob.tampil("=================");
        int[][] data = {
            {1,2},
            {3,4},
            {5,6}
        };
        int pengali = 2;
        ob.tampil("Data Matrik : ");
        ob.setData(data);
        ob.tampil(ob.getData());
        ob.tampil("Data Matrik X "+pengali+" : ");
        ob.setPerkalianSkalar(data,pengali);
        ob.tampil(ob.getPerkalianSkalar());
        
        
        ob.hapus();
        Mhs = null;
        data = null;
        ob = null;
    }
}