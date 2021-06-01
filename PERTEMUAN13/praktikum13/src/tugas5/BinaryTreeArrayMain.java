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
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
BinaryTreeArray bta = new BinaryTreeArray();
Scanner s = new Scanner(System.in);
System.out.print("Panjang array: ");
int a=s.nextInt();
int[] data = new int[a];
for(int i=0; i<a; i++){
System.out.print("Data ke-"+(i+1)+": ");
data[i]=s.nextInt();
}
int idxLast = a-1;
bta.populateData(data, idxLast);
bta.traverseInOrder(0);
System.out.println("");
bta.traversePreOrder(0);
System.out.println("");
bta.traversePostOrder(0);
}

}
