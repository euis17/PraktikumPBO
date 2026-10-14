/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Class;

/**
 *
 * @author ewiss
 */
/* Nama : Euis Sri Mulyani Sihombing
NIM  : 41425050
Prodi : TRPL
*/
// Class Student digunakan sebagai cetakan (blueprint) untuk membuat objek Student
class Student {

    // Atribut id digunakan untuk menyimpan ID mahasiswa
    int id;

    // Atribut n digunakan untuk menyimpan nama mahasiswa
    String n;

    // Constructor Student digunakan untuk memberikan nilai awal pada id dan nama
    public Student(int id, String n) {

        // this.id mengacu pada atribut id milik objek
        this.id = id;

        // this.n mengacu pada atribut n milik objek
        this.n = n;
    }
}

// Class Main merupakan class utama untuk menjalankan program
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Membuat objek s1 dari class Student dengan id 10 dan nama Alice
        Student s1 = new Student(10, "Alice");

        // Menampilkan nilai id dari objek s1
        System.out.println(s1.id);

        // Menampilkan nilai nama dari objek s1
        System.out.println(s1.n);
    }
}