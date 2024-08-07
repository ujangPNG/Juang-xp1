/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;


public abstract class Laptop extends Komputer implements MouseBaru,Keyboard{
    public void jenis (){
        System.out.println("Jenis Mouse Laptop:"+jenis);
    }
    public void klik_kanan (){
        System.out.println("Mouse Laptop:: klik kanan ...");
    }
     public void klik_kiri (){
        System.out.println("Mouse Laptop:: klik kiri ...");
    }
     public void double_klik (){
        System.out.println("Mouse Laptop:: Double klik ...");
     }
     public void tekan_enter (){
        System.out.println("Keyboard Laptop:: Tekan Enter ...");
  }
}