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
public class KonversiSuhu {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Konversi Suhu ===");
       
        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celsius");
        
        System.out.print("Pilih konversi: ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan suhu dalam Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println(celsius + " C = " + fahrenheit + " F");

        } else if (pilihan == 2) {
            System.out.print("Masukkan suhu dalam Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println(fahrenheit + " F = " + celsius + " C");

        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
    
}
