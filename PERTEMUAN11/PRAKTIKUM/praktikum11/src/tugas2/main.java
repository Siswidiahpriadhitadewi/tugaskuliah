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

public class main {
        public static void main(String[] args) {
     tambah tambah = new tambah();
     tambah.addFirst("a");
     tambah.print();
     tambah.addLast("c");
     tambah.print();
     tambah.insertAfter("c", "d");
     tambah.print();
     tambah.addLast("e");
     tambah.insertAt(1, "b");
     tambah.print();
     }
}
