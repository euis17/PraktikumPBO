/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObjectdiJava3;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sihombing
// NIM : 41425050
// Prodi : TRPL
public class Geeks {
    public static void main(String[] args) {
        // Membuat object t dari class Geeks
        Geeks t = new Geeks();

        // Menampilkan hash code dari object t
        System.out.println(t.hashCode());

        // Mengubah referensi t menjadi null
        // sehingga object yang sebelumnya direferensikan oleh t
        // tidak lagi memiliki referensi
        t = null;

        // Meminta JVM untuk menjalankan Garbage Collector
        System.gc();

        // Menampilkan tulisan "end"
        System.out.println("end");
    }

    // Override method finalize()
    // Method ini dipanggil sebelum object dihapus oleh Garbage Collector
    @Override
    protected void finalize() {

        // Menampilkan pesan ketika finalize() dipanggil
        System.out.println("finalize method called");
    }
}
