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
public class StudentGrade {

    // Atribut private untuk menerapkan encapsulation
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private double nilaiAkhir;
    private String gradeHuruf;

    // Constructor untuk registrasi mahasiswa
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;

        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: "
                + nim + " - " + nama);
    }

    // Getter NIM
    public String getNim() {
        return nim;
    }

    // Getter Nama
    public String getNama() {
        return nama;
    }

    // Getter Nilai Kuis
    public double getNilaiKuis() {
        return nilaiKuis;
    }

    // Setter Nilai Kuis dengan validasi
    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;

            System.out.println("[Update] Nilai kuis berhasil diubah menjadi "
                    + nilaiKuis);

            // Memperbarui grade secara otomatis
            hitungGradeHuruf();

        } else {
            System.out.println("[Error] Nilai kuis tidak valid: "
                    + nilaiKuis + ". (Harus antara 0 - 100)");
        }
    }

    // Getter Nilai UTS
    public double getNilaiUTS() {
        return nilaiUTS;
    }

    // Setter Nilai UTS dengan validasi
    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS >= 0.0 && nilaiUTS <= 100.0) {
            this.nilaiUTS = nilaiUTS;

            System.out.println("[Update] Nilai UTS berhasil diubah menjadi "
                    + nilaiUTS);

            // Memperbarui grade secara otomatis
            hitungGradeHuruf();

        } else {
            System.out.println("[Error] Nilai UTS tidak valid: "
                    + nilaiUTS + ". (Harus antara 0 - 100)");
        }
    }

    // Menghitung nilai akhir
    // 40% Nilai Kuis + 60% Nilai UTS
    public double hitungNilaiAkhir() {
        nilaiAkhir = (nilaiKuis * 0.4) + (nilaiUTS * 0.6);
        return nilaiAkhir;
    }

    // Getter Nilai Akhir
    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    // Method private untuk menghitung grade huruf
    private void hitungGradeHuruf() {
        double nilai = hitungNilaiAkhir();

        if (nilai >= 80) {
            gradeHuruf = "A";
        } else if (nilai >= 70) {
            gradeHuruf = "B";
        } else if (nilai >= 60) {
            gradeHuruf = "C";
        } else if (nilai >= 50) {
            gradeHuruf = "D";
        } else {
            gradeHuruf = "E";
        }
    }

    // Getter Grade Huruf
    public String getGradeHuruf() {
        return gradeHuruf;
    }

    // Menampilkan kartu hasil studi
    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Kuis  : " + nilaiKuis);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
        System.out.println("Grade Huruf : " + gradeHuruf);
    }
}