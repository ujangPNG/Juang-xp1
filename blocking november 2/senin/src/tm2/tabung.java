/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tm2;

import java.util.Scanner;

public class tabung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double jari = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = scanner.nextDouble();

        double vol = Math.PI * Math.pow(jari, 2) * tinggi;

        System.out.println("Vol tabung: " + vol);

        scanner.close();
    }
}
