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

public class Greater_than_avg {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
       Scanner scan= new Scanner(System.in);
       Random rnd=new Random();
       System.out.println("Enter the array size"); 
       int n=scan.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=rnd.nextInt(10);
       }
       print(arr,n);
       int avg=0,sum=0;
       for(int i=0;i<n;i++)
       {
           sum=sum + arr[i];
       }
       avg=sum/n;
       System.out.println("avg:"+avg);
       int c=count(arr,n,avg);
       System.out.println(c);
    }
    public static void print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
       {
           
           System.out.println(arr[i]);
       }
    }
    public static int count(int arr[],int n,int avg)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>avg)
            {
                count++;
                
            }
        }
        return count;
    }
}
