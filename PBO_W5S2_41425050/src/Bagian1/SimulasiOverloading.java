/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bagian1;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sri Muulyani Sihombing
// NIM : 41425050
// Prodi : TRPL

class MesinTarif {
    private String kotaAsal;

    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }

    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;
        if (isExpress) {
            total += 20000;
        }
        return total;
    }
}

public class SimulasiOverloading {
    
    public static void main(String[] args) {
        MesinTarif tarif = new MesinTarif("Medan");

        System.out.println("=== INI METHOD OVERLOADING ===");

        System.out.println("Ongkir Biasa (2.0 Kg)       : Rp " + tarif.hitungOngkir(2.0));
        System.out.println("Ongkir + Asuransi (Barang 5Jt): Rp " + tarif.hitungOngkir(2.0, 5000000.0));
        System.out.println("Ongkir Express (2.0 Kg)     : Rp " + tarif.hitungOngkir(2.0, true));
    }
}
/*1.  Mengapa compiler Java dapat menentukan method hitungOngkir mana yang dijalankan 
sebelum program dieksekusi (compile-time)? Bagian method apa yang diperiksa compiler?
Karena
Compiler Java dapat menentukan method hitungOngkir() yang akan dijalankan pada saat compile-time karena method-method tersebut memiliki signature yang berbeda.
Compiler memeriksa nama method, jumlah parameter, tipe parameter, dan urutan parameter untuk mencocokkan pemanggilan method dengan deklarasi yang sesuai

2.Jika pada class MesinTarif ditambahkan method berikut: 

public int hitungOngkir(double beratKg) { 
return (int)(beratKg * 10000); 

Mengapa compiler menolak kode tersebut padahal tipe kembaliannya berbeda (int vs double)? 

Jawab:
Compiler menolak method tersebut karena perbedaannya hanya terdapat pada return type, yaitu int dan double.
Dalam Java, return type saja tidak dapat digunakan sebagai pembeda dalam method overloading. Kedua method memiliki nama,
jumlah, tipe, dan urutan parameter yang sama, sehingga dianggap memiliki signature yang sama dan menyebabkan konflik.
    
*/