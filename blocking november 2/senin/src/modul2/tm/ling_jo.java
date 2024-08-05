package modul2.tm;

import javax.swing.JOptionPane;

public class ling_jo 
{
    public static void main(String[]args)
    {
        double jari;
        String input=JOptionPane.showInputDialog("Masukkan Jari-Jari");
        jari=Double.parseDouble(input);
        
        double keliling = 2*Math.PI*jari;
        
        String msg="Keliling: "+keliling;
        JOptionPane.showMessageDialog(null,msg);
    }
}
