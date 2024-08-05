/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5.tm;

/**
 *
 * @author vfz
 */
public class tm {
    private String nama;
    private String nim;
    private String jurusan;
    private String fakultas;
    private double ipS;
    private double ipK;

    public tm(String nama, String nim, String jurusan, String fakultas) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
    }

    public tm(String nama, String nim, String jurusan, String fakultas, double ipS) {
        this(nama, nim, jurusan, fakultas);
        this.ipS = ipS;
    }

    public tm(String nama, String nim, String jurusan, String fakultas, double ipS, double ipK) {
        this(nama, nim, jurusan, fakultas, ipS);
        this.ipK = ipK;
    }

    public void infotm() {
        System.out.println("Identitas tm:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("IP Semester: " + ipS);
        System.out.println("IP Kumulatif: " + ipK);
    }

    public static void main(String[] args) {
        tm mahasiswa1 = new tm("as", "123456", "Teknik Informatika", "Fakultas Teknik", 3.5, 3);
        mahasiswa1.infotm();

        System.out.println();

        tm mahasiswa2 = new tm("ae", "654321", "Manajemen Bisnis", "Fakultas Ekonomi", 3.7, 3.8);
        mahasiswa2.infotm();
    }
}

