/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1PrakOOP;

/**
 *
 * @author CANDRA NURCAHYO
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Class1 p = new Class1();
       // p.dataProsesor("Intel i9");
       // p.dataVGA("RTX 4050");
       // p.dataRAM("16 GB");
       // p.dataJenisPenyimpanan("SSD");
       // p.dataBesarPenyimpanan("512 GB");
       // p.dataHarga(60000000);
        
        
        System.out.println("Prosesor          : " + p.getProsesor());//mengambil data prosesor
        System.out.println("VGA               : " + p.getVGA());//mengambil data vga
        System.out.println("RAM               : " + p.getRAM());//mengambil data ram
        System.out.println("Jenis Penyimpanan : " + p.getJenisPenyimpanan());//mengambil data jenis penyimpanan
        System.out.println("Besar Penyimpanan : " + p.getBesarPenyimpanan());//mengambil data besar penyimpanan
        System.out.println("Harga             : " + p.getHarga());//mengambil data harga
    }    
}

