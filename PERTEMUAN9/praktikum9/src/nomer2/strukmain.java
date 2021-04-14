/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer2;

/**
 *
 * @author LENOVO IDP 110
 */
import java.util.Scanner;
public class strukmain {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        struk str=new struk();
        Scanner sc= new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Nomor Transaksi :");
            String ntr=sc.nextLine();
            System.out.println("Tanggal Transaksi :");
            String tpe=sc.nextLine();
            System.out.println("JUmlah Barang  :");
            int jba=sc2.nextInt();
            System.out.println("total bayar :");
            int tba=sc2.nextInt();
            
            struk st=new struk (ntr, tpe, jba, tba);
            str.pysh(st);
        }
        str.print();
        for (int i = 0; i < 5; i++) {
            str.pop();
        }
    }
}
