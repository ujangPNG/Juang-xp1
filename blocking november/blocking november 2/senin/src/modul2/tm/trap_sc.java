package modul2.tm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vfz
 */
import java.util.Scanner;

public class trap_sc 
{
    public static void main(String[]args)
    {
        double panjang, lebar, tinggi, luas, a, b;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        panjang = Double.parseDouble(input.nextLine());
        
        System.out.print("Masukkan lebar: ");
        lebar = Double.parseDouble(input.nextLine());
        
        System.out.print("Masukkan tinggi: ");
        tinggi = Double.parseDouble(input.nextLine());
        
        a=1;
        b=2;
        
        luas = a/b * (panjang*lebar)*tinggi;
        System.out.println("Luas: "+luas);
        
    }
}
