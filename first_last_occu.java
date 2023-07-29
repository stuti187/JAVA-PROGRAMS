/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_projects;

/**
 *
 * @author User
 */
public class first_last_occu {
    public static int first=-1;
    public static int last=-1;
    public static void printpositions(String str,int ind,char ele)
    {
        if(ind==str.length()-1)
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(ind)==ele)
        {
            if(first==-1)
            {
                first=ind;
            }else{
                last=ind;
            }
                        
        }
        printpositions(str,ind+1,ele);
    }
    public static void main(String[] args)
    {
       String str="stuti";
       printpositions(str,0,'t');
       
    }
    
}
