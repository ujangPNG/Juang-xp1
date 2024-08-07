/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocking.agustus.h1.enkapsulasi1;

/**
 *
 * @author vfz
 */
public class enkapsulasi_1 {
    private int alas,tinggi;
    private double luas3;
    
    public void setAlas(int alas){
        this.alas=alas;
    }
    public int getAlas(){
        return alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi=tinggi;
    }
    public int getTinggi(){
        return tinggi;
    }
    public void setLuas3(int alas, int tinggi){
        luas3=0.5*(double)(alas*tinggi);
    }
    public double getLuas3(){
        return luas3;
    }
}
