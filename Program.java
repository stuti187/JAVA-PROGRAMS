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
public class Program {
    
public static void main(String[] args) {
//declaring a source array
char[] copyFrom = { 'h', 'e', 'l', 'l', 'o', 'w', 'o',
'r', 'l', 'd'};
//declaring a destination array
char[] copyTo = new char[copyFrom.length];
//copying array using System.arraycopy() method
System.arraycopy(copyFrom, 5, copyTo, 0, 5);
//printing the destination array
System.out.println(String.valueOf(copyTo));
}

    
}
