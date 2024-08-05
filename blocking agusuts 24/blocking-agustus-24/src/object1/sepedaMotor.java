/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object1;

/**
 *
 * @author vfz
 */
class sepedaMotor {
    private String merk;
    @SuppressWarnings("unused")
    private long harga;
    
    public void setMerk(String merkMotor){
        merk=merkMotor;
    }
    public String getMerk(){
        return merk;
    }
    public long Harga(long hargaMotor){
        return harga=hargaMotor;
    }
}
