/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InisialisasiObjek;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
// Prodi : TRPL
public class Geeks {

    // Variabel static untuk menyimpan nama software
    static String name;

    // Variabel static untuk menyimpan harga software
    static float price;

    // Method static set() digunakan untuk memberikan nilai
    // ke variabel name dan price
    static void set(String n, float p) {

        // Mengisi variabel name dengan nilai dari parameter n
        name = n;

        // Mengisi variabel price dengan nilai dari parameter p
        price = p;
    }

    // Method static get() digunakan untuk menampilkan
    // nilai name dan price
    static void get()
    {
        // Menampilkan nama software
        System.out.println("Software name is: " + name);

        // Menampilkan harga software
        System.out.println("Software price is: " + price);
    }

    // Method utama untuk menjalankan program
    public static void main(String args[])
    {
        // Memanggil method set() untuk memberikan
        // nilai "Visual studio" pada name dan 0.0f pada price
        Geeks.set("Visual studio", 0.0f);

        // Memanggil method get() untuk menampilkan
        // nama dan harga software
        Geeks.get();
    }
}