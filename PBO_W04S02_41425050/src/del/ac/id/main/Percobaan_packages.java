/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package del.ac.id.main;

import del.ac.id.anakan.Mobil;
import del.ac.id.anakan.Motor;
import del.ac.id.anakan.Sepeda;
// Nama : Euis Sihombing
/**
 *
 * @author ewiss
 */
public class Percobaan_packages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // main merupakan titik awal program dijalankan
        // static berarti dapat dijalankan tanpa membuat objek dari class ini
        // void berarti tidak mengembalikan nilai
        // String[] args digunakan untuk menerima argumen dari command line

        // TODO code application logic here
        // komentar bawaan NetBeans

        Motor objMotor = new Motor();
        // membuat objek Motor dengan nama objMotor

        objMotor.setDimensiKendaraan(274);
        // mengisi dimensi kendaraan Motor dengan nilai 274

        objMotor.setJlhRoda(2);
        // mengisi jumlah roda Motor dengan nilai 2

        objMotor.setJlhSpion(2);
        // mengisi jumlah spion Motor dengan nilai 2

        objMotor.setWarnaKendaraan("Hitam");
        // mengisi warna Motor dengan "Hitam"

        objMotor.setJlhTorsi(1);
        // mengisi jumlah torsi Motor dengan nilai 1

        objMotor.setPanjangGagang((float) 15.5);
        // mengisi panjang gagang Motor dengan nilai 15.5

        objMotor.setRasioGigi((float) 4.2);
        // mengisi rasio gigi Motor dengan nilai 4.2

        objMotor.setFaktorPembagi(2);
        // mengisi faktor pembagi Motor dengan nilai 2


        Mobil objMobil = new Mobil();
        // membuat objek Mobil dengan nama objMobil

        objMobil.setDimensiKendaraan(632);
        // mengisi dimensi kendaraan Mobil dengan nilai 632

        objMobil.setJlhRoda(4);
        // mengisi jumlah roda Mobil dengan nilai 4

        objMobil.setJlhSpion(2);
        // mengisi jumlah spion Mobil dengan nilai 2

        objMobil.setWarnaKendaraan("Grey");
        // mengisi warna Mobil dengan "Grey"

        objMobil.setJlhTorsi(1);
        // mengisi jumlah torsi Mobil dengan nilai 1

        objMobil.setPanjangGagang((float) 20.5);
        // mengisi panjang gagang Mobil dengan nilai 20.5

        objMobil.setRasioGigi((float) 50.4);
        // mengisi rasio gigi Mobil dengan nilai 50.4

        objMobil.setFaktorPembagi(3);
        // mengisi faktor pembagi Mobil dengan nilai 3


        Sepeda objSepeda = new Sepeda();
        // membuat objek Sepeda dengan nama objSepeda

        objSepeda.setDimensiKendaraan(24);
        // mengisi dimensi kendaraan Sepeda dengan nilai 24

        objSepeda.setJlhRoda(2);
        // mengisi jumlah roda Sepeda dengan nilai 2

        objSepeda.setJlhSpion(0);
        // mengisi jumlah spion Sepeda dengan nilai 0

        objSepeda.setWarnaKendaraan("Putih");
        // mengisi warna Sepeda dengan "Putih"


        objMotor.cetakInformasi(objMotor);
        // memanggil method cetakInformasi() untuk menampilkan informasi Motor

        objMobil.cetakInformasi(objMobil);
        // memanggil method cetakInformasi() untuk menampilkan informasi Mobil

        objSepeda.cetakInformasi(objSepeda);
        // memanggil method cetakInformasi() untuk menampilkan informasi Sepeda
    }
}
/*
1. Lakukan analisa mengapa atribut jlhTorsi, faktorPembagi, panjangGagang, dan 
rasioGigi termasuk setter-getter nya pada kelas Motor dan Mobil tidak dibuat di 
dalam IKenderaan? Buatlah laporan anda dalam bentuk softcopy.


Atribut jlhTorsi, faktorPembagi, panjangGagang, dan rasioGigi beserta setter dan getter-nya tidak dibuat 
di dalam IKendaraan karena atribut tersebut merupakan data khusus yang digunakan oleh Motor dan Mobil,
bukan data umum yang harus dimiliki semua kendaraan. IKendaraan hanya berisi method yang bersifat umum bagi kendaraan, 
seperti jumlah roda, dimensi, jumlah spion, warna, dan perhitungan percepatan. Jika atribut tersebut dimasukkan ke dalam IKendaraan, 
maka setiap class yang mengimplementasikan interface tersebut harus menyediakan method tersebut meskipun class tersebut tidak membutuhkannya,
seperti pada Sepeda. Oleh karena itu, atribut tersebut lebih tepat diletakkan pada class Motor dan Mobil sebagai kebutuhan khusus masing-masing class.
*/

/* 2. Error terjadi karena protected membatasi akses method. Percobaan_packages 
berada di package yang berbeda dan bukan subclass dari Kendaraan, sehingga tidak
dapat mengakses method protected milik Kendaraan.
*/

/* 3. Sama seperti soal no.2, lakukan perubahan access modifier metode pada kelas 
“Mobil” menjadi “protected”. Lakukan observasi kecil, mengapa perubahan ini 
mengakibatkan error pada program. Buatlah laporan anda dalam bentuk softcopy. 

Perubahan access modifier pada method Mobil menjadi 
protected menyebabkan error karena Percobaan_packages
berada di package yang berbeda dan bukan subclass dari Mobil. 
Oleh karena itu, method protected pada Mobil tidak dapat dipanggil 
secara langsung dari Percobaan_packages.
*/