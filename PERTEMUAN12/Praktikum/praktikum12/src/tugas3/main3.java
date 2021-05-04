/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author LENOVO IDP 110
 */
import java.util.Scanner;
public class main3 {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     DoubleLinkedList dll = new DoubleLinkedList();
     int pilih;
 do {
     System.out.println("----------------------------");
     System.out.println("PENGANTRI VAKSIN EXTRAVAGAZA");
     System.out.println("----------------------------");
     System.out.println("1.Tambah Data Penerima Vaksin");
     System.out.println("2.Hapus Data Pengantri Vaksin");
     System.out.println("3.Daftar Penerima Vaksin");
     System.out.println("4.Keluar");
     System.out.print("Pilih(1-4): ");
     pilih = sc.nextInt();
     switch (pilih) {
     case 1:
     System.out.println("Nomor Antrian:");
    String no = sc.next();
    System.out.println("Nama Penerima:");
    String nama = sc.next();
    dll.addLast(no, nama);
    break;
     case 2:
     dll.removeFirst();
    break;
     case 3:
     System.out.println("Daftar Penerima Vaksin");
     dll.print();
     break;
     default:
     }
     } while (pilih == 1 || pilih == 2 || pilih == 3);
     }

}
