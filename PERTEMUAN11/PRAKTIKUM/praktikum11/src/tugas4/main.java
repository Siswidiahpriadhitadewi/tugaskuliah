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
public class main {
    public static void main(String[] args) {
     Bank bk = new Bank();
     bk.addFirst("Andika", "Tulungagung", "5647");
     bk.print();
     bk.addLast("Samiun", "Ngunut", "8976");
     bk.print();
     bk.insertAfter("Andika", "Ayudini", "Pulosari", "7249");
     bk.print();
     bk.insertAt(3, "Jaelani", "Sumbergempol", "1954");
     bk.print();
     }
}
