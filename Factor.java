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
public class Factor 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
         int div=2;
         Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer Value : ");
        int number = input.nextInt();
        
         while(number > 1)
        {
            if(number%div==0)
                {
                    System.out.print(div+",");
                    number=number/div;
                }
            else
                {
                div++;
        // TODO code application logic here
                }
        }
    }
}
    
    