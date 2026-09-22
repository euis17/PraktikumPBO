/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BagianA;

import java.util.Scanner; // dipakai supaya program Java bisa menggunakan Scanner untuk menerima input dari keyboard
// Scanner itu untuk menerima input, kalo di c pake scanf
// jadi dia menggunakan/  import dari package java.util
// agar package tsb dpt digunakan 
/**
 *
 * @author ewiss
 */

/* Nam : Euis S M Sihombing
NIM : 41425050
Prodi : TRPL
*/

public class GradeSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Scanner : nama class nya
        // scanner : nama Variabel
        double[] grades = new double[5];
        // untuk membuat array yg dpt menyimpan nilai
        // sebanyak 5 dengan tipe data double (desimal)
        double total = 0;
        // membuat variabel total dan meyimpan nilai keseluruhan
        

        // Input nilai
        for (int i = 0; i < 5; i++) { // untuk mengulang perintah sebanyak 5 kali
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            total += grades[i]; // untuk menambahkan nilai total dan grades[i]
        }

        // Hitung rata-rata
        double average = total / 5; // untuk menyimpan nilai rata rata dalam tipe data double
        System.out.println("Rata-rata nilai: " + average);

        // Kategorikan nilai
        char grade;
        if (average >= 85) grade = 'A';
        else if (average >= 70) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 50) grade = 'D';
        else grade = 'E';

        System.out.println("Grade: " + grade);

        // Tampilkan nilai tertinggi dan terendah
        double max = grades[0];
        double min = grades[0];

        for (int i = 1; i < 5; i++) {
            if (grades[i] > max) max = grades[i];
            if (grades[i] < min) min = grades[i];
        }

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
    }
}

/*1. Apa yang terjadi jika ada nilai yang diinput di luar rentang 0-100? 
Pada program saat ini, jika pengguna memasukkan nilai di luar rentang 0–100,
program tetap menerima dan memproses nilai tersebut karena belum terdapat validasi input.
Nilai tersebut akan ikut dihitung dalam total, rata-rata, serta penentuan grade.
    2. Bagaimana cara memodifikasi program untuk menangani jumlah nilai yang dinamis
     Mengganti angka 5 yang menunjukkan jumlah data dengan variabel jumlah yang berasal dari input pengguna
*/
    
