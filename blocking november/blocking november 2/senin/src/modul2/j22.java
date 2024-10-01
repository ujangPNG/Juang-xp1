/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author vfz
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class j22 
{
    public static void main(String[]args) throws IOException
    {
        String nama;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("Nama: ");
        nama=br.readLine();
    }
}
