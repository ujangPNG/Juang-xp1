/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tm1;

class Tabung
{
    double tinggi;
    double jarijari;
}
public class luast_1
{
    public static void main(String[] args) 
    {
        double ltab;
        Tabung p = new  Tabung();
        p.tinggi = 15;
        p.jarijari = 10;
        ltab = 2 * Math.PI * p.jarijari * (p.jarijari + p.tinggi);
        System.out.println("Luas Tabung : " + ltab);
    }
}