/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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

// Class Kantin untuk mengatur pemesanan makanan
public class Kantin {

    // Mendeklarasikan nama makanan yang tersedia
    String ikan = "Ikan jahir";
    String sayur = "Sayur";
    String buah = "Buah";
    String Babikecap = "Babikecap";

    // Method untuk memesan makanan dengan parameter berupa nama makanan
    // throws digunakan untuk memberi tahu bahwa method dapat menghasilkan exception
    public void pesanMakanan(String makanan)
            throws MakananTidakTersediaException {

        // Memeriksa apakah makanan yang dipesan adalah Ikan jahir
        if (makanan.equals(ikan)) {
            System.out.println("Ikan jahir berhasil dipesan.");

        // Memeriksa apakah makanan yang dipesan adalah Sayur
        } else if (makanan.equals(sayur)) {
            System.out.println("Sayur berhasil dipesan.");

        // Memeriksa apakah makanan yang dipesan adalah Buah
        } else if (makanan.equals(buah)) {
            System.out.println("Buah berhasil dipesan.");

        // Memeriksa apakah makanan yang dipesan adalah Babikecap
        } else if (makanan.equals(Babikecap)) {
            System.out.println("Babikecap berhasil dipesan.");

        // Jika makanan tidak cocok dengan pilihan yang tersedia
        } else {

            // Melempar exception dengan pesan bahwa makanan tidak tersedia
            throw new MakananTidakTersediaException(
                makanan + " tidak tersedia!"
            );
        }
    }
}