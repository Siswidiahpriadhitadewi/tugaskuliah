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
public class Node {
      String data;
     Node prev, next;
     
 public Node(Node prev, String data, Node next) {
     this.prev = prev;
     this.data = data;
     this.next = next;
 }  
}
