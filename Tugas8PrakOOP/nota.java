/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8PrakOOP;

/**
 *
 * @author CANDRA NURCAHYO
 */
public class nota extends penjualan implements diskon{
    int jumlah,harga;
    int total;
    
    void dataPembeli(String Nama){
        this.nama = Nama;
    }
    
    void dataHarga(int Harga){
        this.harga = Harga;
    }
    
    void dataJumlah(int Jumlah){
        this.jumlah = Jumlah;
    }
    
    String getNamaPembeli(){
    return nama;
    }
    
    String getNotelpon(){
        return noTelpon;
    }
    
    int getJumlah(){
    return jumlah;
    }
    
    int getHarga(){
    return harga;
    }
   
    int getTotalHarga(){
      int total;
      total = harga * getJumlah();
      return total;
    }
    
    
     @Override
    public void info() {
        System.out.println("Total Harga: " + getTotalHarga());
    }
    
    @Override
    public int hitungPotongan(){
        int total = getTotalHarga() - 5000;
        return total;
    }

    @Override
    public int hitungTotal() {
        int total = (harga*getJumlah()-hitungPotongan());
        return total;
    }
    


}
