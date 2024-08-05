/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.tm;

/**
 *
 * @author vfz
 */
public class tm2 {
    public static void main(String[] args) {
        System.out.println("Bilangan Ganjil:");
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nBilangan Genap:");
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
