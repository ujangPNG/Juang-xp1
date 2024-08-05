using System;
namespace Myapk
{
    class Program
    {
        static void MyMethod(string child1, string child2, string child3)
        {
            Console.WriteLine("The youst child is: " + child3);
        }
        static void Main(string[]args)
        {
            MyMethod(child3: "John", child1:"Liam",child2:"Liam");
        }
    }
}