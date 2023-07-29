/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_program;

/**
 *
 * @author User
 */
import java.util.Arrays;
public class Duplicates {
    public static void main(String[] args) 
    {
        int arr[]={4,2,3,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    
        
    }
    public static void sort(int arr[])
    {
       int index = 0,i=0;
       
       while(i<arr.length)
           index=arr[i];
       {
           if(arr[i]!=index)
               swap(arr,i,index);
       
           else
           {
                   i++;
           }
       }
    }
    static void swap(int arr[],int first,int second)
    {
        int temp;
        temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        
    }
}
