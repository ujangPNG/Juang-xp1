/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6.j62;

/**
 *
 * @author vfz
 */
public class MainMakhlukHidup 
{
    public void cekMakhlukHidup(MakhlukHidup mHidup)
    {
        mHidup.berdiri();
        
    }
    public static void main (String[]args)
    {
        MainMakhlukHidup mh = new MainMakhlukHidup();
        
        mh.cekMakhlukHidup(new Manusia("Dua kaki"));
    }

}
