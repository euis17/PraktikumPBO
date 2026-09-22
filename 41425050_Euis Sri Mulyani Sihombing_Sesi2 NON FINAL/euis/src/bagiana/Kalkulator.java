/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagiana;

import java.util.Scanner;

/**
 *
 * @author ewiss
 */
/*
NIM: 41425050
Nama: Euis S M Sihombing
Prodi : TRPL
*/

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
            
       System.out.println("Tambah: " + (a+b));
        
        System.out.println("Kurang: " + (a-b));
        
        System.out.println("Kali: " + (a*b));
        System.out.println("Bagi: " + ((double)a / b));
    }
}// kode diatas adalah kode untuk membuat kalkulator sederhna(aritmatika)
// 1. Apa perbedaan nilai asli double dengan hasil casting int? 
// Jawab Nilai asli double agar bisa punya banyak angka desimal yang acak
// sedangkan Hasil Casting int ke double, menambahkan desimal nol dibelakang angka bulat

/*2.  Mengapa pembagian int perlu di-casting ke double?
    Agar hasil desimal tidak hilangg
   3. Apa risiko jika pembagi = 0?
    risiko nya, pada pembagian int program akan langsung berhenti
    sedangkan pada pembagian double akan menghasilkan nilai yang tidak vald
    
*/