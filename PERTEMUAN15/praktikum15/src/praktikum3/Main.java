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
public class Main {
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
    Mahasiswa m = new Mahasiswa("201234", "noureen", "021xx1");
    Mahasiswa m1 = new Mahasiswa("201235", "akhleema", "021xx2");
    Mahasiswa m2 = new Mahasiswa("201236", "shannum", "021xx3");
    lm.tambah(m, m1,m2);
    lm.tampil();
    lm.update(lm.linierSearch("201235"), new Mahasiswa("201235", "akhleema lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
    
}
