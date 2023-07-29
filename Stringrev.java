/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_program;

/**
 *
 * @author User
 */
import java.io.*;
import java.lang.StringBuilder;
public class Stringrev {
    public static void main(String[] args) {
        PalindromeChecker.isPalindrome("nitin");  
    }
    
}
class PalindromeChecker {  
public static void isPalindrome(String str){  
    StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    String rev=sb.toString();  
    if(str.equals(rev)){  
        System.out.println("palindrom");  
    }else{  
        System.out.println("not a palindrom");  
    }  
}  
} 