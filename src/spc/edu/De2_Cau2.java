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
public class De2_Cau2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh hinh cau: ");
        
        double bankinh = scanner.nextDouble();
        
        double chieudai = 4 * Math.PI * Math.pow(bankinh,2);
        
        double thetich = (4.0 / 3.0) *Math.PI * Math.pow(bankinh, 3);
        
        System.out.printf("Dien tich tren be mat hinh cau la: %.2f\n",chieudai);
        System.out.printf("The tich hinh cau la: %.2f\n",thetich);
        scanner.close();
        
        
    }
    
}
