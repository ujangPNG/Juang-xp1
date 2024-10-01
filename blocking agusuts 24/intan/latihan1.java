public class latihan1 {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int hargaTotal;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
        updateHargaTotal();
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
        updateHargaTotal();
    }

    private void updateHargaTotal() {
        this.hargaTotal = this.stok * this.hargaSatuan;
    }

    public String getInfo() {
        return "Nama Alat Tulis : " + this.nama + "\nStok : " + this.stok + "\nHarga Satuan: " + this.hargaSatuan + "\nHarga " + this.nama + " : " + this.hargaTotal + "\n";
    }

    public int getHargaTotal() {
        return this.hargaTotal;
    }

    public static void main(String[] args) {
        latihan1 bolpoint = new latihan1();
        bolpoint.setNama("Bolpoint");
        bolpoint.setStok(10);
        bolpoint.setHargaSatuan(2000);

        latihan1 pensil = new latihan1();
        pensil.setNama("Pensil");
        pensil.setStok(10);
        pensil.setHargaSatuan(1000);

        latihan1 penghapus = new latihan1();
        penghapus.setNama("Penghapus");
        penghapus.setStok(10);
        penghapus.setHargaSatuan(500);

        System.out.println(bolpoint.getInfo());
        System.out.println(pensil.getInfo());
        System.out.println(penghapus.getInfo());

        int totalHarga = bolpoint.getHargaTotal() + pensil.getHargaTotal() + penghapus.getHargaTotal();
        System.out.println("Total Harga: " + totalHarga);
    }
}