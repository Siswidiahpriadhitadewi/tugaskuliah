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
public class main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Stack st = new Stack();
     System.out.print("Jumlah Data: ");
     int jml = sc.nextInt();
     System.out.println("-------------------------");
     for (int i = 0; i < jml; i++) {
     System.out.print("Data ke-" + i + " : ");
     String data = sc.next();
     sc.nextLine();
     st.push(data);
     }
     System.out.println("-------------------------");
     st.print();
     System.out.println("-------------------------");
     System.out.println("Data TOP: " + st.peek());
     }

}
