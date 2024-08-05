using System;

namespace Myapk
{
    class Program
    {
        static void MyMethod(string country = "norway")
        {
            Console.WriteLine(country);
        }
        static void  Main(string[] args)
        {
        MyMethod("Sweden");
        MyMethod("India");
        MyMethod("USA");
        MyMethod("");

        }
    }
}