/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer1;

/**
 *
 * @author LENOVO IDP 110
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan Kalimat   : ");
        Q=input.nextLine();
        
        int total=Q.length();
        kata st=new kata(total);
        P=st.Membalikkan(Q);
    }
}
