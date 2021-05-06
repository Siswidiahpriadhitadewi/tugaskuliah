/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author LENOVO IDP 110
 */
public class mahasiswa {
    //mendeklarasikan atribut
    Node ts[]=new Node[4];
        int idx;
    Node head;
    int size;
    
    //membuat konstruktor
    public mahasiswa(){
        head=null;
        size=0;
    }
    
     public boolean isEmpty(){
        return head==null;
    }
     
public void add(String nim, String nama,String jurusan,String prodi, double ipk, int index) { 
        if (isEmpty()) {
            addFirst(nim, nama,jurusan,prodi,ipk);
        } else if (index < 0 || index > size) {
            System.out.println("Nilai index diluar batas");
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, nim, nama,jurusan,prodi, ipk,current);
                current.prev = newNode;
                newNode = head;
            } else {
                Node newNode = new Node(current.prev, nim, nama,jurusan,prodi,ipk, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    //menambah data posisi awal
    public void addFirst(String nim, String nama,String jurusan,String prodi, double ipk) {
        if (isEmpty()) {
            head = new Node(null, nim, nama,jurusan, prodi,ipk, null);
        } else {
            Node newNode = new Node(null, nim, nama,jurusan,prodi, ipk, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    //menambah data posisi akhir
    public void addLast(String nim, String nama,String jurusan,String prodi, double ipk) {
        if (isEmpty()) {
            addFirst(nim, nama,jurusan,prodi, ipk);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, nim, nama,jurusan,prodi, ipk, null);
            current.next = newNode;
            size++;
        }
    }
    
    //method memperbarui jumlah data
    public int size(){
    return size;
}
    //method untuk menghapus semua isi linked list
    public void clear(){
        head=null;
        size=0; 
    }
    
     //method remove sesuai index
     public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
     }
     
    //method untuk menghapus data paling depan
   public void removeFirst() {
     if (isEmpty()) {
     System.out.println("Linked List masih kosong, tidak dapat dihapus");
     } else if (size == 1) {
     removeLast();
     } else {
     System.out.println("Mahasiswa yang dihapus");
     System.out.println("NIM : " + head.nim);
     System.out.println("Nama: " + head.nama);
      System.out.println("JURUSAN  : " + head.jurusan);
    System.err.println("PRODI : " +head.prodi);
    System.out.println("IPK  : " + head.ipk);
     head = head.next;
     head.prev = null;
     size--;
     }
 }
   
    //method untuk menghapus data paling belakang
    public void removeLast() {
     if (isEmpty()) {
     System.out.println("Linked List masih kosong, tidak dapat dihapus");
     } else if (head.next == null) {
     System.out.println("Mahasiswa yang dihapus");
     System.out.println("NIM : " + head.nim);
     System.out.println("Nama: " + head.nama);
      System.out.println("JURUSAN  : " + head.jurusan);
    System.err.println("PRODI : " +head.prodi);
    System.out.println("IPK  : " + head.ipk);
     head = null; size--;
     return;
     }
     Node current = head;
     while (current.next.next != null) {
     current = current.next;
     }
     System.out.println("Mahasiswa yang dihapus");
     System.out.println("IDENTITAS:");
     System.out.println("NIM : " + current.next.nim);
     System.out.println("Nama: " + current.next.nama);
      System.out.println("JURUSAN  : " + current.jurusan);
    System.err.println("PRODI : " +current.prodi);
    System.out.println("IPK  : " + current.ipk);
     current.next = null;
     size--;
 }
     
     //method mencetak semua isi linked list
    public void print() { 
         if (!isEmpty()) {
     Node tmp = head;
     while (tmp != null) {
     System.out.println("NIM : " + tmp.nim);
     System.out.println("Nama: " + tmp.nama);
      System.out.println("JURUSAN  : " + tmp.jurusan);
    System.err.println("PRODI : " +tmp.prodi);
    System.out.println("IPK  : " + tmp.ipk);
     tmp = tmp.next;
     }
     } else {
     System.out.println("Linked List Kosong");
     }
 }
    public void get() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            System.out.println("NIM   : " + head.nim);
            System.out.println("Nama  : " + head.nama);
            System.out.println("JURUSAN  : " + head.jurusan);
                System.err.println("PRODI : " +head.prodi);
                System.out.println("IPK  : " + head.ipk);
        }
    }
    
   public void searc(String key) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.nim.equalsIgnoreCase(key)) {
                System.out.println("NIM  : " + tmp.nim);
                System.out.println("NAMA : " + tmp.nama);
                System.out.println("JURUSAN  : " + tmp.jurusan);
                System.err.println("PRODI : " +tmp.prodi);
                System.out.println("IPK  : " + tmp.ipk);
               
                break;
            }
            tmp = tmp.next;
        }
    }
    
 void selectionSort(boolean asc){
        for(int i=0;i<ts.length-1;i++){
            int idx = i;
            for(int j=i+1;j<ts.length;j++){
                if(asc == false){
                    if(ts[j].ipk > ts[idx].ipk){
                        idx = j;
                    }
                }else{
                    if(ts[j].ipk < ts[idx].ipk){
                        idx = j;
                    }
                }
            }
            Node temp = ts[idx];
            ts[idx] = ts[i];
            ts[i] = temp;
        }
}
   
}
