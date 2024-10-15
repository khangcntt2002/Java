/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class Bai13_TinhLaixuat {
    public static void main(String[] args) {
        System.out.println("Tinh Lai Xuat");
        Scanner nhap = new Scanner(System.in);
        
        System.out.println("nhap tien gui");
        double tiengui = nhap.nextDouble();
        System.out.println("nhap so nam");
        double sonam = nhap.nextDouble();
        System.out.println("nhap lai xuat");
        double laixuat = nhap.nextDouble();
        double tienlai;
        
        for (int i = 1; i <= sonam; i++) {
            tienlai = tiengui * laixuat ;
            tiengui += tienlai ;
            System.out.println("tienlai:" + String.format("%.3f",tienlai));
            
        }
    }
    
}
