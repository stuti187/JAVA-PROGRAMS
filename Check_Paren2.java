/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_projects;

import java.util.Stack;

/**
 *
 * @author User
 */
public class Check_Paren2 {
    public boolean validParen(String input) {

        if (input.isEmpty()) 
        {
            return true;
        } 
        else
        {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++)
            {
                char current = input.charAt(i);
                if (current == '(' || current == '[' || current == '{')
                {
                    stack.push(current);
                } 
                else 
                {
                    if(stack.isEmpty()) 
                    {
                          return false;
                    }
                    char peekChar = stack.peek();
                    //System.out.println(stack.peek());
                    if ((current == ')' && peekChar != '(')  || (current == '}' && peekChar != '{')
                            || (current == ']' && peekChar != '[')) 
                    {
                        return false;  // for a valid input, a close brackets must have an open brackets
                    } 
                    else 
                    {
                        stack.pop();
                    }
                }
            }
            return true; 
        }
    }


    public static void main(String[] args) {
        Check_Paren2 sol = new Check_Paren2();
        System.out.println(sol.validParen(""));//t
        System.out.println(sol.validParen("()"));//t
        System.out.println(sol.validParen("()[]{}"));//t
        System.out.println(sol.validParen("(]"));//f
        System.out.println(sol.validParen("([])]"));//f
        System.out.println(sol.validParen("{[]}}"));//f
    }

}


    
