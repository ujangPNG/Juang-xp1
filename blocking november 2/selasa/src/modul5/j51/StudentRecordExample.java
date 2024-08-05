/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5.j51;

/**
 *
 * @author vfz
 */
public class StudentRecordExample {
    public static void main(String[]args)
    {
        StudentRecord annaRecord=new StudentRecord();
        StudentRecord beahRecord=new StudentRecord();
        StudentRecord crisRecord=new StudentRecord();
        
        annaRecord.setName("Juang");
        beahRecord.setName("Beah");
        crisRecord.setName("cris");
        
        System.out.println(annaRecord.getName());
        
        System.out.println("Count"+StudentRecord.getStudentCount());
    }
}
