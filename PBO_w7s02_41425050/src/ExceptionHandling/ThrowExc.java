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
class ThrowExc {
    public static void main(String args[]) {
        try {
            System.out.println("I'm throwing an exception from here...");
            throw new NullPointerException("throw demo");
        } catch (NullPointerException e) {
            System.out.println("I'm catching an exception: [" + e + "] "
                    + "from here...");
        }
    }
}

/*
Output:
I'm throwing an exception from here...
I'm catching an exception: [java.lang.NullPointerException: throw demo] from here...

Penjelasan:
Kata kunci throw digunakan untuk melempar exception secara manual.
Exception NullPointerException dilempar dengan pesan "throw demo",
kemudian ditangkap oleh catch karena jenis exception-nya cocok.
Program dapat melanjutkan eksekusi setelah exception ditangani.
*/