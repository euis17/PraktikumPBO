/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObjectdiJava2;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sihombing
// NIM : 41425050
// Prodi : TRPL
public class Student {

    // Atribut roll untuk menyimpan nomor roll mahasiswa
    int roll;

    // Override method hashCode() dari class Object
    @Override
    public int hashCode() {

        // Mengembalikan nilai roll sebagai hash code
        return roll;
    }

    // Method utama untuk menjalankan program
    public static void main(String[] args) {

        // Membuat object Student pertama
        Student s1 = new Student();

        // Memberikan nilai 101 pada atribut roll milik s1
        s1.roll = 101;

        // Membuat object Student kedua
        Student s2 = new Student();

        // Memberikan nilai 102 pada atribut roll milik s2
        s2.roll = 102;

        // Menampilkan hashCode dari object s1
        System.out.println("HashCode s1: " + s1.hashCode());

        // Menampilkan hashCode dari object s2
        System.out.println("HashCode s2: " + s2.hashCode());
    }
}
