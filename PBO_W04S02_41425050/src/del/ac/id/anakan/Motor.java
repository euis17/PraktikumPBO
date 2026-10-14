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
public class Motor extends Kendaraan { 
  // motor mewarisi sifat atau method dari kendaraan 
  // extends digunakan untuk membuat Motor menjadi class turunan dari Kendaraan
  // Motor dapat menggunakan method yang diwarisi dari Kendaraan

    private int jlhTorsi, faktorPembagi; 
    // menyimpan jumlah torsi dan faktor pembagi khusus untuk Motor

    private float panjangGagang, rasioGigi; 
    // menyimpan panjang gagang dan rasio gigi Motor

    // motor mewarisi sifat atau method dari kendaraan 
    // atribut dan method dari Kendaraan dapat digunakan oleh Motor

    public Motor() { 
    } 
    // constructor Motor yang dijalankan saat objek Motor dibuat
 
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
    // @Override digunakan karena method ini sudah ada di class Kendaraan
    // super digunakan untuk memanggil method kalkulasiPercepatan() milik Kendaraan
    // hasil perhitungan dari Kendaraan dikalikan dengan faktorPembagi

// kenapa ada ovver ride di motor karena untuk membuat ulang 
    // method yg sdh ada di kendaraan 
    // Motor membuat implementasi sendiri dari method yang diwarisi
 
    @Override 
    public void cetakInformasi(Object o) { 
    // mengubah implementasi cetakInformasi() agar sesuai dengan informasi Motor

        System.out.println("================================================"); 
        // mencetak garis pembatas
 
        System.out.println(String.format("Motor saya berwarna %s.", 
                ((Motor) o).getWarnaKendaraan())); 
        // menampilkan warna Motor
        // getWarnaKendaraan() digunakan untuk mengambil warna kendaraan
 
        System.out.println(String.format("Dimensi motor tersebut adalah %d meter persegi", 
                ((Motor) o).getDimensiKendaraan())); 
        // menampilkan dimensi Motor
 
        System.out.println(String.format("dan dengan percepatan sekitar %.2f km/jam.", 
                kalkulasiPercepatan(jlhTorsi, panjangGagang, rasioGigi))); 
        // menghitung dan menampilkan percepatan Motor
        // %.2f digunakan untuk menampilkan angka desimal dengan 2 angka di belakang koma
 
        System.out.println(String.format("Motor tersebut memiliki %d kaca spion dan %d roda. ", 
                ((Motor) o).getJlhSpion(), ((Motor) o).getJlhRoda())); 
        // menampilkan jumlah spion dan jumlah roda Motor
 
        System.out.println("================================================"); 
        // mencetak garis pembatas
    } 
} 