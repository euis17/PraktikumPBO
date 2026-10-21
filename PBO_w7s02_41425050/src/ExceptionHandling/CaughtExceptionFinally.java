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
public class CaughtExceptionFinally {
    public static void main (String args[]){
        int n = args.length;
        try {
            if (n == 0) {
                System.out.println(3/n);
                System.out.println ("This won't be exxecuted");
          
            }else {
                System.out.println ("This will be excuted if" + "arguments is not Zero");
            }
        }catch (Exception e){
            System.out.println("Catching exception: " + e);
           
        }finally {
            System.out.println ("After trying or catching....");
        }
    }
    
}
/*
a. Coba eksekusi program di atas tanpa arguments. Apa hasilnya?

   Output:
   Catching exception: java.lang.ArithmeticException: / by zero
   After trying or catching....

   Penjelasan:
   Jika program dijalankan tanpa arguments, nilai n = 0.
   Akibatnya, operasi 3 / n menjadi 3 / 0 dan menghasilkan
   ArithmeticException. Exception ditangani oleh blok catch.
   Pernyataan "This won't be executed" tidak dijalankan karena
   terjadi error sebelum pernyataan tersebut. Blok finally
   tetap dijalankan.

b. Coba eksekusi program di atas dengan arguments. Apa hasilnya?

   Output:
   This will be executed if arguments is not Zero
   After trying or catching....

   Penjelasan:
   Jika program dijalankan dengan arguments, nilai n lebih
   besar dari 0. Kondisi n == 0 bernilai false sehingga blok
   else dijalankan. Tidak terjadi exception, blok catch dilewati,
   dan blok finally tetap dijalankan.

c. Kesimpulan:

   Ketika program dijalankan tanpa arguments, pembagian dengan
   nol menyebabkan ArithmeticException yang ditangani oleh catch.
   Ketika dijalankan dengan arguments, blok else dijalankan karena
   jumlah arguments tidak sama dengan nol sehingga tidak terjadi
   exception. Dalam kedua kondisi tersebut, blok finally tetap
   dijalankan, baik terjadi exception maupun tidak.
*/