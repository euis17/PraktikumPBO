/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package del.ac.id.anakan;

import del.ac.id.induk.Kendaraan;

/**
 *
 * @author ewiss
 */
public class Sepeda extends Kendaraan{
    // extends berarti Sepeda merupakan class turunan dari Kendaraan
    // Sepeda mewarisi method yang ada pada Kendaraan

    public Sepeda() {
    }
    // constructor Sepeda yang dijalankan saat objek Sepeda dibuat

    @Override
    public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        // @Override digunakan karena method ini sudah ada di class Kendaraan

        return (jlhTorsi == 0 || panjangGagang == 0 || rasioGigi == 0) ? (float) 10.0 :
               (jlhTorsi * panjangGagang * rasioGigi);
        // mengecek apakah salah satu nilai parameter bernilai 0
        // jika salah satu bernilai 0, hasilnya adalah 10.0
        // jika tidak, maka menghitung torsi × panjang gagang × rasio gigi
    }

    @Override
    public void cetakInformasi(Object o) {
        // membuat implementasi cetakInformasi() khusus untuk Sepeda

        System.out.println("================================================");
        // mencetak garis pembatas

        System.out.println(String.format("Sepeda saya berwarna %s.",
                ((Sepeda) o).getWarnaKendaraan()));
        // menampilkan warna Sepeda
        // getWarnaKendaraan() digunakan untuk mengambil warna Sepeda

        System.out.println(String.format("Dimensi sepeda tersebut adalah %d meter persegi",
                ((Sepeda) o).getDimensiKendaraan()));
        // menampilkan dimensi Sepeda

        System.out.println(String.format("dan dengan percepatan sekitar %.2f km/jam.",
                kalkulasiPercepatan(0, 0, 0)));
        // menghitung dan menampilkan percepatan Sepeda
        // karena parameter yang diberikan 0, hasilnya menjadi 10.0

        System.out.println(String.format("Sepeda tersebut memiliki %d kaca spion dan %d roda. ",
                ((Sepeda) o).getJlhSpion(), ((Sepeda) o).getJlhRoda()));
        // menampilkan jumlah spion dan jumlah roda Sepeda

        System.out.println("================================================");
        // mencetak garis pembatas
    }
}

