/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

import java.util.Scanner;

/**
 *
 * @author LENOVO IDP 110
 */
public class mahasiswaMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        mahasiswa dll = new mahasiswa();
        int pilih;
        do {
            System.out.println("--------------------------------");
            System.out.println("SISTEM DATA MAHASISWA");
            System.out.println("--------------------------------");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tambah Data Mahasiswa Posisi Akhir");
            System.out.println("3. Tambah Data Mahasiswa Posisi Awal");
            System.out.println("4. Hapus Data Mahasiswa");
            System.out.println("5. Hapus Data Mahasiswa Pertama");
            System.out.println("6. Hapus Data Mahasiswa Terakhir");
            System.out.println("7. Cetak data Mahasiswa");
            System.out.println("8. Data Mahasiswa Urutan Pertama");
            System.out.println("9. Cari Mahasiswa melalui NIM");
            System.out.println("10. Urut Mahasiswa melalui IPK");
            System.out.println("11. Keluar");
            System.out.print("Pilih(1-11): ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1 :
                    System.out.println("Masukkan Data Mahasiswa Awal");
                    System.out.print("Masukkan NIM : ");
                    String nim = sc.next();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.next();
                    System.out.print("Masukkan jurusan :");
                    String jurusan = sc.next();
                    System.out.print("Masukkan Prodi : ");
                    String prodi = sc.next();
                    System.out.print("Masukkan IPK : ");
                    double ipk = sc.nextDouble();
                    System.out.print("Masukkan Index : ");
                    int index = sc.nextInt();
                    dll.add(nim, nama,jurusan,prodi,ipk,index);
                    break;
                case 2:
                    System.out.println("Masukkan Data Mahasiswa Akhir");
                    System.out.print("Masukkan NIM : ");
                    String nimB = sc.next();
                    System.out.print("Masukkan Nama: ");
                    String namaB = sc.next(); 
                    System.out.print("Masukkan jurusan :");
                    String jurusanB = sc.next();
                    System.out.print("Masukkan Prodi : ");
                    String prodiB = sc.next();
                    System.out.print("Masukkan IPK : ");
                    double ipkB = sc.nextDouble();
                    dll.addLast(nimB, namaB,jurusanB,prodiB,ipkB);
                    break;
                case 3:
                    System.out.println("Masukkan Data Mahasiswa Awal");
                    System.out.print("Masukkan NIM : ");
                    String nimA = sc.next();
                    System.out.print("Masukkan Nama: ");
                    String namaA = sc.next();
                    System.out.print("Masukkan jurusan :");
                    String jurusanA = sc.next();
                    System.out.print("Masukkan Prodi : ");
                    String prodiA = sc.next();
                    System.out.print("Masukkan IPK : ");
                    double ipkA = sc.nextDouble();
                    dll.addFirst(nimA, namaA,jurusanA,prodiA,ipkA);
                    break;
                case 4:
                   System.out.print("Masukkan Data yang dihapus: ");
                    int hapus = sc.nextInt();
                    dll.remove(hapus);
                    break;
                case 5:
                    dll.removeFirst();
                    break;
                case 6:
                    dll.removeLast();
                case 7:
                    dll.print();
                    break;
                case 8:
                    dll.get();
                    break;
                case 9:
                    System.out.print("Masukkan NIM:");
                    String key = sc.nextLine();
                    dll.searc(key);
                    break;
                case 10:
                    dll.selectionSort(true);
                    dll.print();
                    break;
                default:
            }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9);
    }
}
