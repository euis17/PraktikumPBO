/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deserialization;

/**
 *
 * @author ewiss
 */

// Nama : Euis  Sri Mulyani Sihombing
// NIM : 41425050
// Prodi : TRPL

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        // Serialization
        // Mengubah object menjadi bentuk yang dapat disimpan ke file
        try (ObjectOutputStream out
                = new ObjectOutputStream(
                        new FileOutputStream("student.ser"))) {

            // Menyimpan object Student dengan nama "Alice"
            out.writeObject(new Student("Alice"));

        } catch (IOException e) {

            // Menampilkan informasi error jika terjadi kesalahan
            e.printStackTrace();
        }

        // Deserialization
        // Membaca kembali object yang telah disimpan dalam file
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("student.ser"))) {

            // Membaca object dari file kemudian mengubahnya menjadi Student
            Student s = (Student) in.readObject();

            // Menampilkan object Student
            System.out.println(s);

        } catch (Exception e) {

            // Menampilkan informasi error jika terjadi kesalahan
            e.printStackTrace();
        }
    }
}