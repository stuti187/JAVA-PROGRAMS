/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_projects;

/**
 *
 * @author User
 */
public class Check_Parenthesis {
   public boolean validParen(String input) {

        if(input.isEmpty()) {
            return true;
        }

        else {
            for (int i = 0; i < input.length() - 1; i++) {
                if ((input.charAt(i) == '(' && input.charAt(i + 1) == ')') ||
                        (input.charAt(i) == '{' && input.charAt(i + 1) == '}') ||
                        (input.charAt(i) == '[' && input.charAt(i + 1) == ']')) {
                    input = input.substring(0, i) + input.substring(i + 2);
                    System.out.println("Input is " + input);
                    //validParen(input);
                      return true;
                }
            }
            return false;
        }
    }
   public static void main(String[] args) {
        Check_Parenthesis sol = new Check_Parenthesis();
//        System.out.println(sol.validParen("")); 
//        System.out.println(sol.validParen("()")); // returns false for some reason 
//        System.out.println(sol.validParen("()[]{}")); // returns false for some reason
//        System.out.println(sol.validParen("(]"));
//        System.out.println(sol.validParen("([)]"));
        System.out.println(sol.validParen("[](){")); // returns false for some reason
    }
}
