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
public class OpersiMatematika{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

       
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int sisaBagi = angka1 % angka2;
        double pangkat = Math.pow(angka1, angka2);

        System.out.println("Sisa bagi: " + sisaBagi);
        System.out.println("Pangkat: " + (int)pangkat);
    }
}
