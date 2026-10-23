/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w7s3_41425050;

/**
 *
 * @author ewiss
 */
/*
Nama : Euis Sri Mulyani Sihombing
NIM : 41425050
Prodi : TRPL
*/
// Membuat class exception sendiri dengan nama MakananTidakTersediaException
public class MakananTidakTersediaException extends Exception {

    // Constructor yang menerima pesan error berupa String
    public MakananTidakTersediaException(String ex) {

        // Mengirim pesan error ke constructor milik class Exception
        super(ex);
    }
}