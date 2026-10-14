/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianSatu2;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sri Muulyani Sihombing
// NIM : 41425050
// Prodi : TRPL
class KurirReguler {
    protected String nama;

    public KurirReguler(String nama) {
        this.nama = nama;
    }

    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}

class KurirDrone extends KurirReguler {
    private String idDrone;

    public KurirDrone(String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }

    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama +
                " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");

        KurirReguler k1 = new KurirReguler("Budi");

        KurirReguler k2 = new KurirDrone("Zarka", "DRN-01");

        k1.kirimBarang("Jl. Sudirman No. 10");
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}

/*
Menurut saya, overriding berfungsi untuk mengubah 
perilaku method dari class induk pada class turunannya,
sehingga ketika method yang sama dipanggil, 
program menjalankan perilaku sesuai dengan objek yang digunakan.
*/