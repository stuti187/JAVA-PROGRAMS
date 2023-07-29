/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_projects;

/**
 *
 * @author User
 */
import java.util.Scanner;
import java.util.Random;

public class Arrays 
{
    public static void main(String[] args)
    {
    Scanner scan=new Scanner(System.in);
    Random rnd=new Random();
    int m=scan.nextInt();
    int n=scan.nextInt();
    int o=scan.nextInt();
    int a[][][]=new int[m][n][o];
    int i=0,j=0,k=0;
   
    
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            for(k=0;k<o;k++)
            {
            a[i][j][k]=(int)(Math.random()*10);
        
            }
        }
    }
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            for(k=0;k<o;k++)
            {
            System.out.print(" "+a[i][j][k]);
        
            }
            System.out.println();
        }
        System.out.println();
    }
    
    }

    static void sort(int[] nums) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void toString(int[] prod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
