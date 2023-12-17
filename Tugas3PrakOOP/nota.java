/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3PrakOOP;

/**
 *
 * @author CANDRA NURCAHYO
 */
public class nota extends pembeli{
    public String kodePembelian,tanggalPembelian;
    int biayaPengiriman;
    
    void dataPembelian(String Kode){
        this.kodePembelian = Kode;
    }
    
    void dataTanggalPembelian(String Tanggal){
        this.tanggalPembelian = Tanggal;
    }
    
    void dataBiayaPengiriman(int Biaya){
        this.biayaPengiriman = Biaya;
    }
    
    String getKodePembelian(){
        return kodePembelian;
    }
    
    String getTanggalPembelian(){
        return tanggalPembelian;
    }
    
    int getBiayaPengiriman(){
        return biayaPengiriman;
    }
    
    String getNamaPembeli(){
        return namaPembeli;
    }
    
    String getAlamatPembeli(){
        return alamatPembeli;
    }
}


