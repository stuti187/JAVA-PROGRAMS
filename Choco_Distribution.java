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
public class Choco_Distribution {
    public static void main(String[] args) {
        int[] nums={1,23,152,53,5,51,32,45,84,62,12,45};
        int m=5;
        int n=nums.length;
        System.out.println("minimum diff is:"+Mindiff(nums,n,m));
        
    }
    public static int Mindiff(int[] nums,int n,int m)
    {
        if(n==0||m==0)
            return 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
        if(n<m)
            return -1;
        
        int min_diff=Integer.MAX_VALUE;
        System.out.println(min_diff);
        for(int i=0;i+m-1<n;i++)
        {
            int diff=nums[i+m-1]-nums[i];
            if(diff<min_diff)
                min_diff=diff;
        }
        return min_diff;
        
    }
}
