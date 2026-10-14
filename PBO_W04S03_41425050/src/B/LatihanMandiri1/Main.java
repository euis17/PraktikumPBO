/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B.LatihanMandiri1;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
// Prodi : TRPL

public class Main {

    public static void main(String[] args) {

        // Membuat object StudentGrade
        StudentGrade mahasiswa =
                new StudentGrade("11425001", "Marsha");

        // Menguji nilai kuis tidak valid
        mahasiswa.setNilaiKuis(110);

        // Memasukkan nilai kuis yang valid
        mahasiswa.setNilaiKuis(85);

        // Memasukkan nilai UTS
        mahasiswa.setNilaiUTS(90);

        // Menampilkan kartu hasil studi
        mahasiswa.cetakLaporan();
    }
}
