/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sihombing
// NIM : 41425050
// Prodi : TRPL
// Super class
class Vehicle {
    // Constructor dari class Vehicle
    Vehicle() {
        // Menampilkan pesan ketika constructor Vehicle dijalankan
        System.out.println("This is a Vehicle");
    }
}
// Subclass
class Car extends Vehicle {
    // Constructor dari class Car
    Car() {

        // Menampilkan pesan ketika constructor Car dijalankan
        System.out.println("This Vehicle is Car");
    }
}

// Class utama untuk menjalankan program
public class Test {

    public static void main(String[] args) {

        // Membuat object obj dari class Car
        Car obj = new Car();
    }
}