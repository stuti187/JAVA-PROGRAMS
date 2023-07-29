/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_program;

/**
 *
 * @author User
 */
//ax+by=e x=ed-bf/ad-bc
//cx+dy=f y=af-ec/ad-bc
import java.util.Scanner;
public class Program_2 
{
    public static void main(String[] args)
    {
        double a,b,c,d,e,f;
        Scanner scan=new Scanner(System.in);
        a=scan.nextDouble();
        b=scan.nextDouble();
        e=scan.nextDouble();
        c=scan.nextDouble();
        d=scan.nextDouble();
        f=scan.nextDouble();
        
        System.out.println((e*d)-(b*f)/(a*d)-(b*c));
        System.out.println((a*f)-(e*c)/(a*d)-(b*c));
    }
    
}
