/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocking.agustus.h4;

/**
 *
 * @author vfz
 */
public class session {
    public static String UserID,Nama,StatusLogin;
    public static void setUserID(String UserID){
        session.UserID=UserID;
    }
    public String getUserID(){
        return UserID;
    }
    public static void setNama(String Nama){
        session.Nama=Nama;
    }
    public String getNama(){
        return Nama;
    }
    public static void setStatusLogin(String StatusLogin){
        session.StatusLogin=StatusLogin;
    }
    public String getStatusLogin(){
        return StatusLogin;
    }
}
