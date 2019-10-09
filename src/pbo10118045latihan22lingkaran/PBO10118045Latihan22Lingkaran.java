/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan22lingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : Program hitung lingkaran
 */
public class PBO10118045Latihan22Lingkaran {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukka nilai diameter lingkaran : ");
        Scanner Dm = new Scanner(System.in);
        int Diameter;
        while(Dm.hasNextInt()){
            System.out.println("Nilai Diameter tidak Sesuai");
            System.out.println("");
            System.out.print("Masukkan nilai lingkaran : ");
            Dm.next();
        }
        Diameter = Dm.nextInt();
        int r = Diameter/2;
        double luas = 3.14*r*r;
        double keliling = 2 *3.14*r;
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran\t= " +r+ "cm");
        System.out.println("Luas Lingkaran\t= " +luas+ "cm");
        System.out.println("Keliling Lingkaran\t=" +keliling+ "cm");
        
            
        
    }
    
}
