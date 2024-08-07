/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

public class CetakGambar extends Bentuk{
    private void tampil (Bentuk[] obj) {
        for (int i = 0; i<obj.length;i++)
        {
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("===========");
            
        }
    }
    public static void main (String [] args) {
        Bentuk[] obj = { new Lingkaran(),
                         new Elips(),
                         new Segitiga()
        };
        CetakGambar cetak = new CetakGambar();
        cetak.gambar();
        cetak.hapus();
        System.out.println("===========");
        cetak.tampil(obj);
    }
}
