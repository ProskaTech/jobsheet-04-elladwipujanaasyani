// Created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Ella Dwipujana Asyani
 */
public class Tugasjob4nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int a = 10;
        int b = 23;
        int c = 5;
        int terbesar;
        
        if(a > b && a > c){
            terbesar = a;
        }
        else if(b > a && b > c){
            terbesar = b;
        }
        else if(c > a && c > b){
            terbesar = c;
        }
        else{
            System.out.println("Error !!");
        }
        System.out.println("Nilai tertingginya adalah angka = " + terbesar);
    }
}
