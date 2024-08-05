/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4.tm;

/**
 *
 * @author vfz
 */
import java.util.Scanner;

public class tm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriksX = new int[2][2];
        System.out.println("Masukkan elemen matriks X (ordo 2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Masukkan elemen X[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriksX[i][j] = scanner.nextInt();
            }
        }

        int[][] matriksY = new int[2][2];
        System.out.println("Masukkan elemen matriks Y (ordo 2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Masukkan elemen Y[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriksY[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Pilih operasi:");
        System.out.println("1. Perkalian matriks");
        System.out.println("2. Pengurangan matriks");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                int[][] hasilPerkalian = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        hasilPerkalian[i][j] = matriksX[i][0] * matriksY[0][j] + matriksX[i][1] * matriksY[1][j];
                    }
                }

                System.out.println("Hasil perkalian matriks:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(hasilPerkalian[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                int[][] hasilPengurangan = new int[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        hasilPengurangan[i][j] = matriksX[i][j] - matriksY[i][j];
                    }
                }

                System.out.println("Hasil pengurangan matriks:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(hasilPengurangan[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
