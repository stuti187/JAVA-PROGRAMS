/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_program;

/**
 *
 * @author User
 */
import java.util.Random;

public class program_12 {
    public static void main(String[] args)
    {
        Random rnd=new Random();
        int[] a=new int[100];
        for(int i=0;i<100;i++)
        {
            a[i]=rnd.nextInt(50);
        }
        for(int i=0;i<100;i++)
        {
            
            System.out.print(a[i]+"  "); 
            if((i+1)%10==0)
                System.out.println();
        }
        
    }
}
