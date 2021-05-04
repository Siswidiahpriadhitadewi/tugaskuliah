/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

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
    }
}
