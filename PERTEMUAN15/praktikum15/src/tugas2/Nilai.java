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
import java.util.Comparator;
public class Nilai {
    Mahasiswa mahasiswa;
 MataKuliah mk;
 float nilai;
 
 Nilai(Mahasiswa mahasiswa, MataKuliah mk, float nilai){
 this.mahasiswa = mahasiswa;
 this.mk = mk;
 this.nilai = nilai;
 }
 static Comparator<Nilai>ComNilai = (n1, n2) ->{
 if(n1.nilai > n2.nilai){
 return -1;
 } else if (n1.nilai < n2.nilai){
 return 1;
 } else {
 return 0;
 }
 };

}
