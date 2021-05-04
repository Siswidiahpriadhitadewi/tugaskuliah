/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author LENOVO IDP 110
 */
public class DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll= new DoubleLinkedList();
        dll.print();
        System.out.println("size : "+dll.size());
        System.out.println("================================================");
        dll.addFirst(3);
        dll.addlast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("size  :"+dll.size());
        System.out.println("================================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size  :"+dll.size());
        System.out.println("================================================");
        dll.clear();
        dll.print();
        System.out.println("Size  :"+dll.size());
    
        dll.addlast(50);
        dll.addlast(40);
        dll.addlast(10);
        dll.addlast(20);
        dll.print();
        
        System.out.println("SIZE = "+dll.size());
        System.out.println("======================================");
        dll.removeFirst();
        dll.print();
        System.out.println("SIZE = "+dll.size());
        System.out.println("======================================");
        dll.removeLast();
        dll.print();
        System.out.println("SIZE = "+dll.size());
        System.out.println("======================================");
        dll.remove(1);
        dll.print();
        System.out.println("SIZE = " + dll.size());
        
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("======================");
        dll.addFirst(3);
        dll.addlast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=======================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("========================");
        System.out.println("Data awal pada Linked List adalah: " +dll.getFirst());
        System.out.println("Data akhir pada Linked List adalah: " +dll.getLast());
        System.out.println("Data indeks ke_1 pada Linked List adalah: " +dll.get(1));
    }
}
