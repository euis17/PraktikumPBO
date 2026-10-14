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
public class CorporateDiscount implements Discountable {
    private final double rate = 0.15; // diskon korporat 15%

    @Override
    public double calculateDiscount(double amount) {
        return amount * rate;
    }
}