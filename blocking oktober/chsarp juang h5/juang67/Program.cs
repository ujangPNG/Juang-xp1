using System;
namespace Myapk
{
    class Program
    {
        static int MyMethod(int x, int y)
        {
            return x + y;
        }
        static void Main(string[]args)
        {
            Console.WriteLine(MyMethod(5,3));
        }
    }
}