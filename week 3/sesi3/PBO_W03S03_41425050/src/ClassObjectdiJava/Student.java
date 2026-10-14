/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObjectdiJava;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sihombing
// NIM: 41425050
// Prodi :  TRPL
public class Student {
    // Method ini akan dipanggil ketika objek Student dicetak sebagai string
    @Override
    public String toString() {
        return "Student object"; // Mengembalikan teks "Student object"
    }

    public static void main(String[] args) {
        // Membuat objek baru dari class Student
        Student s = new Student();

        // Memanggil method toString() dan mencetak hasilnya ke console
        System.out.println(s.toString());
    }
}
