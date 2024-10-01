/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j4;

class konstruktor
{
    int panjang, lebar;
    
    konstruktor()
    {
        panjang = 15;
        lebar = 4;
    }
    int luas()
    {
        return(panjang*lebar);
    }
}
public class hitung 
{
 
    public static void main(String[] args)
 {
     konstruktor k1, k2;
     k1 = new konstruktor();
     k2 = new konstruktor();
     
     System.out.println("Luas Persegi panjang k1: "+k1.luas());
     System.out.println("Luas Persegi panjang k2: "+k2.luas());
 }
}
