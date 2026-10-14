/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package del.ac.id.induk;

/**
 *
 * @author ewiss
 */
public class Kendaraan implements IKendaraan{ // membuat class kendaraan yyang dapat diakses semua class (Public) 
// kendaraan harus menyediakan method method yang ada pada IKendaraan 
// implements digunakan untuk menerapkan interface IKendaraan
     
     
    private int jlhRoda, dimensiKendaraan, jlhSpion;// class hanya dapat diakses langsung dari dalam class kendaraan 
    // menyimpan jumlah roda, dimensi kendaraan, dan jumlah spion
    private String warnaKendaraan;// Menyimpan warna kendaraan dalam bentuk String. 
    // private digunakan agar data tidak dapat diakses secara langsung dari luar class
     
    //Pada method setJlhRoda(int value),
    //void menunjukkan bahwa method tidak mengembalikan nilai. 
    //Sedangkan int value merupakan parameter,
    //yaitu method menerima satu nilai bertipe int yang digunakan //untuk menentukan jumlah roda.
    
    
    
    // kenapasi ga set public, biar gabisa diubah secara langsung 
    // data private diakses melalui method setter dan getter
    public Kendaraan() {} 
    // constructor Kendaraan yang digunakan saat objek dibuat
 
    @Override 
    public void setJlhRoda(int value) { 
        jlhRoda = value; 
    } 
    // mengatur atau mengubah nilai jumlah roda
    // @Override menunjukkan bahwa method berasal dari interface IKendaraan
 
    @Override 
    public void setDimensiKendaraan(int value) { 
        dimensiKendaraan = value; 
    } 
    // mengatur atau mengubah nilai dimensi kendaraan
 
    @Override 
    public void setJlhSpion(int value) { 
        jlhSpion = value; 
    } 
    // mengatur atau mengubah nilai jumlah spion
 
    @Override 
    public void setWarnaKendaraan(String value) { 
        warnaKendaraan = value; 
    } 
    // mengatur atau mengubah warna kendaraan
 
    @Override 
    public void cetakInformasi(Object o) { 
        if (o == null) System.out.println("Object is Null!"); 
    } 
    // mengecek apakah object bernilai null
    // jika null, maka menampilkan "Object is Null!"
 
    @Override 
    public int getJlhRoda() { 
        return jlhRoda; 
    } 
    // mengambil nilai jumlah roda
 
    @Override 
    public int getDimensiKendaraan() { 
        return dimensiKendaraan; 
    } 
    // mengambil nilai dimensi kendaraan
 
    @Override 
    public int getJlhSpion() { 
        return jlhSpion; 
    } 
    // mengambil nilai jumlah spion
 
    @Override 
    public String getWarnaKendaraan() { 
        return warnaKendaraan; 
    } 
    // mengambil nilai warna kendaraan
 
    @Override 
    public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) { 
        return jlhTorsi * panjangGagang * rasioGigi; 
    } 
    // menghitung percepatan berdasarkan torsi, panjang gagang, dan rasio gigi
    // return mengembalikan hasil perhitungan
} 
// menandakan akhir dari class Kendaraan