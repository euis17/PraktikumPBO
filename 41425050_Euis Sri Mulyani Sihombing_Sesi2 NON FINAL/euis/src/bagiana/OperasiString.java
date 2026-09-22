/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagiana;

import java.util.Scanner;

/**
 *
 * @author ewiss
 */
/*
Nama : Euis S. M Sihombing
NIM : 41425050
Prodi : TRPL
*/
public class OperasiString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.println("Panjang string: " + nama.length());
        
        System.out.println("Huruf pertama: " + nama.charAt(0));
        System.out.println("Mengandung spasi: " + nama.contains(" "));
    }
}
    // agaimana jika nama yang diinput dengan lebih dari satu spasi? 
   // maka program tetap akan membaca semuanya sebagai satu String.