/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4.tm;

/**
 *
 * @author vfz
 */
public class tm2 {
    public static void iden(String nama, String nim, String jurusan, String fakultas) {
        System.out.println("Identitas Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
    }

    public static void prestasi(String nama, double ipS) {
        System.out.println("\nPrestasi Akademik:");
        System.out.println("Nama: " + nama);
        System.out.println("IP Semester: " + ipS);
    }

    public static void prestasi(String nama, double ipS, double ipK) {
        prestasi(nama, ipS);
        System.out.println("IP Kumulatif: " + ipK);
    }

    public static void prestasi(String nama, double ipS, double ipK, String riwayatBeasiswa) {
        prestasi(nama, ipS, ipK);
        System.out.println("Riwayat Beasiswa: " + riwayatBeasiswa);
    }

    public static void main(String[] args) {
        iden("as", "123456", "Teknik Informatika", "Fakultas Teknik");
        prestasi("as", 3.5);
        prestasi("as", 3.5, 3.6);
        prestasi("as", 3.5, 3.6, "Beasiswa Prestasi");
    }
}
