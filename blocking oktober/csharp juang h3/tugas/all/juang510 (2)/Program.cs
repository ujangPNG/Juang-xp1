using System;
namespace Myapk
{
    class Program
    {
        static void Main(string[]args)
        {
            int[,]numbers={{1,4,2},{3,6,8}};
            numbers [0,0]=5;
            Console.WriteLine(numbers[0,0]);
        }
    }
}