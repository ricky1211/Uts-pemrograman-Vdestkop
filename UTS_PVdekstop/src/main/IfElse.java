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
public class IfElse {
    public static void main(String[] args) {
        int nilai;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan nilai anda: ");
        nilai = input.nextInt();
        
        if(nilai >= 90 && nilai <= 100) {
            System.out.println("Selamat! Anda lulus.");
        } else if (nilai >= 70 && nilai < 90) {
            System.out.println("Anda mengulang, tapi tetap lulus");
        } else {
            System.out.println("Woi bodoh");
        }
    }
    
}
