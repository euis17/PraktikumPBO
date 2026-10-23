/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author ewiss
 */
//  Nama : Euis Sri Mulyani Sihombing
//  NIM : 41425050
//  Prodi : TRPL
public class HandlingException {
    public static void main (String[] args){
        try {
            System.out.println (3/0);
        } catch (ArithmeticException ex){
            System.out.println("Error" + ex);
        }
    }
    
}
/*
a. Ganti ex dengan ex.getMessage() dan ex.getStackTrace(). Coba juga untuk 
mengeksekusi statement ex.printStackTrace() dan lihat apa hasilnya. 
1. Menggunakan ex.getMessage()
output   : Error: / by zero
Menampilkan pesan singkat yang menjelaskan penyebab error, 
yaitu pembagian bilangan bulat dengan nol.

2.Menggunakan ex.getStackTrace()
output: [Ljava.lang.StackTraceElement;@...
Mengembalikan array yang berisi informasi lokasi terjadinya exception. Jika dicetak langsung, hasilnya berupa identitas objek array, bukan rincian stack trace yang mudah dibaca.

3. Menggunakan ex.printStackTrace()
outpuut :java.lang.ArithmeticException: / by zero
         at ExceptionHandling.HandlingException.main(HandlingException.java:4)
Penjelasan: Menampilkan jenis exception, pesan error, dan lokasi terjadinya exception. Nomor baris dapat berbeda sesuai letak kode.

b. Ganti AtirhmeticException dengan Exception. Apa hasilnya? Jelaskan.
output : Errorjava.lang.ArithmeticException: / by zero
BUILD SUCCESSFUL

Penjelasan: Program tetap berjalan dan error berhasil ditangani karena ArithmeticException merupakan turunan dari kelas Exception. ArithmeticException digunakan untuk menangani kesalahan aritmetika secara spesifik, sedangkan Exception dapat menangani berbagai jenis exception turunannya.
*/