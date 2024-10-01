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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        // Input university name
        System.out.print("Masukkan Nama Universitas: ");
        String universityName = scanner.nextLine();
        University.setUniversityName(universityName);

        boolean continueInput = true;
        while (continueInput) {
            // Input student data
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan Nama: ");
            String name = scanner.nextLine();

            System.out.print("Masukkan Alamat: ");
            String address = scanner.nextLine();

            System.out.print("Masukkan Jurusan (61 = MATEMATIKA, 62 = BIOLOGI, 63 = KIMIA, 64 = FISIKA, 65 = TEKNIK INFORMATIKA, 66 = TEKNIK ARSITEKTUR): ");
            int departmentCode = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            // Create and add student
            Student student = new Student(nim, name, address, departmentCode);
            students.add(student);

            // Ask if user wants to continue
            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            String response = scanner.nextLine();
            continueInput = response.equalsIgnoreCase("Y");
        }

        // Display all students
        System.out.println("\nDaftar Mahasiswa di Universitas " + University.getUniversityName() + ":");
        for (Student student : students) {
            System.out.println("NIM: " + student.getNim());
            System.out.println("Nama: " + student.getName());
            System.out.println("Alamat: " + student.getAddress());
            System.out.println("Jurusan: " + student.getDepartment());
            System.out.println();
        }

        scanner.close();
    }
}