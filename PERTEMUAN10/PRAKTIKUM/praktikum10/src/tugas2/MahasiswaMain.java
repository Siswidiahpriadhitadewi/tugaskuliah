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
public class MahasiswaMain {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 System.out.print("Masukkan kapasitas Queue: ");
 int jumlah = sc.nextInt();
 Queue antrian = new Queue(jumlah);
     int pilih;
     do {
     System.out.println("MENU");
     System.out.println("1. Tambah Mahasiswa");
     System.out.println("2. Kurang Mahasiswa");
     System.out.println("3. Cek semua antrian");
     System.out.println("4. Cek antrian terdepan");
     System.out.println("5. Cek antrian paling belakang");
     System.out.println("6. PeekPosition berdasarkan NIM");
     System.out.println("7. Cari data");
     System.out.println("8. Keluar");
     System.out.println("-------------------------------");
     System.out.print("Pilih menu(1-8): ");
     pilih = sc.nextInt();
     switch (pilih) {
     case 1:
     System.out.print("NIM : ");
    String nim = sc.next();
    System.out.print("Nama : ");
    String nama = sc.next();
    System.out.print("Absen: ");
    int absen = sc.nextInt();
    System.out.print("IPK : ");
    double ipk = sc.nextDouble();
    Mahasiswa mhs = new Mahasiswa(nim, nama, absen, 
    ipk);
     sc.nextLine();
    antrian.Enqueue(mhs);
     break;
     case 2: Mahasiswa data = antrian.Dequeue();
    if (!"".equals(data.nim) && !"".equals(data.nama) 
    && data.absen != 0 && data.ipk != 0) {
     System.out.println("Data yang keluar: ");
    System.out.println("NIM : " + data.nim);
    System.out.println("Nama : " + data.nama);
    System.out.println("Absen: " + data.absen);
    System.out.println("IPK : " + data.ipk);
    break;
     }
     case 3:
     antrian.print();
    break;
     case 4:
     antrian.peek();
    break;
     case 5:
     antrian.peekRear();
    break;
     case 6:
     System.out.print("NIM yang dicari: ");
    String pos = sc.next();
    antrian.peekPosition(pos);
    break;
     case 7:
     System.out.print("Posisi yang dicari: ");
    int position = sc.nextInt();
    antrian.printMahasiswa(position);
    break;
     }
     } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4
     || pilih == 5 || pilih == 6 || pilih == 7);
     }
}


