/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package gtu_projects;

/**
 *
 * @author User
 */
//class testclass{
//    Boolean x=true;
//    String y="abc";
//}
//public class welcome {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        int x=5;
//        System.out.println("Welcome to java");
//        // TODO code application logic here
//        testclass t=new testclass();
//        System.out.println(t.x);
//        System.out.println(t.y);
//        welcome w=new welcome();
//        //w.x;
//        
//    }
//}
class Circle
{
    private static double radius = 1;
/** Find the area of this circle */
    public double getArea()
    {
    return radius * radius * Math.PI;
    }
}

public class welcome{
    public static void main(String[] args) 
    {
    
        Circle myCircle = new Circle();
       // myCircle.radius=10; can not be accessed as radius is private soo..we need to provide getter and setter methods
    System.out.println("Radius is " + myCircle.getArea());
    }
}
