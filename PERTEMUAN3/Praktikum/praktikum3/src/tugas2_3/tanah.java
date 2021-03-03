/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2_3;

/**
 *
 * @author LENOVO IDP 110
 */
public class tanah {
    public int panjang;
    public int lebar;
    
    public tanah(int p, int l){
        panjang = p;
        lebar = l;
    }
    
    double luas(){
        return panjang * lebar;
    }
}