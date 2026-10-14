/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package del.ac.id.induk;

/**
 *
 * @author ewiss
 */
public interface IKendaraan { //interface dapat diakses dari package/class lain. 
//membuat interface bernama IKendaraan yang dapat diakses secara umum 

    void setJlhRoda(int value); // hanya dapat digunakan class yang memiliki method setJhRoda 
    // Belum diberitahu bagaimana cara method tersebut bekerja.Itulah mengapa nanti Kendaraan harus mengimplementasikannya. 
    // memasukkan/mengubah nilai 
    // void berarti tidak mengembalikan nilai
    // value adalah nilai jumlah roda yang akan dimasukkan

    void setDimensiKendaraan(int value); 
    // digunakan untuk memasukkan atau mengubah dimensi kendaraan
    // value adalah nilai dimensi kendaraan

    void setJlhSpion(int value); 
    // digunakan untuk memasukkan atau mengubah jumlah spion

    void setWarnaKendaraan(String value); 
    // digunakan untuk memasukkan atau mengubah warna kendaraan
    // String berarti nilai yang dimasukkan berupa teks

    void cetakInformasi(Object o); 
    // digunakan untuk mencetak informasi kendaraan
    // Object o adalah data yang diberikan ke method

    int getJlhRoda(); 
    //mengambil nilai 
    // tipe data yand di depan berarti mengembalikan nilai bertipe int 
    // get digunakan untuk mengambil nilai jumlah roda

    int getDimensiKendaraan(); 
    // digunakan untuk mengambil nilai dimensi kendaraan
    // int berarti nilai yang dikembalikan berupa bilangan bulat

    int getJlhSpion(); 
    // digunakan untuk mengambil nilai jumlah spion

    float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi); 
    // digunakan untuk menghitung percepatan
    // memiliki tiga parameter yaitu torsi, panjang gagang, dan rasio gigi
    // float berarti hasil perhitungan berupa angka desimal

    String getWarnaKendaraan(); 
    // digunakan untuk mengambil nilai warna kendaraan
    // String berarti nilai yang dikembalikan berupa teks

}


