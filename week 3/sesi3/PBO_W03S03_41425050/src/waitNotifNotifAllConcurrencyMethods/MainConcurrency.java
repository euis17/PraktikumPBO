/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waitNotifNotifAllConcurrencyMethods;

/**
 *
 * @author ewiss 
 */

// Kelas AntreanShared digunakan untuk berbagi pesan antar-thread
class AntreanShared {
    // Variabel untuk menyimpan pesan
    private String data;
    // Flag untuk menandai apakah ada data yang tersedia
    private boolean adaData = false;

    // Method untuk mengirim/menyimpan pesan (produsen)
    public synchronized void kirimPesan(String pesan) {
        // Jika masih ada data yang belum diambil, tunggu
        while (adaData) {
            try {
                // Thread produsen menunggu sampai pesan sebelumnya diambil
                wait();
            } catch (InterruptedException e) {
                // Jika thread terinterupsi, set status interrupted kembali
                Thread.currentThread().interrupt();
            }
        }

        // Simpan pesan baru ke variabel data
        this.data = pesan;
        // Tandai bahwa data sudah tersedia
        this.adaData = true;
        System.out.println("Pesan dikirim: " + pesan);

        // Beri tahu thread konsumen bahwa data sudah siap
        notify();
    }

    // Method untuk mengambil/membaca pesan (konsumen)
    public synchronized String ambilPesan() {
        // Jika belum ada data, tunggu
        while (!adaData) {
            try {
                // Thread konsumen menunggu sampai ada pesan
                wait();
            } catch (InterruptedException e) {
                // Jika thread terinterupsi, set status interrupted kembali
                Thread.currentThread().interrupt();
            }
        }

        // Tandai bahwa data sudah diambil, tempat kosong lagi
        this.adaData = false;
        System.out.println("Pesan diterima: " + data);

        // Beri tahu thread produsen bahwa tempat sudah kosong
        notify();
        // Kembalikan pesan yang diambil
        return data;
    }
}
public class MainConcurrency {
    public static void main(String[] args) {
        // Membuat objek antrean bersama yang akan dipakai oleh produsen dan konsumen
        AntreanShared antrean = new AntreanShared();

        // Membuat thread produsen (pengirim pesan)
        Thread produsen = new Thread(() -> {
            // Daftar pesan yang akan dikirim
            String[] listPesan = {"Halo", "Belajar Java", "Selesai"};
            // Loop untuk mengirim setiap pesan ke antrean
            for (String p : listPesan) {
                antrean.kirimPesan(p);
            }
        });

        // Membuat thread konsumen (penerima pesan)
        Thread konsumen = new Thread(() -> {
            // Konsumen akan mengambil 3 pesan sesuai jumlah yang dikirim produsen
            for (int i = 0; i < 3; i++) {
                antrean.ambilPesan();
            }
        });

        // Menjalankan kedua thread secara bersamaan
        produsen.start();
        konsumen.start();
    }
}

