/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1PrakOOP;

/**
 *
 * @author CANDRA NURCAHYO
 */
public class Class1 {
    String prosesor,ram,vga,jenispenyimpanan,besarpenyimpanan;
    int harga;
    
    public Class1(){
        this.prosesor = "i9";
        this.harga = 10000;   
    }

    void dataProsesor(String prosesor){
        this.prosesor = prosesor;
    }
    void dataVGA(String vga){
        this.vga = vga;
    }
    void dataRAM(String ram){
        this.ram = ram;
    }
    void dataJenisPenyimpanan(String jenispenyimpanan){
        this.jenispenyimpanan = jenispenyimpanan;
    }
    void dataBesarPenyimpanan(String besarpenyimpanan){
        this.besarpenyimpanan = besarpenyimpanan;
    }
    void dataHarga(int harga){
        this.harga = harga;
    }
    String getProsesor() {
        return prosesor;
    }
    String getVGA() {
        return vga;
    }
    String getRAM() {
        return ram;
    }
    String getJenisPenyimpanan() {
        return jenispenyimpanan;
    }
    String getBesarPenyimpanan() {
        return besarpenyimpanan;
    }
    int getHarga() {
        return harga;
    }
}
