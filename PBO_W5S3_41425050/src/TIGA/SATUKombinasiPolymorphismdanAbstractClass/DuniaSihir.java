/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TIGA.SATUKombinasiPolymorphismdanAbstractClass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
//  Prodi : TRPL




abstract class Mantra {
    private String nama;

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Abstract method untuk efek mantra
    public abstract void efek();
}

class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

class Penyihir {
    private String nama;
    private List<Mantra> mantraList;

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();
                return;
            }
        }
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }
}

public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();

        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos"); // Harry belum belajar Lumos

        // Tambahkan mantra Lumos dan coba lagi
        Mantra lumos = new Lumos();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");
    }
}
/*
1. Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini? 
Jawab : Abstract class Mantra menjadi kelas dasar yang memiliki method abstrak efek() 
yang wajib diimplementasikan oleh setiap kelas mantra turunannya. 
Polymorphism memungkinkan objek dari kelas turunan, seperti Expelliarmus, ExpectoPatronum, dan Lumos, 
diperlakukan sebagai objek bertipe Mantra, tetapi masing-masing menghasilkan efek yang berbeda ketika method efek() dipanggil.
Dengan demikian, program menjadi lebih terstruktur dan fleksibel.

2.Apa yang akan terjadi jika kita menambahkan mantra baru tanpa mengubah 
kelas Penyihir? Apakah mudah? Mengapa? 
Jawab : Menambahkan mantra baru dapat dilakukan dengan mudah tanpa mengubah kelas Penyihir.
Kita cukup membuat kelas baru yang mewarisi Mantra dan mengimplementasikan method efek(). 
Setelah itu, objek mantra baru dapat ditambahkan menggunakan method belajarMantra() dan
dipanggil melalui method ucapkanMantra() yang sudah tersedia.
Hal ini dimungkinkan karena kelas Penyihir menggunakan polymorphism untuk
menangani berbagai jenis mantra melalui tipe dasar Mantra, sehingga program mudah dikembangkan tanpa mengubah kode yang sudah ada.
*/
