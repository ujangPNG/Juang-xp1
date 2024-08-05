/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j2;

class variabel
{
    int lebar, panjang;
}
class Newclass22
{
    public static void main(String[] args)
    {
        double luas;
        variabel p = new variabel();
        p.panjang=20;
        p.lebar=10;
        luas = p.panjang * p.lebar;
        System.out.println("Luas Persegi: "+luas);
    }
}