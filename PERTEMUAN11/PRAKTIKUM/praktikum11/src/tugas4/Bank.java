/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author LENOVO IDP 110
 */
public class Bank {
        NODE tail;
     NODE head;
     public boolean isEmpty() {
     return head == null;
     }
     
     public void print() {
         if (!isEmpty()) {
         NODE tmp = head;
         System.out.println("-----------------");
         System.out.println("Isi Linked List: ");
         System.out.println("-----------------");
         while (tmp != null) {
         System.out.println("Nama : " + tmp.nama);
         System.out.println("Alamat : " + tmp.alamat);
         System.out.println("No Rekening: " + tmp.noRek);
         System.out.println(" ");
         tmp = tmp.next;
         }
         } else {
         System.out.println("Linked list kosong");
         }
     }
     
     public void addFirst(String nm, String al, String rk) {
         NODE ndInput = new NODE(nm, al, rk, null);
         if (isEmpty()) {
         head = ndInput;
         tail = ndInput;
         } else {
         ndInput.next = head;
         head = ndInput;
         }
     }
     public void addLast(String nm, String al, String rk) {
         NODE ndInput = new NODE(nm, al, rk, null);
         if (isEmpty()) {
         head = ndInput;
         tail = ndInput;
         } else {
         tail.next = ndInput;
         tail = ndInput; 
         }
     }
     public void insertAfter(String key, String nm, String al, 
        String rk) {
         NODE ndInput = new NODE(nm, al, rk, null);
         NODE temp = head;
         do {
         if (temp.nama.equals(key)) {
         ndInput.next = temp.next;
         temp.next = ndInput;
         if (ndInput.next == null) {
         tail = ndInput;
         }
         break;
         }
         temp = temp.next;
         } while (temp != null);
         }
     
    public void insertAt(int index, String nm, String al, String 
        rk) {
         if (index < 0) {
         System.out.println("Indeks salah");
         } else if (index == 0) {
         addFirst(nm, al, rk);
         } else {
         NODE temp = head;
         for (int i = 0; i < index - 1; i++) {
         temp = temp.next;
         }
         temp.next = new NODE(nm, al, rk, temp.next);
         if (temp.next.next == null) {
         tail = temp.next;
         }
         }
     }
}
