/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer1_2;

/**
 *
 * @author LENOVO IDP 110
 */
public class PencarianMhs {
     Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    
    void tambah(Mahasiswa m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("~~~DATA SUDAH PENUH~~~");
        }
    }
    
    void tampil(){
        for (Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("~~~~~~~~~~");
        }
    }
    
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public void TampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("Data NIM = " + x + " berada pada indexs " + pos);
        }else{
            System.out.println("Data NIM = " +x+ " tidak ditemukan");
        }
    }
    
    public void TampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("~~~~~~~");
            System.out.println("NIM \t  = " + x);
            System.out.println("NAMA \t  = " +listMhs[pos].nama);
            System.out.println("UMUR \t  = " +listMhs[pos].umur);
            System.out.println("IPK \t  = " +listMhs[pos].ipk);
            System.out.println("~~~~~~~");
        }else{
            System.out.println("Data " + x+ " tidak ditemukan"); 
        }
    }
}
