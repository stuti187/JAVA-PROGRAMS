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

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NewClass1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		        int T;
        Scanner sc = new Scanner(System.in);
        T = Integer.parseInt(sc.nextLine());
        for(int i=0;i<T;i++){
            String[] AB = sc.nextLine().split(" ");
            int total = 0;
            int A = Integer.parseInt(AB[0]);
            int B = Integer.parseInt(AB[1]);
            total = A+B;
            int lines = 0;
            while (total > 0) {
                int last = total%10;
                total = total/10;
                switch (last) {
                    case 1:
                        lines += 2;
                        break;
                    case 2:
                        lines +=5;
                        break;
                    case 3:
                        lines += 5;
                        break;
                    case 4:
                        lines += 4;
                        break;
                    case 5:
                        lines += 5;
                        break;
                    case 6:
                        lines += 6;
                        break;
                    case 7:
                        lines += 3;
                        break;
                    case 8:
                        lines += 7;
                        break;
                    case 9:
                        lines += 6;
                        break;
                    case 0:
                        lines += 6;
                        break;
                }
            }
            System.out.println(lines);
        }
	}
}
