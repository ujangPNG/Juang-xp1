using System;
class Program
{
    static void Main(string[]args)
    {
        Console.WriteLine("Buat akun");

        Console.Write("Username: ");
        string usn=Console.ReadLine();
        Console.Write("Password: ");
        string pass=Console.ReadLine();

        Console.WriteLine("\nLogin");

        Console.Write("Masukkan Username: ");
        string inusn=Console.ReadLine();
        Console.Write("Massukan Password: ");
        string inpass=Console.ReadLine();

        if (usn==inusn && pass==inpass)
        {
            Console.WriteLine("Login berhasil!");
        }
        else
        {
            Console.WriteLine("Username/Password salah.");
        }
    }
}