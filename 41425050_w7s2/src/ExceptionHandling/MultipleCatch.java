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

class MultipleCatch {
    public static void main(String args[]) {
        int n = args.length;
        int a = 1;
        int c[] = new int[1];

        try {
            if (n == 0)
                a = a / (a - 1);
            else
                c[2] = 5;
        } catch (ArithmeticException e) {
            System.out.println("Ups, seem out we have an Arithmetic "
                    + "Exception here...");
        } catch (Exception e) {
            System.out.println("Let the other exception handler here...");
        }
    }
}

/*
a. Eksekusi program tanpa arguments. Catch statement yang dieksekusi
   adalah catch (ArithmeticException e).

   Output:
   Ups, seem out we have an Arithmetic Exception here...

   Penjelasan:
   Karena tidak ada arguments, nilai n = 0. Operasi a / (a - 1)
   menjadi 1 / 0 sehingga terjadi ArithmeticException. Oleh karena
   itu, catch pertama dijalankan.

b. Eksekusi program dengan satu argument. Catch statement yang
   dieksekusi adalah catch (Exception e).

   Output:
   Let the other exception handler here...

   Penjelasan:
   Karena terdapat satu argument, nilai n = 1. Program menjalankan
   c[2] = 5, padahal array c hanya memiliki satu elemen dengan indeks
   0. Akibatnya, terjadi ArrayIndexOutOfBoundsException yang ditangani
   oleh catch (Exception e), karena exception tersebut merupakan
   turunan dari Exception.

c. ArithmeticException diganti dengan Exception dan urutannya
   menjadi catch (Exception e) terlebih dahulu, lalu
   catch (ArithmeticException e).
    (.. 
} catch (Exception e){ 
System.out.println("Ups, seem out we have an Arithmetic Exception 
here..."); 
} catch (ArithmeticException e){ 
System.out.println("Let the other exception handler here..."); 
} .. )

   Hasil:
   Program mengalami compilation error.

   Penjelasan:
   Exception merupakan kelas induk dari ArithmeticException.
   Jika catch (Exception e) ditulis lebih dahulu, semua exception
   yang dapat ditangani oleh catch (ArithmeticException e) sudah
   tercakup oleh catch pertama. Akibatnya, catch kedua tidak dapat
   dijangkau (unreachable catch block).

   Kesimpulan:
   Pada multiple catch, urutan penulisan harus dimulai dari exception
   yang lebih spesifik, kemudian exception yang lebih umum. Contohnya,
   ArithmeticException harus ditulis sebelum Exception.
*/