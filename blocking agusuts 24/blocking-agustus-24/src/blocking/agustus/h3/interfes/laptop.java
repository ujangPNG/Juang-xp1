/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocking.agustus.h3.interfes;

/**
 *
 * @author vfz
 */
public class laptop extends pc implements keyboard{
    public void jenis(){
        System.out.println("jenis Mouse laptop: "+jenis);
    }
    public void kanan(){
        System.out.println("Mouse Laptop : kanan");
    }
    public void kiri(){
        System.out.println("Mouse Laptop : kiri");
    }
    public void doubleklik(){
        System.out.println("Mouse Laptop : Double Klik");
    }
    public void enter(){
        System.out.println("Mouse Laptop : Enter");
    }
}
