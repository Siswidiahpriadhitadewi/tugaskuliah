/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor3;

/**
 *
 * @author LENOVO IDP 110
 */
import java.util.Scanner;
public class main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("MASUKKAN BANYAK MAHASISWA : ");
        int n = sc.nextInt();
        
        nilaiAlgoritma[] mhs = new nilaiAlgoritma[n];
        for(int i=0; i<mhs.length; i++){
            mhs[i] = new nilaiAlgoritma();
            System.out.println("~~~~~~~~~~~~~~~~~~~");
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.println("~~~~~~~~~~~~~~~~~~~");
            System.out.print("Nama        : ");
            sc.nextLine();
            mhs[i].namaMhs = sc.nextLine();
            System.out.print("Nilai TUGAS : ");
            mhs[i].nilaiTugas = sc.nextInt();
            System.out.print("Nilai KUIS  : ");
            mhs[i].nilaiKuis = sc.nextInt();
            System.out.print("Nilai UTS   : ");
            mhs[i].nilaiUTS = sc.nextInt();
            System.out.print("Nilai UAS   : ");
            mhs[i].nilaiUAS = sc.nextInt();
        }
        
        double nilai = 0;
        for(int i=0; i < mhs.length; i++){
            System.out.println(" ");
            System.out.println("~~~~~~~~ DATA MAHASISWA ~~~~~~~~");
            System.out.println("Nilai Mahasiswa ke-" + (i+1));
            System.out.println("Nama  : " + mhs[i].namaMhs);
            System.out.println("~~~~ NILAI ~~~~");
            System.out.println("TUGAS : " + mhs[i].nilaiTugas);
            System.out.println("KUIS  : " + mhs[i].nilaiKuis);
            System.out.println("UTS   : " + mhs[i].nilaiUTS);
            System.out.println("UAS   : " + mhs[i].nilaiUAS);
            double total = mhs[i].hitungTotalNilai();
            System.out.printf("Total Nilai : %.2f \n" , total);
            nilai = mhs[i].nilai(total, mhs.length);
        }
        System.out.printf("Rata rata nilai     =  %.2f \n", nilai );
    }
}
