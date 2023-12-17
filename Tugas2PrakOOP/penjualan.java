/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2PrakOOP;

/**
 *
 * @author CANDRA NURCAHYO
 */
public class penjualan {
    String nama,alamat,notelpon,pilihseragam;
    int harga;
    
    public penjualan(){
        this.harga = 10000;   
    }

    void dataNama(String nama){
        this.nama = nama;
    }
    void dataAlamat(String alamat){
        this.alamat = alamat;
    }
    void dataNotelpon(String notelpon){
        this.notelpon = notelpon;
    }
    void dataPilihSeragam(String pilihseragam){
        this.pilihseragam = pilihseragam;
    }
    void dataHarga(int harga){
        this.harga = harga;
    }
    String getNama() {
        return nama;
    }
    String getAlamat() {
        return alamat;
    }
    String getNotelpon() {
        return notelpon;
    }
    String getPilihSeragam() {
        return pilihseragam;
    }
    int getHarga() {
        return harga;
    }
}

