/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author vfz
 */
import java.util.Scanner;

class tm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan pembilang: ");
            int pembilang = scanner.nextInt();

            System.out.print("Masukkan penyebut: ");
            int penyebut = scanner.nextInt();

            int hasil = pembilang / penyebut;
            System.out.println("Hasil pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
