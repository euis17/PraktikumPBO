/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author ewiss
 */
//  Nama : Euis S.M Sihombing
// NIM : 41425050
// Prodi : TRPL
class Mahasiswa { 
    String nama; 
    String nim; 
} 

public class Main { 
    public static void main(String[] args) { 
        Mahasiswa m1 = new Mahasiswa(); 
        m1.nama = "Euis";             
        m1.nim = "41425050";              
        
        System.out.println("Nama: " + m1.nama); 
        System.out.println("NIM: " + m1.nim); 
    } 
}

