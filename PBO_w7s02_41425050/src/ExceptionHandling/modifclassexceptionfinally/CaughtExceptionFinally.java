/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling.modifclassexceptionfinally;

/**
 *
 * @author ewiss
 */

//  Nama : Euis Sri Mulyani Sihombing
//  NIM : 41425050
//  Prodi : TRPL

public class CaughtExceptionFinally {
    public static void main(String args[]) {
        int n = args.length;
        try {
            if (n == 0) {
                System.out.println(3 / n);
                System.out.println("This won't be executed");
            } else {
                System.out.println("This will be executed if arguments is not Zero");
            }
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("After trying or catching....");
        }
    }
}

/*
Jawaban:

Jika program dijalankan tanpa arguments, output yang dihasilkan:

Exception in thread "main" java.lang.ArithmeticException: / by zero
    at CaughtExceptionFinally.main(CaughtExceptionFinally.java:7)
After trying or catching....

Penjelasan:
Ketika program dijalankan tanpa arguments, nilai n = 0 sehingga
operasi 3 / n menyebabkan ArithmeticException. Namun, blok catch
menggunakan NullPointerException, sehingga exception tersebut tidak
dapat ditangani karena jenis exception-nya berbeda.

Akibatnya, program menampilkan pesan error dan menghentikan eksekusi
pernyataan berikutnya di dalam blok try. Meskipun demikian, blok
finally tetap dijalankan.

Jika program dijalankan dengan arguments, blok else akan dijalankan
dan tidak terjadi exception. Blok catch dilewati, sedangkan blok
finally tetap dijalankan.

Kesimpulan:
Jika sebuah exception tidak memiliki blok catch yang cocok, exception
tersebut tidak tertangani oleh blok catch tersebut dan akan diteruskan
ke pemanggil hingga ditemukan penangan yang cocok. Jika tidak ada
penangan yang cocok, program berakhir dengan menampilkan informasi
exception. Blok finally tetap dijalankan dalam alur ini.
*/