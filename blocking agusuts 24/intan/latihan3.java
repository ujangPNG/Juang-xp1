public class latihan3 {
    public static void main(String[] args) {
        PenjualAlatTulis penjual = new PenjualAlatTulis();

        penjual.setJumlahBolpoint(10);
        penjual.setJumlahPensil(10);
        penjual.setJumlahPenghapus(10);
        penjual.setHargaBolpoint(2000);
        penjual.setHargaPensil(1000);
        penjual.setHargaPenghapus(500);
        penjual.hitungTotalHarga();
        System.out.println("Total Harga: Rp. " + penjual.getTotalHarga());
    }
}

class PenjualAlatTulis {
    private int jumlahBolpoint;
    private int jumlahPensil;
    private int jumlahPenghapus;
    private int hargaBolpoint;
    private int hargaPensil;
    private int hargaPenghapus;
    private int totalHarga;

    public void setJumlahBolpoint(int jumlahBolpoint) {
        this.jumlahBolpoint = jumlahBolpoint;
    }

    public int getJumlahBolpoint() {
        return jumlahBolpoint;
    }

    public void setJumlahPensil(int jumlahPensil) {
        this.jumlahPensil = jumlahPensil;
    }

    public int getJumlahPensil() {
        return jumlahPensil;
    }

    public void setJumlahPenghapus(int jumlahPenghapus) {
        this.jumlahPenghapus = jumlahPenghapus;
    }

    public int getJumlahPenghapus() {
        return jumlahPenghapus;
    }

    public void setHargaBolpoint(int hargaBolpoint) {
        this.hargaBolpoint = hargaBolpoint;
    }

    public int getHargaBolpoint() {
        return hargaBolpoint;
    }

    public void setHargaPensil(int hargaPensil) {
        this.hargaPensil = hargaPensil;
    }

    public int getHargaPensil() {
        return hargaPensil;
    }

    public void setHargaPenghapus(int hargaPenghapus) {
        this.hargaPenghapus = hargaPenghapus;
    }

    public int getHargaPenghapus() {
        return hargaPenghapus;
    }

    public void hitungTotalHarga() {
        totalHarga = (jumlahBolpoint * hargaBolpoint) + 
                     (jumlahPensil * hargaPensil) + 
                     (jumlahPenghapus * hargaPenghapus);
    }

    public int getTotalHarga() {
        return totalHarga;
    }
}
