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
public class kubus {
    Scanner sc = new Scanner(System.in);
    public double s;
    
    public kubus(double s){
        System.out.print("Sisi : ");
        s =  sc.nextDouble();
        this.s = s;
    }
    
    double volume(){
        double v = s * s * s;
        return v;
    }
    
    double luasPermukaan(){
        double l = s * s;
        return l;
    }
}