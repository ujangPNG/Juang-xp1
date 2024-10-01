public class Overloading {
    public void Tampil() {
        System.out.println("I LOVE JAVA");
    }
    public void Tampil(int i){
        System.out.println("method dengan 1 paramenter = "+i);
    }
    public void Tampil(int i, int j) {
        System.out.println("method dengan 2 paramenter = "+i+" & "+j);
    }
    public void Tampil(String str){
        System.out.println(str);
    }

    public static void main(String a[]){
        Overloading objek = new Overloading();
        objek.Tampil();
        objek.Tampil(8);
        objek.Tampil(6,7);
        objek.Tampil("hello world");
    }
}