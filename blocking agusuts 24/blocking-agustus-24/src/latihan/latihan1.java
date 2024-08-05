/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author vfz
 */
public class latihan1 {
    private String nama;
    private int stok;
    private int harga1an;
    private int harga;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
        updateHarga();
    }

    public void setHarga1(int harga1an) {
        this.harga1an = harga1an;
        updateHarga();
    }

    private void updateHarga() {
        this.harga = this.stok * this.harga1an;
    }

    public String getInfo() {
        return "Nama Alat Tulis : " + this.nama + "\nStok : " + this.stok + "\nHarga 1: " + this.harga1an + "\nHarga " + this.nama + " : " + this.harga + "\n";
    }

    public int getHarga() {
        return this.harga;
    }

    public static void main(String[] args) {
        latihan1 bolpoint = new latihan1();
        bolpoint.setNama("Bolpoint");
        bolpoint.setStok(10);
        bolpoint.setHarga1(2000);

        latihan1 pensil = new latihan1();
        pensil.setNama("Pensil");
        pensil.setStok(10);
        pensil.setHarga1(1000);

        latihan1 penghapus = new latihan1();
        penghapus.setNama("Penghapus");
        penghapus.setStok(10);
        penghapus.setHarga1(500);

        System.out.println(bolpoint.getInfo());
        System.out.println(pensil.getInfo());
        System.out.println(penghapus.getInfo());

        int totalHarga = bolpoint.getHarga() + pensil.getHarga() + penghapus.getHarga();
        System.out.println(" Harga: " + totalHarga);
    }
}
