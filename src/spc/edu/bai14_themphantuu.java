/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.ArrayList;

/**
 *
 * @author SPC
 */
public class bai14_themphantuu {
    public static void main(String[] args) {
        System.out.println("Them so");
        ArrayList cs = new ArrayList();
        for (int i = 0; i <= 10; i++)
        {
            cs.add(i);
            
        }
           cs.add("khang");
           cs.add("long");
            cs.add(1,"chuong");
            cs.remove(12);
            cs.remove(Integer.valueOf(5));
            
        
            
            System.out.println("mang"+ cs);
            System.out.println("so"+ cs.size());
            
            
            
            
         
        
           
            
        
    }
    
}
