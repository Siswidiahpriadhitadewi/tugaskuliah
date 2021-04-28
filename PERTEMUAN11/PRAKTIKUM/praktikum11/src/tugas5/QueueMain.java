/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

/**
 *
 * @author LENOVO IDP 110
 */
import java.util.Scanner;
public class QueueMain {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Bank b = new Bank();
     int pilih;
     do {
     System.out.println("MENU");
     System.out.println("1. Enqueue");
     System.out.println("2. Dequeue");
     System.out.println("3. Print");
     System.out.println("4. Peek");
     System.out.println("5. Peek At");
     System.out.println("6. Peek Rear"); System.out.println("7. Peek Position");
     System.out.println("8. Keluar");
     System.out.print("Pilih menu(1-8): ");
     pilih = sc.nextInt();
     switch (pilih) {
     case 1:
     System.out.print("Nama : ");
    String nama = sc.next();
    System.out.print("Alamat : ");
    String alamat = sc.next();
    System.out.print("No Rekening: ");
    String rek = sc.next();
    b.Enqueue(nama, rek, rek);
    break;
     case 2:
     b.Dequeue();
    break;
     case 3:
     b.print();
    break;
     case 4:
     b.peek();
    break;
     case 5:
     System.out.print("Index dicari: ");
     int cari = sc.nextInt();
     b.peekAt(cari);
    break;
     case 6:
     b.peekRear();
    break;
     case 7:
     System.out.print("Nama dicari: ");
    String nm = sc.next();
    b.peekPosition(nm);
    break;
     }
     } 
     while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
     }
}
