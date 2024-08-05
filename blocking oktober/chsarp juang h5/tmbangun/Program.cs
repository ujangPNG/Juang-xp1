using System;
public class bangundatar 
{
    public double Lpersegi(double sisi) 
    {
        return sisi * sisi;
    }
    public double Lpp(double panjang, double lebar) 
    {
        return panjang * lebar;
    }
    public double Lsegtig(double alas, double tinggi)
    {
        return 0.5 * alas * tinggi;
    }
    public double Lling(double radius) 
    {
        return Math.PI * radius * radius;
    }
    public double Ljajar(double alas, double tinggi) 
    {
        return alas * tinggi;
    }
}

public class program {
    public static void Main() {
        bangundatar bangundatar = new bangundatar();
        Console.WriteLine("\n==========================================");
        Console.WriteLine("Luas persegi: " + bangundatar.Lpersegi(5));
        Console.WriteLine("Luas persegi panjang: " + bangundatar.Lpp(5, 6));
        Console.WriteLine("Luas segitiga: " + bangundatar.Lsegtig(5, 10));
        Console.WriteLine("Luas lingkaran: " + bangundatar.Lling(7));
        Console.WriteLine("Luas jajar genjang: " + bangundatar.Ljajar(5, 10));
        Console.WriteLine("\n==========================================");
    }
}