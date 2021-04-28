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
     
    public void Enqueue(String nm, String al, String nk) {
         NODE ndInput = new NODE(nm, al, nk, null);
         if (isEmpty()) { head = ndInput;
         tail = ndInput;
         } else {
         tail.next = ndInput;
         tail = ndInput;
         }
     }
    
     public void Dequeue() {
         if (isEmpty()) {
         System.out.println("Queue Kosong!");
         } else if (head == tail) {
         head = tail = null;
         } else {
         head = head.next;
         System.out.println("Berahasil");
         }
     }
     
     public void peek() {
         if (!isEmpty()) {
         NODE tmp = head;
         while (tmp != null) {
         if (tmp == head) {
         System.out.println("Data terdepan ");
        System.out.println("Nama : " + 
        tmp.nama);
         System.out.println("Alamat : " + 
        tmp.alamat);
         System.out.println("No Rekening: " + 
        tmp.noRek);
         }
         tmp = tmp.next;
         }
         } else {
         System.out.println("Queue masih kosong");
         }
     }
     
     public void peekRear() {
         if (!isEmpty()) {
         NODE tmp = head;
         while (tmp != null) {
         if (tmp == tail) {
         System.out.println("Data terbelakang ");
        System.out.println("Nama : " + 
        tmp.nama);
         System.out.println("Alamat : " + 
        tmp.alamat);
         System.out.println("No Rekening: " + 
        tmp.noRek);
         }

         }
         } else {
         System.out.println("Queue masih kosong");
         }
     }
     
     public void peekAt(int indeks) {
         if (isEmpty()) {
         System.out.println("Queue masih kosong");
         } else {
         NODE tmp = head;
         for (int i = 0; i < indeks; i++) {
         tmp = tmp.next;
         }
         System.out.println("Data pada indeks-" + indeks);
         System.out.println("Nama : " + tmp.nama);
         System.out.println("Alamat : " + tmp.alamat);
         System.out.println("No Rekening: " + tmp.noRek);
         }
     }
     
     public void peekPosition(String key) {
         NODE tmp = head;
         int indeks = 0;
         while (tmp != null && (!(tmp.nama.equals(key)))) {
         tmp = tmp.next;
         indeks++;
         }
         if (tmp == null) {
         System.out.println("Queue Kosong");
         } else {
         System.out.println("Data " + key + " berada pada indeks ke " + indeks);
         }
     }
}

    
