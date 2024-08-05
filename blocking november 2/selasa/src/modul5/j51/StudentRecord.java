/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5.j51;

/**
 *
 * @author vfz
 */
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mtk;
    private double ing;
    private double ipa;
    private double rata;
    
    private static int jumlahsiswa;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String temp)
    {
        name=temp;
    }
    
    public double getAverage()
    {
        double hasil =0;
        hasil=(mtk+ing+ipa)/3;
        
        return hasil;
    }
    public static int getStudentCount()
    {
        return jumlahsiswa;
    }
}