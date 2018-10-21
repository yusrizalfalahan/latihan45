/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan45_cetaknama;



/**
 *
 * @author Acer
 */
public class Printer {

    private int JmlCetak;
    private String Nama;

    public int getJmlCetak() {
        return JmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.JmlCetak = jmlCetak;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void cetak (String nama) {
        System.out.println("Nama Anda: " + nama);

    }

    public void cetak(int jmlCetak, String nama) {
        System.out.println("Hasil Cetak: ");
        for (int i = 1; i <= jmlCetak; i++){
            System.out.println(i +" "+nama);
        }
        
    }
    
    }
