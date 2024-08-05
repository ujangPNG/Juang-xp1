using System;

public class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Penghitungan Nilai Rapor Siswa");

        Console.Write("nama Siswa: ");
        string nama = Console.ReadLine();
        Console.Write("Kelas: ");
        string kelas = Console.ReadLine();

        Console.Write("Nilai Pengetahuan: ");
        double nilai = Convert.ToDouble(Console.ReadLine());
        Console.Write("Nilai Keterampilan: ");
        double keterampilan = Convert.ToDouble(Console.ReadLine());
        Console.Write("Nilai Ulangan Harian: ");
        double UH = Convert.ToDouble(Console.ReadLine());
        Console.Write("Nilai Ujian Akhir: ");
        double nilaiujian = Convert.ToDouble(Console.ReadLine());

        double rataRapor = (nilai + keterampilan + UH + nilaiujian) / 4;

        Console.WriteLine("\nData Siswa");
        Console.WriteLine("nama Siswa: " + nama);
        Console.WriteLine("Kelas: " + kelas);
        Console.WriteLine("\n====Nilai Rapot====");
        Console.WriteLine("Nilai Pengetahuan: " + nilai);
        Console.WriteLine("Nilai Keterampilan: " + keterampilan);
        Console.WriteLine("Nilai Ulangan Harian: " + UH);
        Console.WriteLine("Nilai Ujian Akhir: " + nilaiujian);
        Console.WriteLine("Rata-rata Nilai Rapor: " + rataRapor);

        string predikat = "";
        if (rataRapor >= 76)
            predikat = "Tidak";
        else if (rataRapor <= 75)
            predikat = "Ya";
        else
            predikat = "Ya";

        Console.WriteLine("Remedial? : " + predikat);
    }
}
