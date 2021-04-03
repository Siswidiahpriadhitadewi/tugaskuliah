/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbankan;

/**
 *
 * @author LENOVO IDP 110
 */
public class Rekening {
    String noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;
    
    public void Rekening (String a, String b, String c, String d, String e){
        noRekening= a;
        nama=b;
        namaIbu=c;
        phone=d;
        email=e;
    }
    void tampil(){
    System.out.println("noRekening : "+noRekening);
        System.out.println("nama   : " +nama);
        System.out.println("namaIbu : " +namaIbu);
        System.out.println("phone : "+phone);
        System.out.println("email  : "+email);
  }
    
}
