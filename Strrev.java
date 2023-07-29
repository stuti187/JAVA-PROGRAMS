/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_projects;

/**
 *
 * @author User
 */
public class Strrev {
    public static void printstr(String s,int idx)
            
    {
        if(idx==0)
        {
            System.out.println(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        printstr(s,idx-1); 
    
    }
    public static void main(String[] args)
    {
        String str="abcd";
        printstr(str,str.length()-1);
    }
    
}
