/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor4;

/**
 *
 * @author LENOVO IDP 110
 */
public class pemilihanBem {
    int suara;
     int jmlSuara = 0;
     int jmlKandidat = 4;
     String kandidat;
     static int control = 0;
     static int nilai = 1;
     static int accept = 0;
     static int accept1 = 0;
     static int array[] = new int[10000];

     static int hitung(int bm, int a1, int a2, int a3, int a4) {
        if (nilai == 5) {
            nilai = 1;
        }
        if (nilai == 1 && a1 > 0) {
            array[control] = nilai;
            control++;
            nilai++;
            return hitung(bm, a1 - 1, a2, a3, a4);
        } else if (nilai == 2 && a2 > 0) {
            array[control] = nilai;
            control++;
            nilai++;
            return hitung(bm, a1, a2 - 1, a3, a4);
        } else if (nilai == 3 && a3 > 0) {
            array[control] = nilai;
            control++;
            nilai++;
            return hitung(bm, a1, a2, a3 - 1, a4);
        } else if (nilai == 4 && a4 > 0) {
            array[control] = nilai;
            control++;
            nilai++;
            return hitung(bm, a1, a2, a3, a4 - 1);
        } else if (a1 == 0 && a2 == 0 && a3 == 0 && a4 == 0) {
            if (array[accept] == array[accept + 1] && accept + 1 < bm) {
                return array[accept];
            } else if (accept+2 < bm) {
                accept += 2;
                return hitung(bm, a1, a2, a3, a4);
            } else {
                return 0;
            }
        } else {
            nilai++;
            return hitung(bm, a1, a2, a3, a4);
        }
    }
}
