/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObjectdiJava3;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sihombing

public class Book implements Cloneable {

    // Variabel t untuk menyimpan judul buku
    private String t;

    // Variabel a untuk menyimpan nama penulis
    private String a;

    // Variabel y untuk menyimpan tahun terbit
    private int y;

    // Constructor untuk memberikan nilai awal pada atribut buku
    public Book(String t, String a, int y)
    {
        // Mengisi atribut judul
        this.t = t;

        // Mengisi atribut penulis
        this.a = a;

        // Mengisi atribut tahun terbit
        this.y = y;
    }

    // Override method toString()
    // Digunakan untuk mengubah object Book menjadi bentuk String
    @Override
    public String toString()
    {
        // Mengembalikan informasi judul, penulis, dan tahun
        return t + " by " + a + " (" + y + ")";
    }

    // Override method equals()
    // Digunakan untuk membandingkan dua object Book
    @Override
    public boolean equals(Object o)
    {
        // Mengecek apakah object o bernilai null
        // atau bukan merupakan instance dari class Book
        if (o == null || !(o instanceof Book)) {
            return false;
        }

        // Mengubah object o menjadi object Book
        Book other = (Book)o;

        // Membandingkan judul, penulis, dan tahun terbit
        return this.t.equals(other.getTitle())
                && this.a.equals(other.getAuthor())
                && this.y == other.getYear();
    }

    // Override method hashCode()
    // Digunakan untuk menghasilkan nilai hash berdasarkan atribut object
    @Override
    public int hashCode()
    {
        // Nilai awal hash
        int res = 17;

        // Menghitung hash berdasarkan judul
        res = 31 * res + t.hashCode();

        // Menghitung hash berdasarkan penulis
        res = 31 * res + a.hashCode();

        // Menghitung hash berdasarkan tahun
        res = 31 * res + y;

        // Mengembalikan hasil hash code
        return res;
    }

    // Override method clone()
    // Digunakan untuk membuat salinan dari object Book
    @Override
    public Book clone()
    {
        try {
            // Membuat dan mengembalikan salinan object Book
            return (Book) super.clone();

        } catch (CloneNotSupportedException e) {

            // Menampilkan error jika proses cloning tidak didukung
            throw new AssertionError();
        }
    }
        // Override method finalize()
    // Method ini dipanggil ketika object akan diproses oleh Garbage Collector
    @Override
    protected void finalize() throws Throwable
    {
        // Menampilkan informasi object yang sedang difinalisasi
        System.out.println("Finalizing " + this);
    }

    // Method untuk mendapatkan judul buku
    public String getTitle() {
        return t;
    }

    // Method untuk mendapatkan nama penulis
    public String getAuthor() {
        return a;
    }

    // Method untuk mendapatkan tahun terbit
    public int getYear() {
        return y;
    }

    // Method utama untuk menjalankan program
    public static void main(String[] args)
    {
        // Membuat object Book pertama
        Book b1 = new Book(
                "The Hitchhiker's Guide to the Galaxy",
                "Douglas Adams", 1979);

        // Menampilkan informasi buku b1
        System.out.println(b1);

        // Membuat object b2 sebagai hasil clone dari b1
        Book b2 = b1.clone();

        // Menampilkan informasi buku b2
        System.out.println(b2);

        // Membandingkan apakah b1 dan b2 memiliki isi yang sama
        System.out.println("b1 equals b2: "
                + b1.equals(b2));

        // Menampilkan hash code dari b1
        System.out.println("b1 hash code: "
                + b1.hashCode());

        // Menampilkan hash code dari b2
        System.out.println("b2 hash code: "
                + b2.hashCode());

        // Mengubah referensi b1 menjadi null
        b1 = null;

        // Meminta JVM menjalankan Garbage Collector
        System.gc();
    }
}
/*Metode wait(), notify(), dan notifyAll() adalah metode concurrency di Java yang 
digunakan untuk sinkronisasi antar thread, khususnya saat beberapa thread berbagi resource yang 
sama (misalnya variabel atau objek). Metode-metode ini adalah bagian dari class Object (bukan 
Thread), sehingga semua objek di Java punya metode ini secara bawaan. Tapi penggunaannya 
hanya bisa dilakukan di dalam blok synchronized atau metode synchronized, karena tujuannya 
adalah mengatur thread yang mengunci (lock) objek tersebut
*/