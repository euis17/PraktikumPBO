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

public class Book implements Cloneable {
    // Variabel t digunakan untuk menyimpan judul buku
    private String t;

    // Constructor untuk memberikan nilai awal pada judul buku
    public Book(String t) {
        this.t = t;
    }

    // Override method clone() untuk membuat salinan object Book
    @Override
    public Object clone() throws CloneNotSupportedException {

        // Memanggil clone() dari parent class untuk membuat salinan object
        return super.clone();
    }

    // Method untuk mendapatkan judul buku
    public String getTitle() {
        return t;
    }

    // Method utama untuk menjalankan program
    public static void main(String[] args) {

        try {
            // Membuat object Book pertama dengan judul "Java Basics"
            Book b1 = new Book("Java Basics");

            // Membuat salinan dari object b1 dan menyimpannya ke b2
            Book b2 = (Book) b1.clone();

            // Menampilkan judul buku dari object b1
            System.out.println("Judul buku b1: " + b1.getTitle());

            // Menampilkan judul buku dari object b2
            System.out.println("Judul buku b2: " + b2.getTitle());

            // Membandingkan apakah b1 dan b2 merupakan object yang sama
            System.out.println("Apakah b1 dan b2 objek yang sama? " + (b1 == b2));

        } catch (CloneNotSupportedException e) {

            // Menampilkan informasi error jika proses cloning gagal
            e.printStackTrace();
        }
    }
}
/* Metode clone() membuat dan mengembalikan objek baru yang merupakan salinan dari 
objek saat ini
*/
