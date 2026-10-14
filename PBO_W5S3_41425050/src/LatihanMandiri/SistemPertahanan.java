/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMandiri;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
//  Prodi : TRPL





// Abstract class sebagai dasar semua mantra perlindungan
abstract class MantraPerlindungan {

    // Setiap mantra wajib memiliki cara aktivasi
    public abstract void aktifkan();

    // Setiap mantra wajib memiliki cara nonaktifkan
    public abstract void nonaktifkan();
}

// Kelas Protego untuk membentuk perisai perlindungan
class Protego extends MantraPerlindungan {

    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego dinonaktifkan.");
    }
}

// Kelas Fidelius yang membutuhkan secret keeper
class Fidelius extends MantraPerlindungan {
    private String secretKeeper;

    // Constructor untuk menentukan secret keeper
    public Fidelius(String secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Fidelius diaktifkan oleh secret keeper: "
                + secretKeeper);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Fidelius dinonaktifkan.");
    }
}

// Kelas untuk mencegah apparition di area tertentu
class MantraAntiApparition extends MantraPerlindungan {
    private String area;

    public MantraAntiApparition(String area) {
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Anti-Apparition aktif di area " + area
                + ". Apparition tidak diizinkan!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perlindungan Anti-Apparition di area "
                + area + " dinonaktifkan.");
    }
}

// Kelas untuk mengelola semua mantra perlindungan
public class SistemPertahanan {
    public List<MantraPerlindungan> daftarMantra;

    public SistemPertahanan() {
        daftarMantra = new ArrayList<>();
    }

    // Menambahkan mantra ke sistem pertahanan
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra berhasil ditambahkan.");
    }

    // Mengaktifkan seluruh mantra yang terdaftar
    public void aktifkanSemuaMantra() {
        System.out.println("\n=== AKTIVASI SEMUA MANTRA ===");

        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    // Menonaktifkan seluruh mantra yang terdaftar
    public void nonaktifkanSemuaMantra() {
        System.out.println("\n=== NONAKTIVASI SEMUA MANTRA ===");

        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }

    // Method main untuk menguji sistem pertahanan Hogwarts
    public static void main(String[] args) {

        // Membuat sistem pertahanan Hogwarts
        SistemPertahanan hogwarts = new SistemPertahanan();

        // Membuat objek mantra perlindungan
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Albus Dumbledore");
        MantraPerlindungan antiApparition =
                new MantraAntiApparition("Hogwarts");

        // Menambahkan mantra ke sistem pertahanan
        hogwarts.tambahMantra(protego);
        hogwarts.tambahMantra(fidelius);
        hogwarts.tambahMantra(antiApparition);

        // Mengaktifkan semua mantra
        hogwarts.aktifkanSemuaMantra();

        // Menonaktifkan semua mantra
        hogwarts.nonaktifkanSemuaMantra();
    }
}
