Console.WriteLine("\n===========Aplikasi Penghitung Umur===========");

Console.Write("Tahun lahirmu: ");
int tahunLahir = int.Parse(Console.ReadLine());

Console.Write("Bulan lahirmu (1-12): ");
int lahirbln = int.Parse(Console.ReadLine());

DateTime tggl = DateTime.Now;
int thn = tggl.Year;
int bln = tggl.Month;
int umurT = thn - tahunLahir;
int umurB = bln - lahirbln;

if (umurB < 0)
{
umurT--;
umurB = 12 - Math.Abs(umurB);
}

Console.WriteLine("Umur Anda adalah: " + umurT + " tahun " + umurB + " bulan.");