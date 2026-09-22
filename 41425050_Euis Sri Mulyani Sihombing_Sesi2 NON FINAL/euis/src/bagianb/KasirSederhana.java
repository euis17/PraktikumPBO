/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianb;

import java.util.Scanner;

/**
 *
 * @author ewiss
 */
/* Nama : Euis S M Sihombing
NIM : 41425050
Prodi : TRPL
*/
public class KasirSederhana {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data barang
        System.out.print("Masukkan nama barang: ");
        
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan harga barang: ");
        double harga = scanner.nextDouble();

        System.out.print("Masukkan jumlah beli: ");
        
        int jumlah = scanner.nextInt();

        // Menghitung total belanja
        double total = harga * jumlah;

        // Menghitung diskon
        double diskon = 0;

        if (total >= 100000) {
            diskon = total * 0.10;
        }

        // Menghitung total bayar
        double totalBayar = total - diskon;

        // Menampilkan hasil
        System.out.println("Total sebelum diskon: " + total);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);
    }

    
}
