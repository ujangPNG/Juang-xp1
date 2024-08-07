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
public class Person {
    private String nim;
    private String name;
    private String address;

    // Constructor
    public Person(String nim, String name, String address) {
        this.nim = nim;
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

