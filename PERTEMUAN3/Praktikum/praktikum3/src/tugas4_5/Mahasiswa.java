/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4_5;

/**
 *
 * @author LENOVO IDP 110
 */
import java.util.Scanner;
public class Mahasiswa {
    Scanner sc = new Scanner(System.in);
    public String nama;
    public String nim;
    public char jenis_kelamin;
    public double ipk;
    
    public Mahasiswa(String na, String ni, char jk, double my_ipk){
        nama = na;
        nim = ni;
        jenis_kelamin = jk;
        ipk = my_ipk;
    }
}