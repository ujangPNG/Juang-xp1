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

public class tm2 {
    public static void main(String[] args) {
        String namaA = "a";
        String namaB = "b";
        String namaC = "c";

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan indeks yang ingin diakses (0 untuk a, 1 untuk b, 2 untuk c): ");
            int indeks = scanner.nextInt();

            String nama;
            switch (indeks) {
                case 0:
                    nama = namaA;
                    break;
                case 1:
                    nama = namaB;
                    break;
                case 2:
                    nama = namaC;
                    break;
                default:
                    throw new IndexOutOfBoundsException("Indeks tidak valid");
            }

            System.out.println("Nama di indeks " + indeks + ": " + nama);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan indeks: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
