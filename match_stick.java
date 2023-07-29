/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_projects;

/**
 *
 * @author User
 */

/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class match_stick
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a,b,sum1,sum2=0,num,value;
		
                
		
                for(int j=0;j<n;j++)
                {
                sum2=0;
                a=scn.nextInt();
		b=scn.nextInt();
                sum1=a+b;
                
                
		while(sum1>0)
                {

		   num=sum1%10; 
		
		switch(num)
		{
                    case 0 -> {
                        value=6;
                        sum2=sum2+value;
                        break;
                        }
                    case 1 -> {
                        value=2;
                        sum2=sum2+value;
                        break;
                        }
		   
                    case 2 -> {
                        value=5;
                        sum2=sum2+value;
                        break;
                        }
		  
                    case 3 -> {
                        value=5;
                        sum2=sum2+value;
                        break;
                        }
		  
                    case 4 -> {
                        value=4;
                        sum2=sum2+value;
                        break;
                    }
		   
                    case 5 -> {
                        value=5;
                        sum2=sum2+value;
                        break;
                        }
		   
                    case 6 -> {
                        value=6;
                        sum2=sum2+value;
                        break;
                        }
		  
                    case 7 -> {
                        value=3;
                        sum2=sum2+value;
                        break;
                        }  
		    
                    case 8 -> {
                        value=7;
                        sum2=sum2+value;
                        break;
                        }
		   
                    case 9 -> {
                        value=6;
                        sum2=sum2+value;
                        break;
                        }   
                      
                }    
		sum1=sum1/10;
                     
		}
                System.out.println(sum2);
	}
        }
}
