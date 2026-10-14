/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuatObjekDariSebuahKelas;

/**
 *
 * @author ewiss
 */
// Menggunakan Reflection
// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
// Prodi : TRPL
/*Reflection merupakan fitur hebat di java yang memungkin program untuk memeriksa dan 
mengubah struktur serta perilakunya sendiri saat runtime. 
*/
class Student { // Asumsikan kelas student sudah ada
    public Student(){}
}
public class Main {
    public static void main (String[] args) {
        try {
            Class<?> c = Class.forName("Student");
            Student s2 = (Student) c.getDeclaredConstructor().newInstance();
            System.out.println("Object created : " + s2);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found !");
        } catch (NoSuchMethodException e) {
            System.err.println("No default constructor!");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
