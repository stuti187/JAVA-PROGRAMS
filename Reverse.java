/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package gtu_projects;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Reverse 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 4 digit number:");
        //int num=scan.nextInt();
        int num=scan.nextInt();
        int rev=reverse(num);
        System.out.println(rev);
       
    }
    public static int reverse(int num)
    {
        int rev=0,rem;
        while(num>=1)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        
       /* while(number != 0)   
        {  
            int rem = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
        }*/  
        
        return rev;
    }
}
