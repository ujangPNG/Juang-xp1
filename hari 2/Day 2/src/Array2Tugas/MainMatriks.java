/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array2Tugas;

/**
 *
 * @author PC-10
 */
public class MainMatriks {
    public static void main(String[] args) {
        Matriks matrix = new Matriks();

        int[][] matrixA = {
            {1, 2},
            {3, 5},
            {6, 7}
        };

        int[][] matrixB = {
            {8, 9},
            {10, 11},
            {12, 13}
        };

        int[][] matrixC = matrix.addMat(matrixA, matrixB);

        matrix.setMatrix(matrixC);
        System.out.println("Matrix C ( A + B):");
        matrix.displayMatrix();

        matrix.kali(0.5);

        System.out.println("Matrix C (x 0.5):");
        matrix.displayMatrix();
    }
}
