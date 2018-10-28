/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan52.siapakamu;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menampilkan mahasiswa
 * dan dosen
 */
public class PBO210117070Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen ds = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        ds.setNama("Rizky");
        ds.setUmur(27);
        ds.setMataKuliah("PBO");

        mhs.setNama("Aditya Nur Iskandar");
        mhs.setUmur(19);
        mhs.setKelas("PBO-2");

        ds.mengajarApa();
        System.out.println();
        mhs.kelasApa();
    }
    
}
