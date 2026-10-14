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
public class Mobil extends Kendaraan { 
    // extends berarti Mobil merupakan class turunan dari Kendaraan
    // Mobil mewarisi method yang dimiliki oleh Kendaraan

    private int jlhTorsi, faktorPembagi; 
    // menyimpan jumlah torsi dan faktor pembagi khusus untuk Mobil

    private float panjangGagang, rasioGigi; 
    // menyimpan panjang gagang dan rasio gigi Mobil
 
    public Mobil() { 
    } 
    // constructor Mobil yang dijalankan saat objek Mobil dibuat
 
    public void setJlhTorsi(int value) { 
        jlhTorsi = value; 
    } 
    // digunakan untuk mengisi atau mengubah nilai jumlah torsi
 
    public void setPanjangGagang(float value) { 
        panjangGagang = value; 
    } 
    // digunakan untuk mengisi atau mengubah nilai panjang gagang
 
    public void setRasioGigi(float value) { 
        rasioGigi = value; 
    } 
    // digunakan untuk mengisi atau mengubah nilai rasio gigi
 
    public void setFaktorPembagi(int value) { 
        faktorPembagi = value; 
    } 
    // digunakan untuk mengisi atau mengubah nilai faktor pembagi
 
    @Override 
    public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) { 
        return super.kalkulasiPercepatan(jlhTorsi, panjangGagang, rasioGigi) * faktorPembagi; 
    } 
    // @Override berarti method ini dibuat ulang dari class Kendaraan
    // super digunakan untuk memanggil kalkulasiPercepatan() milik Kendaraan
    // hasil perhitungan dari Kendaraan dikalikan dengan faktorPembagi
 
    @Override 
    public void cetakInformasi(Object o) { 
    // membuat implementasi cetakInformasi() khusus untuk Mobil

        System.out.println("================================================"); 
        // mencetak garis pembatas
 
        System.out.println(String.format("Mobil saya berwarna %s.", 
                ((Mobil) o).getWarnaKendaraan())); 
        // menampilkan warna Mobil
        // getWarnaKendaraan() digunakan untuk mengambil warna Mobil
 
        System.out.println(String.format("Dimensi mobil tersebut adalah %d meter persegi", 
                ((Mobil) o).getDimensiKendaraan())); 
        // menampilkan dimensi Mobil
 
        System.out.println(String.format("dan dengan percepatan sekitar %.2f km/jam.", 
                kalkulasiPercepatan(jlhTorsi, panjangGagang, rasioGigi))); 
        // menghitung dan menampilkan percepatan Mobil
        // %.2f digunakan untuk menampilkan angka desimal dengan 2 angka di belakang koma
 
        System.out.println(String.format("Motor tersebut memiliki %d kaca spion dan %d roda. ", 
                ((Mobil) o).getJlhSpion(), ((Mobil) o).getJlhRoda())); 
        // menampilkan jumlah spion dan jumlah roda Mobil
 
        System.out.println("================================================"); 
        // mencetak garis pembatas
    } 
}