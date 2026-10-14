/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author ewiss
 */

// Nama : Euis Sri Mulyani Sihombing
// NIM : 41425050
// Prodi : TRPL
// implements: wajib menulis isi calculateDiscount
public class MemberDiscount implements Discountable {
    private final double rate = 0.10; // diskon member 10%

    // @Override: ini isi dari method di interface, harus public
    @Override
    public double calculateDiscount(double amount) {
        return amount * rate;
    }
}