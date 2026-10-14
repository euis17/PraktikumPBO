/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianDua1;

/**
 *
 * @author ewiss
 */

public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        // KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: Instansiasi dari subclass konkret
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();
        fuso.angkutBarang("20 Unit Kulkas");

        System.out.println("------------------------------");

        MobilVan grandmax = new MobilVan("B 1122 RAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
}
/*
1. Eksperimen 1
 Pada class SimulasiAbstraksi, buka komentar (uncomment) pada baris 
PERCOBAAN 1: KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100); 
Pertanyaan:
Salin pesan error yang dihasilkan oleh Java. Mengacu pada "Kotak Insight Konsep" 
yang sudah Anda baca, 

:: Uncompilable code-BagianDua1.KendaraanEkspedisi is abstract; cannot be instantiated
mengapa Java menggagalkan baris kode ini?
JAWAB : karena KendaraanEkspedisi adalah abstract class.
abstract class adalah kerangka dasar yang belum lengkap, 
sehingga Java tidak mengizinkan kita membuat objeknya secara langsung menggunakan new.

Eksperimen 2 :  Buatlah sebuah class baru dengan nama MotorKurir yang melakukan extends ke 
KendaraanEkspedisi, tetapi jangan menuliskan isi method angkutBarang() di dalamnya. 
Pertanyaan: Arahkan kursor (hover) ke garis merah error pada tulisan class MotorKurir. 
Tuliskan dua opsi solusi/perbaikan yang ditawarkan oleh IDE Java (seperti 
NetBeans/IntelliJ/Eclipse) untuk mengatasi error tersebut! 
Dua opsi solusi yang ditawarkan IDE adalah:
1. Mengimplementasikan abstract method angkutBarang() pada class MotorKurir.
2. Mengubah MotorKurir menjadi abstract class.
*/