/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2_3;

/**
 *
 * @author LENOVO IDP 110
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input jumlah tanah : ");
        int n = sc.nextInt();
        tanah[] tanahArray = new tanah[n];
        
        for(int i=0;i<n;i++){
            System.out.println("TANAH ke-" + (i+1));
            System.out.print("Panjang = ");
            tanahArray[i].panjang =  sc.nextInt();
            System.out.print("Lebar   = ");
            tanahArray[i].lebar =  sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            System.out.println("Luas = " + tanahArray[i].luas());
        }
    }
}