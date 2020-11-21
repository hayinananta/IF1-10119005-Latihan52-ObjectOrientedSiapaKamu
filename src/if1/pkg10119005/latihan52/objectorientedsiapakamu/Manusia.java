/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan52.objectorientedsiapakamu;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan golongan mahasiswa atau dosen 
 *                     dengan berbasis Objek 
 */
public class Manusia {
    protected String nama;
    protected int umur;
    
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getUmur() {
        return this.umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void siapaKamu() {
        System.out.println("Saya manusia");
    }
}