/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119045.latihan21.rataratanilai;
import java.util.Scanner;
/**
 *
 * @author Legion
 * NAMA                 : Fahma Maulana
 * KELAS                : PBOIF2
 * NIM                  : 10119045
 * Deskripsi Program    : Rata-Rata Nilai
 */
public class PBOIF210119045Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner masuk = new Scanner (System.in);
            int i,n;
            float jum,x,rata;
        System.out.print("Masukkan Banyaknya Mahasiswa");
        n = masuk.nextInt();
        jum=0;
        i=1;
        while(i<=n){
            System.out.print("Nilai Mahasiswa ke-"+i+":");
            x=masuk.nextFloat();
            jum += x;
            i++;
        }
        rata = jum / n;
        System.out.println("Maka,Rata-Rata Nilainya adalah: " + rata);
        System.out.println("-----------------------------");
        System.out.println("Developed bye : Fahma Maulana");
       
        }
    }
    
