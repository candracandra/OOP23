/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3PrakOOP;

/**
 *
 * @author CANDRA NURCAHYO
 */
public class penjualan {
    String namaPenjual;
    private String jenisSeragam;
    String noTelpon;
    private String pilihSeragam;
    int harga;
    
    void dataNamaPenjual(String NamaPenjual){
        this.namaPenjual = NamaPenjual;
    }
    
    void dataJenisSeragam(String JenisSeragam){
        this.jenisSeragam = JenisSeragam;
    }
    
    void dataHarga(int Harga){
        this.harga = Harga;
        
    }
    void dataNoTelpon(String NoTelpon){
        this.noTelpon = NoTelpon;
    }
    
    void dataPilihSeragam(String PilihSeragam){
        this.pilihSeragam = PilihSeragam;
    }
    
    public String getPenjual(){
        return namaPenjual;
    }
     
    public String getJenisSeragam(String JenisSeragam){
        return jenisSeragam;
    }
    
    public String getJenisKelamin() {
        return pilihSeragam;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public String getNoTelpon() {
        return noTelpon;
    }
}
