/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

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
public class LoginBerlapis {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        
        String password = scanner.nextLine();

        boolean usernameValid = username.equals("admin");
        
        boolean passwordValid = password.length() >= 6 && password.matches(".*\\d.*");

        if (usernameValid && passwordValid) {
            System.out.println("Login berhasil!");
        } else if (!usernameValid) {
            System.out.println("Login gagal! Username tidak valid.");
        } else {
            System.out.println("Login gagal! Password tidak valid.");
        }
    }
  
}
