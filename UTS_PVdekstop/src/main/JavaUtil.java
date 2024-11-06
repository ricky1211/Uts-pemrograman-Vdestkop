/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Ricky
 */
public class JavaUtil {
    public static void main(String[] args) {
        String nama, alamat;
        int umur, gaji;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan nama: ");
        nama = scanner.nextLine();
        
        System.out.print("Masukan alamat: ");
        alamat = scanner.nextLine();
        
        System.out.print("Masukan gaji: ");
        gaji = scanner.nextInt();
        
        System.out.print("Masukan umur: ");
        umur = scanner.nextInt();
        
        System.out.print("---------BIODATA-----------\n");
        System.out.print("Nama  : " + nama + "\n");
        System.out.print("Umur  : " + umur + "\n");
        System.out.print("Alamat: " + alamat + "\n");
        System.out.print("Gaji  : " + gaji + "\n");
        System.out.print("---------------------------");
        
        
    }
    
}
