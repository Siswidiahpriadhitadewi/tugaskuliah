/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer2;

/**
 *
 * @author LENOVO IDP 110
 */
public class struk {
  String nomorTransaksi, tanggalPembelian;
  int jumlahBarang, totalBayar;
  int size;
  int top;
  struk struk[];

  
  struk(String nt, String tp, int jb, int tb){
      nomorTransaksi=nt;
      tanggalPembelian=tp;
      jumlahBarang=jb;
      totalBayar=tb;
  }
    public struk() {
        this.size=size;
        struk=new struk[size];
        top =-1;
    }
    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
        
 
    }
     public boolean isFull(){
         if (top == size - 1) {
             return true;
         } else {
             return false;
         }
  }
     public void pysh(struk str){
         if (!isFull()) {
             top++;
             struk[top]=str;
             
         } else {
             System.out.println("Isi Stack Penuh ");
         }
     }
     
     public void pop(){
         if (!isFull()) {
             struk x = struk[top];
             top--;
             System.out.println("Struk yang diambil :    ");
             System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
             System.out.println("nomorTransaksi : "+x.nomorTransaksi);
             System.out.println("tanggal Pembalian :"+x.tanggalPembelian);
             System.out.println("jumlah barang : " +x.jumlahBarang);
             System.out.println("total bayar :"+x.totalBayar);
         } else {
             System.out.println("Stack masih kosong");
         }
     }
  public void print (){
      System.out.println("Isi struk dalam laci :");
      for (int i = top; i >=0; i--) {
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
             System.out.println("nomorTransaksi : "+struk[i].nomorTransaksi);
             System.out.println("tanggal Pembalian :"+struk[i].tanggalPembelian);
             System.out.println("jumlah barang : " +struk[i].jumlahBarang);
             System.out.println("total bayar :"+struk[i].totalBayar);
      }
      System.out.println("");
  }
}
