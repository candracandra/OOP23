/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8PrakOOP;

/**
 *
 * @author CANDRA NURCAHYO
 */
public class pembeli extends penjualan{
    String alamat;
  
    // Konstruktor dengan parameter
    public pembeli(String nama, String alamat, String noTelpon) {
        super(nama, alamat, noTelpon);
        this.alamat = alamat;
    }

    pembeli() {
        this.alamat = "";
    }
    // Getter dan setter
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    // Overriding metode info 
    @Override
    public void info() {
         // Memanggil metode info 
        System.out.println("Alamat : " + alamat);
    }

}
