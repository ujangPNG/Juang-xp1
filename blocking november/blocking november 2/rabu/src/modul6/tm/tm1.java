package modul6.tm;
abstract class Balok {
    abstract public void vBalok();
    int sisi, volume;

    public void balok() {
        sisi = 10;
        System.out.println("Sisi: " + sisi);
    }
}
class V extends Balok {
    public void vBalok() {
        volume = sisi * sisi * sisi;
        System.out.println("Volume balok: " + volume);
        System.out.println(" ");
    }
}
abstract class Bola {
    abstract public void vBola();
    double volb, jari, pat, ga;

    public void bola() {
        jari = 10;
        pat = 4;
        ga = 3;
        System.out.println("Jari-jari: " + jari);
    }
}
class VB extends Bola {
    public void vBola() {
        volb = (pat / ga) * Math.PI * (jari * jari * jari);
        System.out.println("Volume bola: " + volb);
        System.out.println(" ");
    }
}
class TM1 {
    public static void main(String[] args) {
        V object1 = new V();
        object1.balok();
        object1.vBalok();

        VB object2 = new VB();
        object2.bola();
        object2.vBola();
    }
}
