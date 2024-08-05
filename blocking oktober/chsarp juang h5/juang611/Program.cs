using System;
namespace Myapk
{
    class Car
    {
        string color = "red";
        static void Main(string[]args)
        {
            Car MyObj1=new Car();
            Car MyObj2=new Car();
            Console.WriteLine(MyObj1.color);
            Console.WriteLine(MyObj2.color);
        }
    }
}