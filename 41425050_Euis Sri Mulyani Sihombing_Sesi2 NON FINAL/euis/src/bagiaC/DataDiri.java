/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagiaC;

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
public class DataDiri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();

        System.out.print("Masukkan tinggi badan: ");
        double tinggi = scanner.nextDouble();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean isMahasiswa = scanner.nextBoolean();

        System.out.println("\n=== Data Diri ===");
        
        System.out.println("Nama: " + nama);
       
        System.out.println("Umur: " + umur + " tahun");
       
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);

        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
    }
}

