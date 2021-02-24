/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO IDP 110
 */
import java.util.Scanner;
public class tugas3 {
    int hargaSatuan, jumlah, total, diskon, bayar;
    String nama;
    int hitungHargaTotal(){
        return hargaSatuan * jumlah;
    }
    int hitungDiskon(){
        if(hitungHargaTotal()>100000){
            System.out.println("----Selamat anda mendapat diskon sebesar 10%----");
            return hitungHargaTotal() / 10;
        } else if (hitungHargaTotal()>50000) {
            System.out.println("----Selamat anda mendapat diskon sebesar 5%----");
            return hitungHargaTotal() / 20;
        } else {
            System.out.println(" ----Maaf anda belum mendapat diskon----");
            return 0;
        }
    }
    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }
     public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        tugas3 one = new tugas3();
        System.out.println("Masukkan Nama Barang    : " );
        one.nama = input.nextLine();
        System.out.println("Masukkan Harga Barang   : " );
        one.hargaSatuan = input.nextInt();
        System.out.println("Masukkan Jumlah Barang  : " );
        one.jumlah = input.nextInt();
        System.out.println("Harga Total             : " + one.hitungHargaTotal());
        System.out.println("Harga Bayar             : " + one.hitungHargaBayar());
    }    
    
}
