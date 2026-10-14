/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObjectdiJava3;

/**
 *
 * @author ewiss
 */
/* Nama : Euis Sri Mulyani Sihombing
NIM : 41425050
Prodi : TRPL
*/
public class Student {

    // Atribut roll digunakan untuk menyimpan nomor roll mahasiswa
    int roll;

    // Override method equals() dari class Object
    @Override
    public boolean equals(Object o) {

        // Mengecek apakah object yang dibandingkan merupakan instance
        // dari class Student
        if (o instanceof Student) {

            // Membandingkan nilai roll dari object saat ini
            // dengan nilai roll dari object o
            return this.roll == ((Student) o).roll;
        }

        // Mengembalikan false jika object bukan merupakan Student
        return false;
    }

    // Method utama untuk menjalankan program
    public static void main(String[] args) {

        // Membuat object Student pertama
        Student s1 = new Student();

        // Memberikan nilai roll 101 pada object s1
        s1.roll = 101;

        // Membuat object Student kedua
        Student s2 = new Student();

        // Memberikan nilai roll 101 pada object s2
        s2.roll = 101;

        // Membuat object Student ketiga
        Student s3 = new Student();

        // Memberikan nilai roll 102 pada object s3
        s3.roll = 102;

        // Membandingkan object s1 dengan s2 menggunakan equals()
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        // Membandingkan object s1 dengan s3 menggunakan equals()
        System.out.println("s1.equals(s3): " + s1.equals(s3));
    }
}
