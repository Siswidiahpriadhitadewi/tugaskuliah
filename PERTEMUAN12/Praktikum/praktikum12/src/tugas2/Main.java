/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author LENOVO IDP 110
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Scanner s = new Scanner(System.in);
     DoubleLinkedList dll = new DoubleLinkedList();
     int pilih;
 do {
         System.out.println("----------------------");
         System.out.println("DATA BUKU PERPUSTAKAAN");
         System.out.println("----------------------");
         System.out.println("1.Entry Judul Buku");
         System.out.println("2.Ambil Buku Teratas");
         System.out.println("3.Cek Judul Buku Teratas");
         System.out.println("4.Info Semua Judul Buku");
         System.out.println("5.Keluar");
         System.out.print("Pilih(1-5): ");
         pilih = sc.nextInt();
         switch (pilih) {
         case 1:
         System.out.println("Masukkan Judul Buku:");
         String jdl = s.nextLine();
         dll.addLast(jdl);
        break;
         case 2:
         System.out.println("Buku tumpukan atas telah terambil!");
         dll.removeFirst();
        break;
         case 3:
         System.out.println("Cek Buku Teratas:");
        System.out.println(dll.getFirst());
        break;
         case 4:
         System.out.println("Cetak Seluruh Judul:");
        dll.print();
        break;
         default:
         } 
 } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
 }
}
