/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_projects;
import java.util.Arrays;

/**
 *
 * @author User
 */

public class ArrProductExceptSelf {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int n=nums.length;
        System.out.println(n);
        int[] prod=product(nums,n);
        System.out.println("product of an array is:"+Arrays.toString(prod));
        
        
    }
    public static int[] product(int[] nums,int n)
    {
        
        int product;
        int[] prod=new int[n];
        
        for(int i=0;i<n;i++)
        {
            product=1;
            for(int j=0;j<n;j++)
            {
               if(i==j)
                   continue;
               product=product * nums[j];
            }
            prod[i]=product;
        }
        return prod;
    }
}
