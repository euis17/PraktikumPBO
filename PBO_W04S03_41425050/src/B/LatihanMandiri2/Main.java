/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B.LatihanMandiri2;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
// Prodi : TRPL


public class Main {

    public static void main(String[] args) {

        // Membuat object lampu dengan kecerahan 80%
        SmartLamp lampu = new SmartLamp(80);

        // Membuat object AC dengan suhu 22 derajat
        SmartAC ac = new SmartAC(22);

        // Menyalakan lampu
        lampu.turnOn();

        // Menghubungkan lampu ke WiFi
        lampu.connectToWifi(
            "Rumah_Indah_5G",
            "192.168.1.50"
        );

        // Menyalakan AC
        ac.turnOn();

        // Menghubungkan AC ke WiFi
        ac.connectToWifi(
            "Rumah_Indah_5G",
            "192.168.1.51"
        );

        // Mematikan AC
        ac.turnOff();
    }
}