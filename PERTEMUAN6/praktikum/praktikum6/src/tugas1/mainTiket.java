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
public class mainTiket {
    public static void main(String[] args) {
        tiketService ts = new tiketService();
        tiket m1 = new tiket("lion air", 500, "jawa timur", "jawa barat");
       tiket m2 = new tiket("garuda", 10000, "mojokerto" , " jawa tengah");
       tiket m3 = new tiket("adam air", 2000, " jakarta", " papua");
       tiket m4 = new tiket("batik air" , 350, " surabaya", "jakarta" );
       
      ts.tambah(m1);
       ts.tambah(m2);
        ts.tambah(m3);
       ts.tambah(m4);
        
         System.out.println("Data tiket sebelum bubble sort dan selection sort : ");
       ts.tampilAll();
        
       System.out.println("-------------------------");
        System.out.println("Data bubble sort");
        ts.bubleSort(true);
        ts.tampilAll();
        
        System.out.println("-------------------------");
           System.out.println("Data selection sort");
        ts.selectionSort(true);
       ts.tampilAll();
       
       System.out.println("-------------------------");
        System.out.println("Data bubble sort");
        ts.bubleSort(false);
        ts.tampilAll();
        
        System.out.println("-------------------------");
           System.out.println("Data selection sort");
        ts.selectionSort(false);
       ts.tampilAll();
    }           
}
