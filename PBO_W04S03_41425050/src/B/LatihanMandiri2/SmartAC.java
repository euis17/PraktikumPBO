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
public class SmartAC implements Switchable, Connectable {

    // Menyimpan suhu AC
    private int temperature;

    // Menyimpan status AC
    private boolean isOn;

    // Constructor
    public SmartAC(int temperature) {
        this.temperature = temperature;
        this.isOn = false;
    }

    // Menyalakan AC
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(
            "[AC Pintar] Dinyalakan pada suhu "
            + temperature + " C"
        );
    }

    // Mematikan AC
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("[AC Pintar] Dimatikan.");
    }

    // Menghubungkan AC ke WiFi
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