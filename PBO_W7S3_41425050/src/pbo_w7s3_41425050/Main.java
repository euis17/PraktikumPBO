/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w7s3_41425050;

/**
 *
 * @author ewiss
 */
/*
Nama : Euis Sri Mulyani Sihombing
NIM : 41425050
Prodi : TRPL
*/

// Class utama untuk menjalankan program
public class Main {

    // Method main sebagai titik awal program dijalankan
    public static void main(String[] args) {

        // Membuat objek kantin dari class Kantin
        Kantin kantin = new Kantin();

        // Blok try untuk menjalankan kode yang mungkin menghasilkan exception
        try {

            // Memesan makanan Ikan jahir
            kantin.pesanMakanan("Ikan jahir");

            // Memesan makanan Ikan sepat
            kantin.pesanMakanan("Ikan sepat");

        // Menangkap exception jika makanan tidak tersedia
        } catch (MakananTidakTersediaException ex) {

            // Menampilkan pesan exception
            System.out.println(ex.getMessage());

        // Blok finally selalu dijalankan, baik terjadi exception maupun tidak
        } finally {

            // Menampilkan pesan bahwa program selesai
            System.out.println("Program selesai.");
        }
    }
}