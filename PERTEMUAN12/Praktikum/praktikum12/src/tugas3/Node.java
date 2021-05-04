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
public class Node {
     String no, nama;
     Node prev, next;
 public Node(Node prev, String no, String nama, Node next) {
     this.prev = prev;
     this.no = no;
     this.nama = nama;
     this.next = next;
 }
}
