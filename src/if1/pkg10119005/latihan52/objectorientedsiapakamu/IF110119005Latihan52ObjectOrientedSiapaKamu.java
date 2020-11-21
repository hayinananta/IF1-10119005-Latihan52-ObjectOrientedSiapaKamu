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
public class IF110119005Latihan52ObjectOrientedSiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen;
        Mahasiswa mahasiswa;
        
        dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println();
        mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10119005");
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.setNama("Hayin Ananta");
        mahasiswa.setUmur(19);
        mahasiswa.setKelas("IF1");
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
