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
public class main {
    public static void main(String[] args) {
        
        tabung[] blArr = new tabung[1];
        kerucut[] kcArr = new kerucut[1];
        kubus[] kbArr = new kubus[1];
        
        for(int i=0;i<1;i++){
            System.out.println("TABUNG");
            blArr[i] = new tabung(0);
            System.out.println("KUBUS");
            kbArr[i] = new kubus(0);
            System.out.println("KERUCUT");
            kcArr[i] = new kerucut(0,0);
        }
        
        for(int i=0;i<1;i++){
            System.out.println("-------------------------");
            System.out.println("TABUNG");
            System.out.println("PHI: " + blArr[i].phi);
            System.out.println("Jari - Jari  : " + blArr[i].r);
            System.out.println("Tinggi  : " + blArr[i].t);
            System.out.println("Volume  : " + blArr[i].volumeTabung());
            System.out.println("Luas Permukaan  : " + blArr[i].luaspermukaan());
            System.out.println("-------------------------");
            
            System.out.println("-------------------------");
            System.out.println("KUBUS");
            System.out.println("Sisi : " + kbArr[i].s);
            System.out.println("Volume  : " + kbArr[i].volume());
            System.out.println("Luas Permukaan  : " + kbArr[i].luasPermukaan());
            System.out.println("-------------------------");
            
            System.out.println("-------------------------");
            System.out.println("KERUCUT");
            System.out.println("Jari Jari : " + kcArr[i].r);
            System.out.println("Tinggi   : " + kcArr[i].t);
            System.out.println("Volume  : " + kcArr[i].volume());
            System.out.println("Luas Permukaan  : " + kcArr[i].luasPermukaan());
            System.out.println("-------------------------");
        }
    }
}