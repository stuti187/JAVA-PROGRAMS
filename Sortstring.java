/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_program;
import java.util.Scanner;

/**
 *
 * @author User
 */
class Person
{
    String name;
    int age;
    long salary;
    Person()
    {
        
    }
//    Person(String n,int a,long s)
//    {
//        name=n;
//        age=a;
//        salary=s;
//        
//    }
    public void setperson()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name");
        name=in.nextLine();
        age=in.nextInt();
        salary=in.nextLong();
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
public class Sortstring {
    public static void main(String[] args)
    {
        
        Person p1=new Person();
        p1.setperson();
        p1.display();
        
        
        
    }
   
}

    

