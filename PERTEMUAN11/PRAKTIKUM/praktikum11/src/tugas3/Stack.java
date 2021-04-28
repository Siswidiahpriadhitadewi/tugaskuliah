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
public class Stack {
     Node tail;
     Node head;
     
     public boolean isEmpty() {
     return head == null;
     }
     
     public void print() {
         if (!isEmpty()) {
         Node tmp = head;
         System.out.println("Isi Linked List: ");
         while (tmp != null) {
         System.out.println(tmp.data);
         tmp = tmp.next;
         }
         } else {
         System.out.println("Linked list kosong");
         }
         } public void push(String x) {
         Node temp = new Node(x, null);
         temp.data = x;
         temp.next = head;
         head = temp;
     }
     
     public String peek() {
         if (head == null) {
         System.out.println("Linked list kosong");
         } else {
         String top = head.data;
         return top;
         }
         return null;
     }

}
