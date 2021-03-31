/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer4;

/**
 *
 * @author LENOVO IDP 110
 */
public class main {
     public static void main(String[] args) {
        nilaicari oi = new nilaicari();
        array1 n1 = new array1(12);
        array1 n2 = new array1(17);
        array1 n3 = new array1(2);
       array1 n4 = new array1(1);
        array1 n5 = new array1(70);
        array1 n6 = new array1(50);
        array1 n7 = new array1(90);
        array1 n8 = new array1(17);
        array1 n9 = new array1(2);
        array1 n10 = new array1(90);
        
        oi.tambah(n1);
        oi.tambah(n2);
        oi.tambah(n3);
        oi.tambah(n4);
        oi.tambah(n5);
        oi.tambah(n6);
        oi.tambah(n7);
        oi.tambah(n8);
        oi.tambah(n9);
        oi.tambah(n10);
        
        oi.selectionSort();
        oi.tampilAll();
        oi.FindBinarySearch(oi.SearchBiggest(), 0, oi.list.length-1);
        
        
    }
}
