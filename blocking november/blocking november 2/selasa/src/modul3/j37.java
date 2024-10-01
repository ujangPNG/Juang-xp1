package modul3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vfz
 */
public class j37 {
    public static void main(String[]args)
    {
        int a,b;
        medan:
        for (a=1;a<=10;a++)
        {
            System.out.println("Perulangan pertama");
            a=a+1;
            if (a==5)
                continue medan;
        }
        System.out.println("dilanjutkan ke");
        for(b=1;b<3;b++)
        {
            System.out.println("perulangan ");
        }
    }
}
