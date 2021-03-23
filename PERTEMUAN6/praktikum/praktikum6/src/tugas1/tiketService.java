/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author LENOVO IDP 110
 */
public class tiketService {
     tiket ts[]=new tiket[4];
        int idx;
        
        
        void tambah(tiket t){
             if (idx<ts.length) {
            ts[idx] =t;
            idx++;
        } else {
            System.out.println("DATA SUDAH PENUH");
        }
        }
        
        void tampilAll(){
             for (tiket t : ts) {
           t.tampil();
        }
        }
        
        void bubleSort(boolean bool){
        for(int i=0;i<ts.length;i++){
            for(int j=1;j<ts.length-i;j++){
                if(bool == false){
                    if(ts[j].harga > ts[j-1].harga){
                        tiket temp = ts[j];
                        ts[j] = ts[j-1];
                        ts[j-1] = temp;
                    }
                }else{
                    if(ts[j].harga < ts[j-1].harga){
                        tiket temp = ts[j];
                        ts[j] = ts[j-1];
                        ts[j-1] = temp;
                    }
                }
            }
        }
    }
    
    void selectionSort(boolean asc){
        for(int i=0;i<ts.length-1;i++){
            int idx = i;
            for(int j=i+1;j<ts.length;j++){
                if(asc == false){
                    if(ts[j].harga > ts[idx].harga){
                        idx = j;
                    }
                }else{
                    if(ts[j].harga < ts[idx].harga){
                        idx = j;
                    }
                }
            }
            tiket temp = ts[idx];
            ts[idx] = ts[i];
            ts[i] = temp;
        }
}

}
