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
public class kata {
      int n;
    int top;
    char stack[];
    
    public kata(int size){
        n= size;
        stack=new char[size];
        top=-1;
    }
    
    public void push(char c){
        top++;
        stack[top]= c;
    }
    
    public boolean input (char c){
        if ((c >= 'A' && c<= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')|| c == ' ') {
            return true;
        } else {
            return false;
        }
    }
    
    public String Membalikkan (String Q){
        String P="";
        char c;
        for (int i = 0; i < n; i++) {
            c=Q.charAt(i);
            if (input(c)) {
                P= P+c;
                push(c);
            }
        }
        System.out.println("Hasil :");
        for (int i = top; i >=0 ; i++) {
            System.out.println(stack[i]);
        }
        System.out.println("");
        return P;
    }
}

