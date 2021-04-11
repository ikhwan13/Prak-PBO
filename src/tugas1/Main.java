/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args){
        
        int sisi = 0, tinggi = 0, jari = 0;
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.printf("Masukkan nilai sisi kubus : ");
            sisi = input.nextInt();
        }catch(InputMismatchException error){
            System.out.println("Input yang anda masukkan bukan integer, errornya adalah " + error.getMessage());
        }finally{
            Kubus kubus = new Kubus(sisi);
            kubus.tampilkan();
        }
        
        try{
            System.out.printf("Masukkan nilai jari-jari Tabung : ");
            jari = input.nextInt();
        }catch(InputMismatchException error){
            System.out.println("Input yang anda masukkan bukan integer, errornya adalah " + error.getMessage());
        }try{
            System.out.printf("Masukkan nilai tinggi Tabung : ");
            tinggi = input.nextInt();
        }catch(InputMismatchException error){
            System.out.println("Input yang anda masukkan bukan integer, errornya adalah " + error.getMessage());
        }finally{
            Tabung tabung = new Tabung(tinggi,jari);
            tabung.tampilkan();
        }
    }
}
