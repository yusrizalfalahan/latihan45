/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan45_cetaknama;

import java.util.Scanner;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN CETAK NAMA
 * @author Acer
 */
public class PBO0210117043_latihan45_Cetaknama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Printer printer = new Printer();

        System.out.println("=====Aplikasi Pencetak Nama=====");

        Scanner scn1 = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda: ");
        printer.setNama(scn1.nextLine());
        
        System.out.print("Mau Cetak Nama Berapa Kali? ");
        printer.setJmlCetak(scn1.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());

    }

}
