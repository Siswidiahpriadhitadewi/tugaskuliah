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
public class NODE {
     String nama;
     String alamat;
     String noRek;
     NODE next;
public NODE(String nm, String al, String nr, NODE berikutnya) { 
     this.nama = nm;
     this.alamat = al;
     this.noRek = nr;
     this.next = berikutnya;
     }
}
