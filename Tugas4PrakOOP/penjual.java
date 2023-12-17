/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4PrakOOP;

/**
 *
 * @author CANDRA NURCAHYO
 */
public class penjual {
    String nama;
    String noTelpon;
    String bahan;

    // Konstruktor tanpa parameter
    public penjual() {
    }
    // Konstruktor dengan parameter
    public penjual(String nama, String noTelpon, String bahan) {
        this.nama = nama;
        this.noTelpon = noTelpon;
    }
    // Getter dan setter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNoTelpon() {
        return noTelpon;
    }
    public void setNotelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }
    public String getBahan() {
    return bahan;
    }
    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
    // Metode cetak informasi
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("No Telpon: " + noTelpon);
    }

}
