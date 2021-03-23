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
public class premierLeangueService {
        premierLeangue Lg[]=new premierLeangue[20];
        int idx;
    
    void tambah(premierLeangue m){
        if (idx<Lg.length) {
            Lg[idx] =m;
            idx++;
        } else {
            System.out.println("DATA SUDAH PENUH");
        }
    }
    void tampil(){
        for (premierLeangue m : Lg) {
            m.tampil();
        }
    }
      public void insertionSort(boolean asc){
        for(int i = 1;i<Lg.length; i++){
            premierLeangue temp = Lg[i];
            int j = i;
            while(j > 0 && Lg[j - 1].points > temp.points){
                Lg[j] = Lg[j-1];
                j--;
            }
            Lg[j] = temp;
        }
        for(int i = 1;i<Lg.length;i++){
            premierLeangue temp = Lg[i];
            int j = i;
            if(asc){
                
            }else{
                
            }
            Lg[j] = temp;
        }
    
    }
    }


