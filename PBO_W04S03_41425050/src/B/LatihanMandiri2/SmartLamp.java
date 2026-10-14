/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B.LatihanMandiri2;

/**
 *
 * @author ewiss
 */// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
// Prodi : TRPL

public class SmartLamp implements Switchable, Connectable {

    // Menyimpan tingkat kecerahan lampu
    private int brightness;

    // Menyimpan status lampu
    private boolean isOn;

    // Constructor
    public SmartLamp(int brightness) {
        this.brightness = brightness;
        this.isOn = false;
    }

    // Menyalakan lampu
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(
            "[Lampu Pintar] Dinyalakan dengan kecerahan "
            + brightness + "%"
        );
    }

    // Mematikan lampu
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    // Menghubungkan lampu ke WiFi
    @Override
    public void connectToWifi(String ssid, String ipAddress) {

        // Perangkat tidak boleh terhubung jika masih mati
        if (!isOn) {
            System.out.println(
                "[WiFi Device] Error: Perangkat masih mati!"
            );
        } else {
            System.out.println(
                "[WiFi Device] Terhubung ke jaringan: "
                + ssid + " (IP: " + ipAddress + ")"
            );
        }
    }
}