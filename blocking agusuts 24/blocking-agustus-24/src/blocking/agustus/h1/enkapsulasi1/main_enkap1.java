/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapsulasi1;

/**
 *
 * @author vfz
 */
public class main_enkap1 {
    public static void main(String[]args){
        enkapsulasi_1 ob=new enkapsulasi_1();
        ob.setAlas(5);
        ob.setTinggi(7);
        System.out.println("Alas Segitiga: "+ob.getAlas());
        System.out.println("Tinggi Segitiga: "+ob.getTinggi());
        ob.setLuas3(ob.getAlas(),ob.getTinggi());
        System.out.println("Luas Segitiga: "+ob.getLuas3());
    }
}
