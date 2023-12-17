/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3PrakOOP;

/**
 *
 * @author CANDRA NURCAHYO
 */
public class pembeli extends penjualan{
    public String namaPembeli;
    public String alamatPembeli;
    private int jumlah,total;
    
    void dataNamaPembeli(String Pembeli){
        this.namaPembeli = Pembeli;
    }
    
    void dataAlamat(String Alamat){
        this.alamatPembeli = Alamat;
    }
    
    void dataJumlah(int Jumlah){
        this.jumlah = Jumlah;
    }
    
    void dataTotal(int Total){
        this.total = Total;
    }
    
    String getNamaPembeli(){
        return namaPembeli;
    }
    
    String getAlamat(){
        return alamatPembeli;
    }
    
    int getJumlah(){
        return jumlah;
    }
    
    int getHargaPerpcs(){
        return harga;
    }
    int getTotalHarga(){
      int total;
      total = harga * getJumlah();
        return total;
    }
}
