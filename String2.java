/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_program;

/**
 *
 * @author User
 */
import java.lang.StringBuilder;

public class String2 {
    public static void main(String[] args) {
        String st="stuti";
        System.out.println(st.toString());
        StringBuilder str=new StringBuilder("nitin");
        str.reverse();
        String rev = str.toString();
        if(str.equals(rev))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
    
}
