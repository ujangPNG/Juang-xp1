using System;

public class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine("   ===APLIKASI PENGHITUNG BMI===   ");

        Console.Write("Nama: ");
        string nama = Console.ReadLine();

        Console.Write("Tinggi badan(cm): ");
        double tinggi = Convert.ToDouble(Console.ReadLine());
        Console.Write("Berat: ");
        double Berat = Convert.ToDouble(Console.ReadLine());

        double tinggiK = (tinggi/100);
        double tinggiC = (tinggiK*tinggiK);
        double bmi = ( Berat/tinggiC );

        Console.WriteLine("\n===Data===");        
        Console.WriteLine("Nama: " + nama);
        Console.WriteLine("Tinggi badan: " + tinggi+("cm"));
        Console.WriteLine("Berat: " + Berat);

        string predikat = "";
        if (bmi > 22.9)
            predikat = "Gemuk";
        if (bmi < 18.5)
            predikat = "Kurus";
        if (bmi > 18.5 && bmi< 22.9)
            predikat = "Ideal";
        if (bmi>30)
            predikat="Obesitas";

        Console.WriteLine("Hasil : "+ bmi);
        Console.WriteLine("Predikat: "+ predikat);}}