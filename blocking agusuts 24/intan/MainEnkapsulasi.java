public class MainEnkapsulasi {
    public static void main (String args[])
    {   Enkapsulasi ob = new Enkapsulasi();
        ob.setAlas(5);
        ob.setTinggi(7);
        System.out.println("alas segitiga: "+ob.getAlas());
        System.out.println("tinggi segitiga: "+ob.getTinggi());
        ob.setLuasSegitiga(ob.getAlas(), ob.getTinggi());
        System.out.println("luas segitiga: "+ob.getLuasSegitiga());


    }
}