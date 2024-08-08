/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blocking.agustus.h4;

/**
 *
 * @author vfz
 */
public class Main {
    public static void main (String[]args){
        try{
            form form = new form();
            form.setVisible(True);
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
