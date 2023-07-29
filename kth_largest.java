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
public class kth_largest {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        int k=2;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
//        for(int i=0;i<nums.length;i++)
//        {
//            System.out.println(nums[i]); 
//        }
        System.out.println(nums[nums.length-k]);
    
    }
}