/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan37.rataratanilai;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Berisi Program Rata Rata Nilai Mahasiswa.
 */
public class Mahasiswa {
    private double nilai = 0;
    private  int jmlMahasiswa;
    
    public void setNilai(double nilai){
        this.nilai = this.nilai + nilai;
    }
    
    public int getMahasiswa(){
        return jmlMahasiswa = jmlMahasiswa;
    }
    
    public void setJumlahMahasiswa(int jmlMahasiswa){
        this.jmlMahasiswa = jmlMahasiswa;
    }
    
    public double hitungRataRata(){
        return nilai / jmlMahasiswa;
    }
    
}
