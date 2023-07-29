/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_projects;

/**
 *
 * @author User
 */
public class Sort_country 
{
    public static void main(String[] args)
    {
    String temp = null;
    String[] country={"India","Austrialia","Berlin","Canada","Pakistan","Srilanka"};
    for(int i=0;i<country.length-2;i++)
    {
        for(int j=0;j<country.length-i-1;j++)
        {
        
        if(country[i].compareTo(country[i+1])>0) 
            {
                temp=country[i];
                country[i]=country[i+1];
                country[i+1]=temp;
            }
        }
    }
    for(String e:country)
    {
        System.out.println(e);
    }
    }
}
