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
public class transaksi {
    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tanggalTransaksi;
    String type;
  
   public void Transaksi(double a, double b, double c, String d, String e){
       this.saldo = a;
        this.saldoAwal = b;
        this.tanggalTransaksi = e;
     
   }
   Rekening ts[]=new Rekening[14];
        int idx;
        
   void tambah(Rekening r){
             if (idx<ts.length) {
            ts[idx] =r;
            idx++;
        } else {
            System.out.println("DATA SUDAH PENUH");
        }
        }
        
        void tampilAll(){
             for (Rekening r : ts) {
           r.tampil();
        }
        }
  
        void selectionSort(){
        for (int i=0;i<ts.length-1;i++){
            int idx =i;
            for(int j=i+1; j<ts.length-1; j++){
                if(ts[j].noRekening == ts [idx].noRekening){
                    idx = j;
                }
                Rekening tmp = ts[idx];
                ts[idx] = ts[i];
                ts[i] = tmp;
            }
        }
   
}
}
 
