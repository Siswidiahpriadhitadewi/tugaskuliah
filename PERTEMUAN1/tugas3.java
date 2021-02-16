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
public class tugas3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    int deret = 0, count = 0;
    System.out.print("Masukkan Deret ke N : ");
    int n = input.nextInt();
    for (int i=0;i<=n;i++) {
	count += 2;
	if (count % 2 == 0) {
	if (count % 4 == 0) {
	continue;}
	System.out.print(count + ",");}}
	}
}
