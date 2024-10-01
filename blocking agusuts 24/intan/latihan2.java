public class latihan2 {
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

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }

    public static void main(String[] args) {
        latihan2 bolpoint = new latihan2();
        bolpoint.setNama("Bolpoint");
        bolpoint.setStok(10);
        bolpoint.setHargaSatuan(2000);

        latihan2 pensil = new latihan2();
        pensil.setNama("Pensil");
        pensil.setStok(10);
        pensil.setHargaSatuan(1000);

        latihan2 penghapus = new latihan2();
        penghapus.setNama("Penghapus");
        penghapus.setStok(10);
        penghapus.setHargaSatuan(500);

        int totalHarga = bolpoint.getHargaTotal() + pensil.getHargaTotal() + penghapus.getHargaTotal();

        System.out.println("Nama Alat Tulis: " + bolpoint.getNama());
        System.out.println("Stok: " + bolpoint.getStok());
        System.out.println("Harga Satuan: " + bolpoint.getHargaSatuan());
        System.out.println("Harga " + bolpoint.getNama() + ": " + bolpoint.getHargaTotal());

        System.out.println("Nama Alat Tulis: " + pensil.getNama());
        System.out.println("Stok: " + pensil.getStok());
        System.out.println("Harga Satuan: " + pensil.getHargaSatuan());
        System.out.println("Harga " + pensil.getNama() + ": " + pensil.getHargaTotal());

        System.out.println("Nama Alat Tulis: " + penghapus.getNama());
        System.out.println("Stok: " + penghapus.getStok());
        System.out.println("Harga Satuan: " + penghapus.getHargaSatuan());
        System.out.println("Harga " + penghapus.getNama() + ": " + penghapus.getHargaTotal());

        System.out.println("Total Harga: " + totalHarga);
    }
}