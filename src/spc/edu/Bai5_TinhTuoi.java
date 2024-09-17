/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.time.Year;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class Bai5_TinhTuoi {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh ten tuoi");
        Scanner sc = new Scanner (System.in);
        double a,tuoi;
        String Ten;
        
        
        System.out.println("HO VA TEN: ");
        Ten = sc.nextLine();
        
        System.out.println("Nhap Nam Sinh:");
        a = sc.nextDouble();
        
        int b =Year.now().getValue();
        tuoi = b-a;
        System.out.println("Tuoi: "+ tuoi);
        
        
    }
}
