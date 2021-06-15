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
public class MataKuliah {
  String kode;
 String matkul;
 String sks;
 
 public MataKuliah(){
 
 }
 public MataKuliah(String kode, String matkul, String sks){
 this.kode = kode;
 this.matkul = matkul;
 this.sks = sks;
 }
 static Comparator<MataKuliah> ComMkKode = new Comparator<MataKuliah>(){
 public int compare (MataKuliah mk1, MataKuliah mk2){
 return mk1.kode.compareTo(mk2.kode);
 }
 };
  
}
