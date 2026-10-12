/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InisialisasiObjek;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
// Prodi : TRPL
public class Dog {

    // Menyimpan nama dari objek Dog
    String name;

    // Menyimpan jenis/ras dari objek Dog
    String breed;

    // Menyimpan umur dari objek Dog
    int age;

    // Menyimpan warna dari objek Dog
    String color;

    // Constructor
    // Digunakan untuk memberikan nilai awal pada atribut Dog
    public Dog(String name, String breed, int age,
               String color) {

        // Mengisi atribut name dengan nilai dari parameter name
        this.name = name;

        // Mengisi atribut breed dengan nilai dari parameter breed
        this.breed = breed;

        // Mengisi atribut age dengan nilai dari parameter age
        this.age = age;

        // Mengisi atribut color dengan nilai dari parameter color
        this.color = color;
    }

    // method 1
    // Mengembalikan nilai nama Dog
    public String getName() {
        return name;
    }

    // method 2
    // Mengembalikan nilai breed/ras Dog
    public String getBreed() {
        return breed;
    }

    // method 3
    // Mengembalikan nilai umur Dog
    public int getAge() {
        return age;
    }

    // method 4
    // Mengembalikan nilai warna Dog
    public String getColor() {
        return color;
    }

    // Mengubah tampilan objek Dog menjadi String
    @Override
    public String toString() {
        return "Name is: " + this.getName()
                + "\nBreed, age, and color are: "
                + this.getBreed() + ", " + this.getAge()
                + ", " + this.getColor();
    }

    // Method utama untuk menjalankan program
    public static void main(String[] args) {

        // Membuat objek Dog bernama tuffy
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");

        // Menampilkan informasi objek tuffy
        System.out.println(tuffy.toString());
    }
}/*mendefinisikan kelas Dog dengan variabel instance name, breed, age, dan 
color. Nilai awal diberikan melalui konstruktor, sedangkan method getter digunakan untuk 
mengambil data dari objek. Method toString() dioverride agar saat objek dicetak, informasi 
ditampilkan secara jelas. Pada main(), dibuat objek Dog bernama tuffy dengan ras papillon, umur 
5 tahun, dan warna putih, lalu detail objek tersebut ditampilkan ke layar. 
*/