/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
// Prodi : TRPL
public class Main {
    public static void main(String[] args) {

        // Membuat objek MahasiswaAktif dan mengisi datanya
        MahasiswaAktif mhs = new MahasiswaAktif(
            "Euis",
            "41425050",
            3
        );

        // Menampilkan data mahasiswa
        System.out.println("Nama     : " + mhs.nama);
        System.out.println("NIM      : " + mhs.nim);
        System.out.println("Semester : " + mhs.semester);

        // Memanggil method belajar()
        mhs.belajar();
    }
}
