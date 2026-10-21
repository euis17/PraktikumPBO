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
class ReThrowExc {
    static void demoThrow() {
        try {
            System.out.println("I'm throwing an exception from demoThrow "
                    + "method");
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("I'm catching the exception [" + e + "]");
            System.out.println("But I'll throw it again...\n");
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            demoThrow();
        } catch (NullPointerException e) {
            System.out.println("I'm catching the exception [" + e + "]\n "
                    + "thrown from demoThrow method");
        }
    }
}

/*
Output:
I'm throwing an exception from demoThrow method
I'm catching the exception [java.lang.NullPointerException: demo]
But I'll throw it again...

I'm catching the exception [java.lang.NullPointerException: demo]
 thrown from demoThrow method

a. Jika exception e tidak dilempar kembali (re-thrown) dari method
   demoThrow, apakah masih akan ditangkap dari dalam main function?

   Jawaban:
   Tidak. Jika exception sudah ditangani oleh catch di dalam
   demoThrow dan tidak dilempar kembali menggunakan throw e,
   maka exception tersebut tidak akan diteruskan ke main.
   Akibatnya, catch di dalam main tidak dijalankan.

b. Apa yang bisa disimpulkan dari kode program di atas?

   Jawaban:
   Re-throwing exception adalah proses melempar kembali exception
   yang sudah ditangkap agar dapat ditangani oleh bagian program lain.
   Pada program ini, exception pertama kali ditangkap di dalam
   demoThrow, kemudian dilempar kembali menggunakan throw e.
   Exception tersebut selanjutnya ditangkap oleh catch di dalam main.

   Kesimpulan:
   Exception dapat ditangkap dan dilempar kembali agar penanganannya
   dapat diteruskan ke method pemanggil.
*/