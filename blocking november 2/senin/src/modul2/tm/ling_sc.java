/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vfz
 */
import java.util.Scanner;

public class ling_sc 
{
    public static void main(String[]args)
    {
        double keliling, jari;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari: ");
        jari = Double.parseDouble(input.nextLine());
        
        keliling = Math.PI * 2 * jari;
        System.out.println("Keliling: "+keliling);
        
    }
}
