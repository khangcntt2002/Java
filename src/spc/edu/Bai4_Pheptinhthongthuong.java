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
public class Bai4_Pheptinhthongthuong {
    
    public static void main(String[] args) {
        System.out.println("Chuong Trinh Tinh Hieu 2 So Thap Phan");
        int a,b;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Nhap so a: ") ;
        a = sc.nextInt();
        
        System.out.print("Nhap so b: ") ;
        b = sc.nextInt();
        
     
        System.out.println(a + " + " + b + " = " + tinhtong(a,b));
        System.out.println(a + " - " + b + " = " + tinhhieu(a,b));
        System.out.println(a + " * " + b + " = " + tinhtich(a,b));
        System.out.println(a + " / " + b + " = " + tinhthuong(a,b));
        
    }
    public static int tinhtong(int a,int b){
        return a+b ;   
    }
    public static int tinhhieu(int a,int b){
        return a-b ;   
    }
    public static int tinhtich(int a,int b){
        return a*b ;   
    }
    public static String tinhthuong(int a,int b){
        if (b==0){
            return (a+"khong the chia hết cho 0");
        }
      
        else return "" + a / b;
    
    
        }
    
    

    
}
     
        
        
        
       
       
       
       
        
   
          
    
    
            

        
    



