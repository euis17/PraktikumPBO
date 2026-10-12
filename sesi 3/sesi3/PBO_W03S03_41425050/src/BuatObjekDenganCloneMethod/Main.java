/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuatObjekDenganCloneMethod;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
// Prodi : TRPL
    
public class Main {

    // Class Geeks digunakan untuk contoh penggunaan clone()
    static class Geeks implements Cloneable {

        // Method clone() digunakan untuk membuat salinan object
        @Override // method 1
        protected Object clone() throws CloneNotSupportedException {
            // Memanggil clone() dari parent class
            return super.clone();
        }

        // Menyimpan nama
        String name = "GeeksForGeeks";
    }

    public static void main(String[] args) { // method 2

        // Membuat object o1 dari class Geeks
        Geeks o1 = new Geeks();

        try {
            // Membuat salinan object o1
            Geeks o2 = (Geeks) o1.clone();

            // Menampilkan nama dari object hasil clone
            System.out.println(o2.name);

        } catch (CloneNotSupportedException e) {
            // Menampilkan error jika proses clone gagal
            e.printStackTrace();
        }
    }
}