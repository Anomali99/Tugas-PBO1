/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author fatiq
 */
public class Mahasiswa {
    private String nim;
    private String namaLengkap;
    private int thMasuk;
    private int thLahir;
    
    public int hitungUsia(){
        return (2023 - thLahir);
    }
    
    public int hitungJumlSemester(){
        return (2023 - thMasuk) * 2;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * @return the namaLengkap
     */
    public String getNamaLengkap() {
        return namaLengkap;
    }

    /**
     * @param nama the namaLengkap to set
     */
    public void setNamaLengkap(String nama) {
        this.namaLengkap = nama;
    }

    /**
     * @param thMasuk the thMasuk to set
     */
    public void setThMasuk(int thMasuk) {
        this.thMasuk = thMasuk;
    }

    /**
     * @param thLahir the thLahir to set
     */
    public void setThLahir(int thLahir) {
        this.thLahir = thLahir;
    }
    
    public static void main(String[] args) {
        Mahasiswa udin = new Mahasiswa();
        udin.setNamaLengkap("Udin Sedunia");
        udin.setThLahir(2003);
        udin.setThMasuk(2022);
        udin.setNim("085852202732");
        
        System.out.println("nama saya "+ udin.getNamaLengkap() +"\n NIM "+ udin.getNim() +"\n usia "+ udin.hitungUsia() +"\n semester "+ udin.hitungJumlSemester());
        
        Hewan kuda = new Hewan();
        
        System.out.println(kuda.bergerak());
    }
}
