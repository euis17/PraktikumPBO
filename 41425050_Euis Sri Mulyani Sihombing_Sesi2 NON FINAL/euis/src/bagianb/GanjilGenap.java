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
public class GanjilGenap {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
       
        int angka = scanner.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan Genap");
        } else {
            System.out.println(angka + " adalah bilangan Ganjil");
        }
    }
}
    
