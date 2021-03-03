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
import java.util.Scanner;
public class tabung {
  Scanner sc = new Scanner(System.in);
    double phi, r,t;
 
    public tabung(double phi){
        System.out.print("Sisi : ");
        phi =  sc.nextDouble();
        this.phi = phi;
    }
    
    double luaspermukaan(){  
        double luas = 2*phi*(r + t);
        return luas;
    }
    double volumeTabung(){
        double volume = phi*r*t;
        return volume;
    }
}

