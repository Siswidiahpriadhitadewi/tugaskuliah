/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author LENOVO IDP 110
 */
public class Queue {
     int front;
     int rear;
     int size;
     int max;
     Mahasiswa[] antrian;
     
 public Queue(int n) {
     max = n;
     Create();
 } 
 
 public void Create() {
     antrian = new Mahasiswa[max];
     size = 0;
     front = rear = -1;
 }
 
 
 public boolean IsEmpty() {
     if (size == 0) {
     return true;
     } else {
     return false;
     }
 }
 
 public boolean IsFull() {
     if (size == max) {
     return true;
     } else {
     return false;
     }
 }
 
 public void Enqueue(Mahasiswa data) {
     if (IsFull()) {
     System.out.println("Queue sudah penuh");
     } else {
     if (IsEmpty()) {
     front = rear = 0;
     } else {
     if (rear == max - 1) {
     rear = 0;
     } else {
     rear++;
     }
     }
     antrian[rear] = data;
     size++;
     }
 }
 
 public Mahasiswa Dequeue() {
     Mahasiswa data = new Mahasiswa(" ", " ", 0, 0);
     if (IsEmpty()) {
     System.out.println("Queue masih kosong");
     } else {
     data = antrian[front];
     size--;
     if (IsEmpty()) {
     front = rear = -1;
     } else {
     if (front == max - 1) {
     front = 0;
     } else {
     front++;
     }
     }
 }    
 return data;
 } 
 
 public void print() {
     if (IsEmpty()) {
     System.out.println("Queue masih kosong");
     } else {
     int i = front;
     while (i != rear) {
     System.out.println("NIM : " + antrian[i].nim);
     System.out.println("Nama : " + antrian[i].nama);
     System.out.println("Absen: " + antrian[i].absen);
     System.out.println("IPK : " + antrian[i].ipk);
     System.out.println("------------------");
     i = (i + 1) % max;
     }
     System.out.println("NIM : " + antrian[i].nim);
     System.out.println("Nama : " + antrian[i].nama);
     System.out.println("Absen: " + antrian[i].absen);
     System.out.println("IPK : " + antrian[i].ipk);
     System.out.println("------------------");
     System.out.println("Jumlah elemen = " + size);
     }
 }
 
 public void peek() {
     if (!IsEmpty()) {
     System.out.println("Elemen terdepan adalah");
     System.out.println("NIM : " + antrian[front].nim);
     System.out.println("Nama : " + antrian[front].nama);
     System.out.println("Absen: " + antrian[front].absen);
     System.out.println("IPK : " + antrian[front].ipk);
     System.out.println("------------------");
     } else {
     System.out.println("Queue masih kosong");
     }
 }
 
 
 public void peekRear() {
     if (!IsEmpty()) {
     System.out.println("Elemen terbelakang adalah");
     System.out.println("NIM : " + antrian[rear].nim);
     System.out.println("Nama : " + antrian[rear].nama);
     System.out.println("Absen: " + antrian[rear].absen);
     System.out.println("IPK : " + antrian[rear].ipk);
     System.out.println("------------------");
     } else {
     System.out.println("Queue masih kosong");
     }
 }
 
 
 public void peekPosition(String nim) {
     if (!IsEmpty()) {
     for (int i = front; i < max; i++) {
     if (antrian[i].nim.equalsIgnoreCase(nim)) {
     System.out.println("NIM " + nim + " berada pada index-" + i);
     System.out.println("-------------------------------------");
     break;
     }
     }
     } else {
     System.out.println("Queue masih kosong"); 
     }
 }
 
 
 public void printMahasiswa(int position) {
     if (!IsEmpty()) {
     for (int i = front; i < max; i++) {
     if (i == position) {
     System.out.println("Posisi " + position + " adalah ");
     System.out.println("NIM : " + antrian[i].nim);
    System.out.println("Nama : " + antrian[i].nama);
    System.out.println("Absen: " + antrian[i].absen);
    System.out.println("IPK : " + antrian[i].ipk);
    System.out.println("------------------");
     }
     }
     } else {
     System.out.println("Queue masih kosong");
     }
     }

}
