/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package gtu_projects;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Vowel_Consonant {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        System.out.println(ch);
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
            System.out.println("vowel");
        else
            System.out.println("consonant");

    }
}
