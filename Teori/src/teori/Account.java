/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teori;

/**
 *
 * @author ewiss
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
public class Account {
  public double balance;
}
// Anywhere else in the program:
Account acc = new Account();
acc.balance = -999999;
// Java: no error at all!
/* Is this a bug in Java — or a bug in how the class was
designed? Whose job is it to stop a negative balance
from ever happening?

jadi ini kesalahan pada bagaimana class itu dibuat, dimana pada kkode tersebut 
*/