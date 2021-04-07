/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor2;

/**
 *
 * @author LENOVO IDP 110
 */
public class nilaiAlgoritma {
     String namaMhs;
    int nilaiTugas;
    int nilaiKuis;
    int nilaiUTS;
    int nilaiUAS;
    
    double hitungTotalNilai(){
        double total = 0;
        double Tugas = (nilaiTugas * 0.30);
        double Kuis = (nilaiKuis * 0.20);
        double UTS = (nilaiUTS * 0.20);
        double UAS = (nilaiUAS * 0.30);
        total = Tugas + Kuis + UTS + UAS;
        return total;
    }
}
