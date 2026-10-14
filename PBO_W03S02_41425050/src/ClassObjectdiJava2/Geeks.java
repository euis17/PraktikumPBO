/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObjectdiJava2;

/**
 *
 * @author ewiss
 */
// Namw : Euis Sri Mulyani Sihombing
// NIM : 41425050
// Prodi : TRPL
public class Geeks {
    public static void main(String[] args)
    {
        Object o = new String ("GeeksForGeeks");
        Class c = o.getClass();
        System.out.println("Class of Object o is:"
                             + c.getName());
    }
    
}
