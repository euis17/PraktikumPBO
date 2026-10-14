/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SATU.SATU.MethodOverloading;

/**
 *
 * @author ewiss
 */

// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
//  Prodi : TRPL

class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

class Hermionie extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

public class DemoPenyihir {
    public static void main(String[] args) {
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermionie();

        penyihir1.ucapkanMantra(); // Output: Harry Potter mengucapkan mantra dengan tongkatnya yang unik.
        penyihir2.ucapkanMantra(); // Output: Hermione mengucapkan mantra dengan tepat dan percaya diri.
    }
}
/*
Pertanyaan: 
override 
1. Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode masih 
berjalan?
>> Ya, kode tetap bisa berjalan meskipun annotation @Override dihapus, selama method pada
kelas turunan memiliki nama, parameter, dan tipe pengembalian yang sesuai dengan method pada kelas induk. 
Annotation @Override berfungsi untuk membantu compiler memeriksa apakah method tersebut benar-benar melakukan overriding.
Jika terdapat kesalahan penulisan method, compiler dapat memberikan peringatan berupa error saat @Override digunakan.
2. Apa keuntungan menggunakan polymorphism dalam contoh ini?
Keuntungan polymorphism adalah kita dapat memanggil method ucapkanMantra() yang sama pada objek penyihir yang berbeda,
tetapi menghasilkan perilaku yang berbeda sesuai kelasnya. Contohnya, objek HarryPotter menampilkan pesan 
bahwa Harry mengucapkan mantra dengan tongkatnya yang unik, sedangkan objek Hermionie menampilkan pesan
bahwa Hermione mengucapkan mantra dengan tepat dan percaya diri.
Dengan demikian, program menjadi lebih fleksibel dan mudah dikembangkan tanpa harus membuat nama method yang berbeda untuk setiap penyihir.
*/