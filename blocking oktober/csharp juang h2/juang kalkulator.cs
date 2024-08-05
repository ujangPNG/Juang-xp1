using System;
public class program
{
    public static void Main(string[] args)
    {
        int num1= 0; int num2=0;
        Console.WriteLine("Console Kalkulator C#\r");
        Console.WriteLine("-----------------------\n");

        Console.WriteLine("Masukkan angka, lalu enter.");
        num1=Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Masukkan angka kedua, lalu enter.");
        num2=Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Pilih opsi");
        Console.WriteLine("\ta - Tambah");
        Console.WriteLine("\ts - Kurang");
        Console.WriteLine("\tm - Kali");
        Console.WriteLine("\td - Bagi");
        Console.Write("Opsi-mu? ");

        switch (Console.ReadLine())
        {
            case "a":
            Console.WriteLine($"Hasil: {num1}+{num2} = " + (num1+num2));break;
            case "s":
            Console.WriteLine($"Hasil: {num1}-{num2} = " + (num1-num2));break;
            case "m":
            Console.WriteLine($"Hasil: {num1}*{num2} = " + (num1*num2));break;
            case "d":
            Console.WriteLine($"Hasil: {num1}/{num2} = " + (num1/num2));break;
        }
        Console.Write("Key apapun untuk menutup Console");
        Console.ReadKey();
    }
}