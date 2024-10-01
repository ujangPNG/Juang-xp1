package modul2.tm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ling_bf 
{
    public static void main(String[]args) throws IOException
    {
        double keliling, jari;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("Masukkan jari-jari: ");
        jari = Double.parseDouble(br.readLine());
        
        keliling = Math.PI * 2 * jari;
        System.out.println("Keliling: "+keliling);
    }
}
