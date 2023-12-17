/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8PrakOOP;

/**
 *
 * @author CANDRA NURCAHYO
 */
public abstract class penjualan {
    String nama;
    String noTelpon;
    String pilihSeragam;

    // Konstruktor tanpa parameter
    public penjualan() {
    }

    // Konstruktor dengan parameter
    public penjualan(String nama, String noTelpon, String pilihSeragam) {
        this.nama = nama;
        this.noTelpon = noTelpon;
        this.pilihSeragam = pilihSeragam;
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

    public String getPilihSeragam() {
        return pilihSeragam;
    }

    public void setPilihSeragam(String pilihSeragam) {
        this.pilihSeragam = pilihSeragam;
    }

    // Metode cetak informasi (abstrak)
    public abstract void info();
}
