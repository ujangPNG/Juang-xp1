/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tm1;

class Trapesium
{
    double panjang;
    double lebar;
    double tinggi;
    double bb;
    double ba;
}
public class luastr
{
    public static void main(String[] args) 
    {
        double luastr;
        Trapesium b = new  Trapesium();
        b.tinggi = 15;
        b.panjang = 10;
        b.lebar = 10;
        b.ba= 1;
        b.bb= 2;
        luastr = b.ba / b.bb * (b.panjang * b.lebar) * b.tinggi;
        System.out.println("Luas Trapesium : " + luastr);
    }
}