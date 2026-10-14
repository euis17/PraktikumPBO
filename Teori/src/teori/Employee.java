/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teori;

/**
 *
 * @author ewiss
 */
public class Employee {
  private String name;
  private int age;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    if (name != null && !name.isEmpty()) {
      this.name = name;
    } else {
      System.out.println("Name cannot be empty!");
    }
  }
  public int getAge() { return age; }
  public void setAge(int age) {
    if (age > 0) this.age = age;
    else System.out.println("Invalid age!");
  }
}