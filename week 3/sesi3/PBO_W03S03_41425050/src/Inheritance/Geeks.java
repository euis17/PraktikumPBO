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
// Superclass
class Vehicle {
    // Constructor dari class Vehicle
    Vehicle() {
        // Menampilkan pesan ketika constructor Vehicle dipanggil
        System.out.println("This is a Vehicle");
    }
}
// Subclass dari Vehicle
class FourWheeler extends Vehicle {

    // Constructor dari class FourWheeler
    FourWheeler() {

        // Menampilkan pesan ketika constructor FourWheeler dipanggil
        System.out.println("4 Wheeler Vehicles");
    }
}

// Subclass dari FourWheeler
class Car extends FourWheeler {

    // Constructor dari class Car
    Car() {

        // Menampilkan pesan ketika constructor Car dipanggil
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}
// Class utama
public class Geeks {
    public static void main(String[] args) {

        // Membuat object obj dari class Car
        Car obj = new Car();
    }
}