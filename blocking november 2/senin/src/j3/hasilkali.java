/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j3;

/**
 *
 * @author vfz
 */
class Kali {
    double a, b;

    void hasil() {
        System.out.println("Hasil perkalian = " + (a * b));
    }
}

public class hasilkali {
    public static void main(String[] args) {
        Kali variabel1, variabel2;
        variabel1 = new Kali();
        variabel2 = new Kali();

        variabel1.a = 3;
        variabel1.b = 6;

        variabel2.a = 5;
        variabel2.b = 10;

        variabel1.hasil();
        variabel2.hasil();
    }
}
