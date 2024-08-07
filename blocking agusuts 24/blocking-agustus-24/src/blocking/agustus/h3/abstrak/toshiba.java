/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocking.agustus.h2.abstrak;

/**
 *
 * @author vfz
 */
public class toshiba extends laptop{
    toshiba(String merk)
    {
        setMerk(merk);
        merk=null;
    }
    protected void setMerk(String merk){
        this.merk=merk;
        merk=null;
    }
    protected String getMerk(){
        return merk;
    }
    protected void setPemilik(String pemilik)
    {
        this.pemilik=pemilik;
        pemilik=null;
    }
    protected String getPemilik(){
        return this.pemilik;
    }
    protected void tampil(){
        System.out.println(getPemilik()+"memiliki laptop merk "+getMerk());
    }
    protected void hapus(){
        merk=null;
        pemilik=null;
    }
}
