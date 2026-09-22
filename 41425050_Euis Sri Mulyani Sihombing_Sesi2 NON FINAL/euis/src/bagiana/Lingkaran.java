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
Nama : Euis Sri Mulyani Sihombing
NIM : 41425050
Prodi : TRPL
*/
public class Lingkaran {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        final double PI =3.14;
        
        System.out.print("Masukkan jari jari: ");
        double r = input.nextDouble();
        
        if (r<0){
            System.out.println("Error:jari jari tidak boleh negatif.");
   
        }else {
            double luas=PI*r*r;
            double keliling=2*PI*r;
            System.out.println("Luas: " + luas);
            System.out.println("Keliling:"+ keliling);
        }
    }
}
/*
Program diatas untuk menghitung luas dan keliling lingkaran dengan nilai jari-jari yang dimasukkan.

1. mengapa kita perlu validasi r < 0? 
karena jari-jari lingkaran secara konsep tidak mungkin bernilai negatif
2. Dalam aplikasi nyata, di mana validasi input sangat penting? 
pada input transaksi keuangan dll.
*/
