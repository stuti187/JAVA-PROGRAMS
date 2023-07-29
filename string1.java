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
public class string1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
       /* String str = "I am 18 years old";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch)==true)
            {
                System.out.print(ch);
            }
        }
        */
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        /*String[] str=new String[n];
        for(int i=0;i<str.length;i++)
        {
            String s=scan.next();
            str[i]=s;
        }
        for(String e:str)
        {
            System.out.println(e);
            
        } */
        
        System.out.println("enter the String");
        String str=scan.next();
        char[] ch=str.toCharArray();
        for(char e:ch)
        {
            System.out.println(e);
        }
    
    }
}
