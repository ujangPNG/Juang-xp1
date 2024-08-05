using System;
namespace Myapk
{
    class Program 
    {
        static void Main(string[]args)
        {
            string[]cars={"Volvo","BMW","Ford","Mazda"};
            Array.Sort (cars);
            foreach (string i in cars)
            {
                Console.WriteLine(i);
            }
            int[]myNumbers={5,1,8,9};
            Array.Sort (myNumbers);
            foreach (int i in myNumbers)
            {
                Console.WriteLine(i);
            }
        }
    }
}