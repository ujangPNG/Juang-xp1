/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

/**
 *
 * @author vfz
 */
public class over1 {
    public void Tampil(){
        System.out.println("I love Java");
    }
    public void Tampil(int i){
        System.out.println("Method dengan 1 Parameter = "+i);
    }
    public void Tampil(int i,int j){
        System.out.println("Method dengan 2 Parameter = "+i+" & "+j);
    }
    public void Tampil(String str){
        System.out.println(str);
    }
    public static void main(String a[]){
       over1 objek = new over1();
       objek.Tampil();
       objek.Tampil(8);
       objek.Tampil(6,7);
       objek.Tampil("Hello world");
    }
}
