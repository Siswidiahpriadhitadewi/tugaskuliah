/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbankan;

/**
 *
 * @author LENOVO IDP 110
 */
import java.util.Scanner;
public class mainTransaksi {
   public static void main(String[] args) {
        transaksi ts = new transaksi();
        transaksi a1 = new transaksi(); 
        transaksi a2 = new transaksi(); 
        transaksi a3 = new transaksi(); 
        transaksi a4 = new transaksi(); 
        transaksi a5 = new transaksi(); 
        transaksi a6 = new transaksi(); 
        transaksi a7 = new transaksi(); 
        transaksi a8 = new transaksi(); 
        transaksi a9 = new transaksi(); 
        transaksi a10 = new transaksi(); 
        transaksi a11 = new transaksi(); 
        transaksi a12 = new transaksi(); 
        transaksi a13= new transaksi(); 
        transaksi a14 = new transaksi(); 
          
         
   }
   public void memilih(){
       int pilih;
        Scanner sc = new Scanner(System.in);
        System.out.println(" ___________");
        System.out.println("|      DAFTAR PEMILIHAN       |");
        System.out.println("|___________|");
        System.out.println("|(1). TAMPIL DATA REKENING    |");
        System.out.println("|(2). TAMPIL DATA TRANSAKSI   |");
        System.out.println("|(3). MENCARI SALDO > 500000  |");
        System.out.println("|(4). SORTING BY NAME         |");
        System.out.println("|(5). EXIT                    |");
        System.out.println("|___________|");
        System.out.println("");
        System.out.println("~Masukkan daftar pemilihan~");
        System.out.print(": ");
        pilih = sc.nextInt();
        
        if (pilih == 1) {
          
        }else if (pilih == 2) {
            
        }else if (pilih == 3) {
           
        }else if (pilih == 4) {
          
        }else if (pilih == 5) {
            System.out.println("");
           System.out.println("--------TERIMAKASIH--------");
           
            System.exit(0);
        }else{
            System.out.println("!!! PILIHAN TIDAK TERSEDIA !!!");
            memilih();
        }
   }
}
