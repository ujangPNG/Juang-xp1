class BR {
    public double hvolum() {
        return 0;
    }

    public void info() {
        System.out.println("Ini adalah sebuah bangun ruang");
    }
}
class Kubus extends BR {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hvolum() {
        return Math.pow(sisi, 3);
    }

    public void info() {
        System.out.println("Kubus dengan sisi: " + sisi);
    }
}
class Balok extends BR {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double hvolum() {
        return panjang * lebar * tinggi;
    }

    public void info() {
        System.out.println("Balok dengan panjang, lebar, dan tinggi: " + panjang + ", " + lebar + ", " + tinggi);
    }
}
class Tabung extends BR {
    private double jari, tinggi;

    public Tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
    public double hvolum() {
        return Math.PI * Math.pow(jari, 2) * tinggi;
    }

    public void info() {
        System.out.println("Tabung dengan jari-jari dan tinggi: " + jari + ", " + tinggi);
    }
}
class Kerucut extends BR {
    private double jari, tinggi;

    public Kerucut(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
    public double hvolum() {
        return (1.0 / 3.0) * Math.PI * Math.pow(jari, 2) * tinggi;
    }
    public void info() {
        System.out.println("Kerucut dengan jari-jari dan tinggi: " + jari + ", " + tinggi);
    }
}
class Limas extends BR {
    private double lalas, tinggi;

    public Limas(double lalas, double tinggi) {
        this.lalas = lalas;
        this.tinggi = tinggi;
    }
    public double hvolum() {
        return (1.0 / 3.0) * lalas * tinggi;
    }

    public void info() {
        System.out.println("Limas dengan luas alas dan tinggi: " + lalas + ", " + tinggi);
    }
}
class Prisma extends BR {
    private double lalas, tinggi;
    public Prisma(double lalas, double tinggi) {
        this.lalas = lalas;
        this.tinggi = tinggi;
    }

    public double hvolum() {
        return lalas * tinggi;
    }

    public void info() {
        System.out.println("Prisma dengan luas alas dan tinggi: " + lalas + ", " + tinggi);
    }
}
class Bola extends BR {
    private double jari;

    public Bola(double jari) {
        this.jari = jari;
    }
    public double hvolum() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jari, 3);
    }
    public void info() {
        System.out.println("Bola dengan jari-jari: " + jari);
    }
}
public class tm1 {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(5);
        kubus.info();
        System.out.println("Volume: " + kubus.hvolum());

        Balok balok = new Balok(3, 4, 5);
        balok.info();
        System.out.println("Volume: " + balok.hvolum());

        Tabung tabung = new Tabung(2, 8);
        tabung.info();
        System.out.println("Volume: " + tabung.hvolum());

        Kerucut kerucut = new Kerucut(3, 6);
        kerucut.info();
        System.out.println("Volume: " + kerucut.hvolum());

        Limas limas = new Limas(12, 4);
        limas.info();
        System.out.println("Volume: " + limas.hvolum());

        Prisma prisma = new Prisma(6, 10);
        prisma.info();
        System.out.println("Volume: " + prisma.hvolum());

        Bola bola = new Bola(4);
        bola.info();
        System.out.println("Volume: " + bola.hvolum());
    }
}
