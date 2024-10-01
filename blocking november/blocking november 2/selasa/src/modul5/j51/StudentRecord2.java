package modul5.j51;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author vfz
 */
public class StudentRecord2 {
    private String name;
    private String address;
    private int age;
    private double mtk;
    private double ing;
    private double ipa;
    private double rata;
   
    
    public void setName(String temp)
    {
        name=temp;
    }
    public String getName()
    {
        return name;
    }
    public void setAddress(String temp)
    {
        address= temp;
    }
    public void setAge(int temp)
    {
        age=temp;
    }
    public void setMtk(double temp)
    {
        mtk=temp;
    }
    public double getMtk()
    {
        return mtk;
    }
    public void setIng(double temp)
    {
        ing=temp;
    }
    public double getIng()
    {
        return ing;
    }
    public void ipa(double temp)
    {
        ipa=temp;
    }
    public double getIpa()
    {
        return ipa;
    }
    public double getRata()
    {
        double hasil = 0;
        hasil=(mtk+ing+ipa)/3;
        
        return hasil;
    }
    
    public void print (String temp)
    {
        System.out.println("Nama: "+name);
        System.out.println("Alamat: "+address);
        System.out.println("Umur: "+age);
    }
    public void print (double eGrade, double mGrade, double sGrade)
    {
        System.out.println("Nama: "+name);
        System.out.println("Nilai Mtk: "+mtk);
        System.out.println("Nilai English: "+eGrade);
        System.out.println("Nilai Sains: "+sGrade);
    }
}
