/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_projects;



/**
 *
 * @author User
 */
public class Max_product {
    public static void main(String[] args) {
        int nums[]={1,2,3,8,6,7};
        int m=3;
        int n=nums.length;
        product(nums,n,m);
        //System.out.println("Maximum product of an array is:"+prod);
        
        
    }
    public static void product(int[] nums,int n,int m)
    {
        int prod;
        int max=0;
        int sum=0;
        int smax=0;
        for(int i=0;i<n;i++)
        {
            
            for(int j=i+1;j<n;j++)
            {
                prod=nums[i]*nums[j];
                if(prod>max)
                {
                    max=prod;
                }
                sum=nums[i]+nums[j];
                if(sum==m)
                    System.out.println("elements which forms the sum of m are:"+nums[i]+","+nums[j]);
                if(sum>smax){
                smax=sum;
                }
            }
        }
        System.out.println("Maximum product of an array is:"+max);
        System.out.println("Maximum sum of an array is:"+smax);
        
    }
    
}
