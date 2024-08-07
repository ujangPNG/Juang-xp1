/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocking.agustus.h3.abstrak;

/**
 *
 * @author vfz
 */
public final class cetak {
    private final String barang="Laptop";
    private final void ceetak(laptop[]ob,String pemilik){
        System.out.println("Nama Barang: "+barang);
        System.out.println("");
        
        for(int i=0;i<ob.length;i++){
            ob[i].getMerk();
            ob[i].setPemilik(pemilik);
            ob[i].getPemilik();
            ob[i].tampil();
            ob[i].hapus();
            System.out.println("###################");}
        ob=null;
    pemilik=null;
    
        }
    public static void main(String[]args){
        String pemilik="Ahmad ";
        laptop[]ob={
            new asus("Asus"),
            new dell("Dell"),
            new toshiba("Toshiba")
        };
        cetak abc=new cetak();
        abc.ceetak(ob,pemilik);
        
        pemilik=null;
        ob=null;
        abc=null;
    }
}

