/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance.MultipleInheritance;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sihombing
// NIM : 41425050
// Prodi : TRPL
interface LandVehicle {

    // Method default untuk menampilkan informasi kendaraan darat
    default void landInfo() {
        System.out.println("This is a LandVehicle");
    }
}

interface WaterVehicle {

    // Method default untuk menampilkan informasi kendaraan air
    default void waterInfo() {
        System.out.println("This is a WaterVehicle");
    }
}

// Class AmphibiousVehicle mengimplementasikan dua interface sekaligus
class AmphibiousVehicle implements LandVehicle, WaterVehicle {

    // Constructor dari class AmphibiousVehicle
    AmphibiousVehicle() {
        System.out.println("This is an AmphibiousVehicle");
    }
}

public class Test {

    // Method utama untuk menjalankan program
    public static void main(String[] args) {

        // Membuat object AmphibiousVehicle
        AmphibiousVehicle obj = new AmphibiousVehicle();

        // Memanggil method waterInfo() dari interface WaterVehicle
        obj.waterInfo();

        // Memanggil method landInfo() dari interface LandVehicle
        obj.landInfo();
    }
}
