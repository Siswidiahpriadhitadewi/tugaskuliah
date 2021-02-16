/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO IDP 110
 */
public class tugas2 {
    public static void main(String[] args) {
    double saldo = 1000000;
    int x = 0, i = 0;
    do{
    x++;
   System.out.println("BULAN KE-" + (i+1) + " SALDO ANDA Rp " + Math.ceil(saldo));
    saldo = saldo + (saldo*0.02);
    i++;
    }while(saldo<=1500000);
    System.out.println("PADA BULAN KE - " + x);}
  }
