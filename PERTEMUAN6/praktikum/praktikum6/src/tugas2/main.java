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
  
public class main {

    public static void main(String[] args) {
        premierLeangueService list = new premierLeangueService();
        premierLeangue m1 = new premierLeangue("Liverpool", 29, 45, 82);
        premierLeangue m2 = new premierLeangue("Manchester City", 27, 39, 57);
        premierLeangue m3 = new  premierLeangue("Leicester city", 28, 26, 60);
        premierLeangue m4 = new premierLeangue("Chelsea", 29, 9, 48);
        premierLeangue m5 = new  premierLeangue("Wolverhampton Wanderers", 29, 7, 43);
        premierLeangue m6 = new  premierLeangue("Sheffield United", 28, 5, 43);
        premierLeangue m7 = new  premierLeangue("Manchester United", 28, 12, 42);
        premierLeangue m8 = new  premierLeangue("Tottenham Hotspur", 29, 4, 41);
        premierLeangue m9 = new  premierLeangue("Arsenal", 28, 4, 40);
        premierLeangue m10 = new  premierLeangue("Burnley", 29, -6, 39);
        premierLeangue m11 = new  premierLeangue("Crystal Palace", 29, -6, 39);
        premierLeangue m12 = new  premierLeangue("Everton", 29, -6, 37);
        premierLeangue m13 = new  premierLeangue("Newcastle united", 29, -16, 35);
        premierLeangue m14 = new  premierLeangue("Southampton", 29, -17, 34);
        premierLeangue m15 = new  premierLeangue("Brighton & Hove Albion", 29, -8, 29);
        premierLeangue m16 = new  premierLeangue("West Ham United", 29, -15, 27);
        premierLeangue m17 = new  premierLeangue("Watford", 29, -17, 27);
        premierLeangue m18 = new  premierLeangue("AFC Bournemouth", 29, -18, 27);
        premierLeangue m19 = new  premierLeangue("Aston Villa", 27, -18, 25);
        premierLeangue m20 = new  premierLeangue("Norwich City", 29, -27, 21);
                
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        list.tambah(m6);
        list.tambah(m7);
        list.tambah(m8);
        list.tambah(m9);
        list.tambah(m10);
        list.tambah(m11);
        list.tambah(m12);
        list.tambah(m13);
        list.tambah(m14);
        list.tambah(m15);
        list.tambah(m16);
        list.tambah(m17);
        list.tambah(m18);
        list.tambah(m19);
        list.tambah(m20);
        
        System.out.println("Data Premier League sebelum sorting : ");
        list.tampil();
        
        System.out.println("Data Premier League setelah sorting asc berdasarkan points ");
        list.insertionSort(true);
        list.tampil();
        
    }
}
