/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author vfz
 */
public class Array2 {
    private String[][] Mahasiswa;
    private int[][] data, hasil;
    public void setMahasiswa(String[][] Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }
    public String[][] getMahasiswa() {
        return Mahasiswa;
    }
    public void setData(int[][] data) {
        this.data = data;
    }
    public int[][] getData() {
        return data;
    }

    public void setPerkalianSkalar(int[][] data, int a) {
        hasil = new int[data.length][data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                hasil[i][j] = a * data[i][j];
            }
        }
    }
    public int[][] getPerkalianSkalar() {
        return hasil;
    }
    public void tampil(String a) {
        System.out.println(a);
    }
    public void tampil(String[][] data) {
        for (String[] row : data) {
            for (String element : row) {
                System.out.print(element + "  ");
            }
            System.out.println();
        }
    }
    public void tampil(int[][] data) {
        for (int[] row : data) {
            for (int element : row) {
                System.out.print(element + "   ");
            }
            System.out.println();
        }
    }
    public void hapus() {
        Mahasiswa = null;
        data = null;
        hasil = null;
    }
}
