﻿using System;

namespace Myapk
{
    class Program
    {
        static void MyMethod(string fname)
        {
            Console.WriteLine(fname + " Refsnes");
        }
        static void  Main(string[] args)
        {
        MyMethod("Liam");
        MyMethod("Jenny");
        MyMethod("Anja");
        }
    }
}