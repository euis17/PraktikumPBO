/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance.hierarchicalinheritance;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sihombing
// NIM : 41425050
// Prodi : TRPL
class Vehicle {
    // Constructor dari class Vehicle
    Vehicle() {
        // Menampilkan pesan ketika objek Vehicle dibuat
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    // Constructor dari class Car
    Car() {
        // Memanggil constructor dari class induk (Vehicle) secara otomatis
        // karena Car merupakan turunan dari Vehicle
        System.out.println("This Vehicle is Car");
    }
}

class Bus extends Vehicle {
    // Constructor dari class Bus
    Bus() {
        // Memanggil constructor dari class induk (Vehicle) secara otomatis
        // karena Bus merupakan turunan dari Vehicle
        System.out.println("This Vehicle is Bus");
    }
}

public class Test {
    public static void main(String[] args) {
        // Membuat objek Car
        // Constructor Vehicle dijalankan terlebih dahulu,
        // kemudian constructor Car
        Car obj1 = new Car();

        // Membuat objek Bus
        // Constructor Vehicle dijalankan terlebih dahulu,
        // kemudian constructor Bus
        Bus obj2 = new Bus();
    }
}
