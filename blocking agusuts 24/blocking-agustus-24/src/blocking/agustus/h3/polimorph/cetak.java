/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocking.agustus.h3.polimorph;

/**
 *
 * @author vfz
 */
public class cetak extends poli{
    private void tampil(poli[]obj){
        for (int i =0;i<obj.length;i++){
            obj[1].gambar();
            obj[i].hapus();
            System.out.println("============");
        }
    }
    
    public static void main (String []args){
        poli[]obj={ new lingkar(), new elips(),new segi3()};
        cetak cetak=new cetak();
        
        cetak.gambar();
        cetak.hapus();
        System.out.println("=================");
        
        cetak.tampil(obj);
    }
}
