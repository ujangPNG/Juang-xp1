/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tm1;

class Persegi
{
    double panjang;
    double lebar;
    double tinggi;
}
public class luasp
{
    public static void main(String[] args) 
    {
        double luas;
        Persegi a = new  Persegi();
        a.tinggi = 15;
        a.panjang = 10;
        a.lebar = 10;
        luas = a.panjang * a.lebar * a.tinggi;
        System.out.println("Luas Persegi Panjang : " + luas);
    }
}