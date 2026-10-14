/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SATU.SATU.MethodOverloading;

/**
 *
 * @author ewiss
 */

// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
//  Prodi : TRPL

public class Mantra {

    // Method ucapkan() dengan satu parameter
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload: method ucapkan() dengan dua parameter
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);

        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload: method ucapkan() dengan tiga parameter
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);

        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    public static void main(String[] args) {
        Mantra mantra = new Mantra();

        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
    }
}
/*
Pertanyaan: 
1. Apa yang terjadi jika kita menghapus salah satu method overloading? Misalnya, method 
dengan dua parameter.
2. Bisakah kita membuat method overloading dengan urutan parameter yang berbeda? Coba 
buat method ucapkan(int kekuatan, String namaMantra).

JAWAB :
1. Jika method overloading dengan dua parameter dihapus, pemanggilan method yang menggunakan 
dua argumen dengan tipe data yang sesuai dengan method tersebut tidak dapat dilakukan lagi. 
Program akan mengalami error saat kompilasi jika tidak ada method lain yang cocok dengan pemanggilan tersebut.

2. Ya, kita bisa membuat method overloading dengan urutan parameter yang berbeda, selama daftar tipe parameternya berbeda.
*/