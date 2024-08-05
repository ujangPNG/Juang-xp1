using System;
class Persegi
{
    double sisi;
    public Persegi(double sisi)
    {
        this.sisi = sisi;
    }
    public double luasPersegi()
    {
        return sisi * sisi;
    }
    public double kelilingPersegi()
    {
        return 4 * sisi;
    }
}
class Program
{
    static void Main()
    {
        Console.Write("Masukkan panjang sisi persegi: ");
        double sisi = Convert.ToDouble(Console.ReadLine());

        Persegi persegi = new Persegi (sisi);
        double luas = persegi.luasPersegi();
        double keliling = persegi.kelilingPersegi();

        Console.WriteLine("Luas persegi: "+ luas);
        Console.WriteLine("keliling persegi: "+keliling);
    }
}