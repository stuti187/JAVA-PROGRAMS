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
public class ATMmachine 
{
    public static void main(String args[])
    {
       Scanner scan=new Scanner(System.in);
       int balance=100000;
       int withdraw,deposit;
       while(true)
       {
           System.out.println("WElCOME TO ATM ");
           System.out.println("1-withdraw");
           System.out.println("2-deposit");
           System.out.println("3-balance");
           System.out.println("4-exit");
           int choice=scan.nextInt();
           switch(choice)
           {
               case 1:
                   withdraw=scan.nextInt();
                   if(withdraw<balance)
                   {
                       balance=balance-withdraw;
                       System.out.println("please collect you money");
                       break;
                   }
                   else
                   {
                       System.out.println("insufficient balance");
                       break;
                   }
               case 2:
                   deposit=scan.nextInt();
                   balance=balance+deposit;
                   System.out.println("balance is updated");
                   break;
               case 3:
                   System.out.println("balance="+balance);
                   break;
               case 4:
                   System.exit(0);
                   
           }    
           
           
       }
               
       
    }
}
