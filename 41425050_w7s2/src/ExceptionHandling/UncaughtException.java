/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author ewiss
 */
//  Nama : Euis Sri Mulyani Sihombing
//  NIM : 41425050
//  Prodi : TRPL

public class UncaughtException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(3/0);
    }
    
}

/*
1.Analisis apa yang akan terjadi ketika program di atas di eksekusi. 
Program akan menghasilkan error java.lang.ArithmeticException: / by zero
karena program mencoba melakukan pembagian bilangan bulat dengan nol (3/0).
Pembagian bilangan bulat dengan nol tidak diperbolehkan di Java. Karena tidak ada penanganan error 
menggunakan try-catch, exception tersebut tidak tertangani (uncaught exception) dan program berhenti.
2. apa outputnya
jawab; Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandling.UncaughtException.main(UncaughtException.java:22)

*/
