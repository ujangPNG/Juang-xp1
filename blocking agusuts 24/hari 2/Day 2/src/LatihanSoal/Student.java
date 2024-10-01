/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanSoal;

/**
 *
 * @author PC-10
 */
public class Student extends Person {
    private int departmentCode;
    private static final String[] DEPARTMENTS = {
        "Unknown", "Matematika", "Biologi", "Kimia", "Fisika", "Teknik Informatika", "Teknik Arsitektur"
    };

    // Constructor
    public Student(String nim, String name, String address, int departmentCode) {
        super(nim, name, address);
        this.departmentCode = departmentCode;
    }

    // Getter and Setter for departmentCode
    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    // Method to get department name from code
    public String getDepartment() {
        return departmentCode >= 61 && departmentCode <= 66 ? DEPARTMENTS[departmentCode - 60] : "Unknown";
    }
}
