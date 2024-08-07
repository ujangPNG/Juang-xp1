/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object1;

/**
 *
 * @author vfz
 */
public class contoh5 {
    public static void main(String[]args){
        sepedaMotor motor=new sepedaMotor();
        motor.setMerk("Suzuki");
        System.out.println("Motor ini bermerk "+motor.getMerk());
        System.out.println("Motor ini berharga "+motor.Harga(11000000));
    }
}
