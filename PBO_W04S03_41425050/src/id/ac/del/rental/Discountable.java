/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
// Prodi : TRPL

 // interface = kontrak: semua jenis diskon wajib punya calculateDiscount
// public supaya bisa dipakai dari package lain (TestRental)
public interface Discountable {
    // tanpa isi, rumus diserahkan ke kelas yang implements
    // mengembalikan nominal potongan, bukan harga akhir
    double calculateDiscount(double amount);
}

