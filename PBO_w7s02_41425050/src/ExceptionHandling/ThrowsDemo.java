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

class ThrowsDemo {
    static void throwOne() {
        System.out.println("I'm throwing a non Runtime exception that I "
                + "don't handle");
        System.out.println("Without specifying in method declaration");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        throwOne();
    }
}

/*
a. Apa yang akan terjadi jika kode program di atas dieksekusi? Mengapa?

Jawaban:
Program mengalami compilation error karena IllegalAccessException
merupakan checked exception yang harus ditangani menggunakan try-catch
atau dideklarasikan dengan throws pada method. Pada kode tersebut,
exception dilempar menggunakan throw, tetapi tidak ditangani atau
dideklarasikan pada method throwOne().

b. Apa yang akan terjadi jika IllegalAccessException diganti dengan
ArithmeticException? Mengapa? Perbaiki kode program di atas seperti
yang ditunjukkan.

Jawaban:
Jika IllegalAccessException diganti dengan ArithmeticException,
program dapat dikompilasi dan dijalankan tanpa harus menggunakan
try-catch atau throws karena ArithmeticException merupakan unchecked
exception.

Namun, jika tetap menggunakan kode throw new ArithmeticException("demo"),
program tidak otomatis menghasilkan error aritmetika. Program hanya
melempar exception secara manual dengan pesan "demo".

Perbaikan kode :

class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("I'm throwing a non Runtime exception that I "
                + "don't handle");
        System.out.println("Without specifying in method declaration");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}

Output:
I'm throwing a non Runtime exception that I don't handle
Without specifying in method declaration
Caught java.lang.IllegalAccessException: demo

Kesimpulan:
Checked exception harus ditangani dengan try-catch atau dideklarasikan
menggunakan throws. Sementara itu, unchecked exception seperti
ArithmeticException tidak wajib ditangani atau dideklarasikan.
*/