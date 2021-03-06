/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LENOVO IDP 110
 */
public class ListMahasiswa {
   List<Mahasiswa> mahasiswas = new ArrayList<>();
    
    public void tambah(Mahasiswa... mahasiswa){
       mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    
    public void hapus(int index){
        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }
    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(""+mhs.toString());
        }
        );
    }
        
        int linierSearch(String nim){
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }
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
