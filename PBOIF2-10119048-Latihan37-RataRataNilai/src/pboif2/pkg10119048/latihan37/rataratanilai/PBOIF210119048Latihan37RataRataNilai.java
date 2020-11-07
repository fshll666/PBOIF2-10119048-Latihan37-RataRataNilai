/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan37.rataratanilai;
import java.util.Scanner;
/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Menampilkan Program Rata Rata Nilai Mahasiswa.
 */
public class PBOIF210119048Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        
        System.out.print("Masukan Banyak Mahasiswa : ");
        mahasiswa.setJumlahMahasiswa(scanner.nextInt());
        
        for(int i = 1; i <= mahasiswa.getMahasiswa(); i++){
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            mahasiswa.setNilai(scanner.nextDouble());
        }
        
        System.out.println("\nMaka, Rata Rata Nilainya adalah " 
                + mahasiswa.hitungRataRata());
        
        System.out.println("==========================================");
        System.out.println("Developed by : Mochammad Faishal");
        
    }
    
}
