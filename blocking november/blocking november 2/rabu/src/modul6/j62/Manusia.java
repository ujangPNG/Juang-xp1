/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6.j62;

/**
 *
 * @author vfz
 */
public class Manusia extends MakhlukHidup
{
    private String duaKaki;
    private String bernafas;
    
    public Manusia (String duaKaki)
    {
        this.duaKaki=duaKaki;
    }
    public void berdiri()
    {
        System.out.println("Manusia berdiri menggunakan: "+duaKaki);
    }
}
