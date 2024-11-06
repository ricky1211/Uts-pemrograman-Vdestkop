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
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukan hari berdasarkan angka (1 - 7): ");
        angka = input.nextInt();
        
        switch (angka) {
            case 1:
                System.out.println("Hari senin...");
                break;
            case 2:
                System.out.println("Hari selasa...");
                break;
            case 3:
                System.out.println("Hari rabu...");
            default:
                throw new AssertionError();
        }
    }
    
}
