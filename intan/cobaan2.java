public class cobaan2 {
    static void cetak(int a) {
        System.out.println("nilai x: "+a);
    }
    public static void main(String[] args) {
        int x;
        for (x=0; x<3; x++) {
            cetak(x);
        }
        System.out.println("nilai x terakhir: "+x);
    }
}