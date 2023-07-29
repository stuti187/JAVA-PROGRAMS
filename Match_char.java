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
import java.util.Random;
public class Match_char
{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
       Scanner scan=new Scanner(System.in);
       Random rnd=new Random();
       char w=(char)('a' + rnd.nextInt(27));
       //System.out.println(w);
       System.out.println("enter character:");
       char ch=scan.next().charAt(0);
       while(w!=ch)
       {
            System.out.println("try again");   
            System.out.println("enter character:");
            char cha=scan.next().charAt(0);
            ch=cha;
       }
       System.out.println("yeah...you got the right character");
    }
}
