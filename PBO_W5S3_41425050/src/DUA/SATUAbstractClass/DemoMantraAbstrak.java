/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DUA.SATUAbstractClass;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
//  Prodi : TRPL

abstract class MantraAbstrak {
    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method: harus diimplementasikan oleh subclass
    public abstract void efek();

    // Method konkret
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

public class DemoMantraAbstrak {
    public static void main(String[] args) {
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();
    }
} 

/*
1. Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung? 
Coba dan jelaskan errornya. 
2. Mengapa kita perlu membuat abstract class? Apa keuntungannya? 

JAWAB :

1. Jika kita mencoba membuat objek dari kelas MantraAbstrak secara langsung, 
program akan mengalami error saat kompilasi karena MantraAbstrak merupakan kelas abstrak (abstract class). 
Contohnya, jika kita menuliskan MantraAbstrak mantra = new MantraAbstrak("Expelliarmus");,
Java akan menampilkan error karena kelas abstrak tidak dapat dibuat menjadi objek secara langsung.
Kita harus membuat objek dari kelas turunan, seperti Expelliarmus atau ExpectoPatronum, yang mengimplementasikan method abstrak efek().

2. Abstract class digunakan sebagai kelas dasar yang menjadi kerangka bagi kelas-kelas turunannya. 
Keuntungannya adalah kita dapat menentukan method abstrak yang wajib diimplementasikan oleh kelas turunan, 
sekaligus menyediakan atribut dan method umum yang dapat digunakan bersama. Dengan demikian, kode menjadi lebih terstruktur,
mengurangi pengulangan kode, dan memudahkan pengembangan program ketika menambahkan jenis mantra baru.
*/
