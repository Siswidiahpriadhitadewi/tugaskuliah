/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO IDP 110
 */
public class tugas1 {
    public static void main(String[] args) {
        double harga=4500, total=0, diskon=0, subtotal=0;
   int kloter[]={4,15,6,11};
   String pelanggan[]={"maulana", " faiza", " siswi", " dika"};
   
        System.out.println("LAUNDRY");
        System.out.println("TOTAL KESELURUHAN ");
        System.out.println("`````````````````````````");
        
        for (int i = 0; i < 4; i++) {
            if (kloter[i] > 10) {
                diskon=  kloter[i] * (harga * 0.05);
                subtotal= ( kloter[i] * harga )- diskon;
                total += subtotal;
                System.out.println(pelanggan[i] + "1" + kloter[i] + " kg x " + harga + " Rp. " + subtotal);
            } else {
                subtotal = kloter[i] * harga;
                total+= subtotal;
                System.out.println(pelanggan[i] + " 1 " + kloter[i] + "kg x " + harga + " Rp. " + subtotal);
            }
        }
        System.out.println("Total Pendapatan      = Rp. " +total);
    }
   
  
}
