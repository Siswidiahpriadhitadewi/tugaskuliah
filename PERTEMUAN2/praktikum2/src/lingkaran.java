/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO IDP 110
 */
import java.util.Scanner;
public class lingkaran {
    double phi, r;
 
    double hitungLuas(){  
        double luas = phi*r*r;
        return luas;
    }
    double hitungKeliling(){
        double keliling = 2*phi*r;
        return keliling;
    }
    public static void main(String[] args) {
        lingkaran nilai = new lingkaran();
        nilai.phi=3.14;
        nilai.r= 25;
        double keliling = nilai.hitungKeliling();
        System.out.println("Keliling Lingkaran : " + keliling);
        double luas = nilai.hitungLuas();
        System.out.println("Luas Lingkaran : " + luas);
    }
}
