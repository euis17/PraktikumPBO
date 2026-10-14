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
public class MahasiswaAktif extends Mahasiswa {
    // Atribut tambahan untuk mahasiswa aktif
    int semester;

    // Constructor MahasiswaAktif
    public MahasiswaAktif(String nama, String nim, int semester) {
        // Memanggil constructor dari class Mahasiswa
        super(nama, nim);

        // Mengisi nilai semester
        this.semester = semester;
    }

    // Method belajar yang dimiliki mahasiswa aktif
    public void belajar() {
        System.out.println(nama + " sedang belajar.");
    }
}

