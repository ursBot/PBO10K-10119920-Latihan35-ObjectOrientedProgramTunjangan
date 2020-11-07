/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan35.objectorientedprogramtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Karyawan {
    public String status;
    public double gaji;
    
    public double statusMenikah(){
        double tunjangan, total;
        
        switch (status) {
            case "menikah":
                tunjangan = gaji * 0.35 ;
                total = gaji + tunjangan;
                System.out.println("========Hasil Perhitungan Gaji Anda=========");
                System.out.println("Gaji Pokok \t\t : Rp "+gaji);
                System.out.println("Tunjangan \t\t : Rp "+tunjangan);
                System.out.println("Total Gaji \t\t : Rp "+total);
                break;
            case "belum":
                tunjangan = 0;
                total = gaji + tunjangan;
                System.out.println("========Hasil Perhitungan Gaji Anda=========");
                System.out.println("Gaji Pokok \t\t : Rp "+gaji);
                System.out.println("Tunjangan \t\t : Rp "+tunjangan);
                System.out.println("Total Gaji \t\t : Rp "+total);
                break;
            default:
                System.out.println("Pilihan Salah!");
                break;
        }
        return 0;
    }
}

public class ProgramTunjangan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Karyawan k = new Karyawan();
        
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        k.gaji = input.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        k.status = input.next();
        k.status = k.status.toLowerCase();
        System.out.println();
        k.statusMenikah();
        System.out.println("(Developed by : Umar Said Adi Pranoto)");
    }
}