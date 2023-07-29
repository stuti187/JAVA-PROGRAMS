/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gtu_program;

/**
 *
 * @author User
 */
public class program_11 {
    public static int[][] create_matrix()
    {
        int [][]matrix=new int[6][6];
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                matrix[i][j]=(int)((Math.random()*2));
            }
        }
        return matrix;
    }
    public static void display(int matrix[][])
    {
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }
        
    }
    
    
    public static void main(String[] args)
    {
        int my_matrix[][];
        int i,j,count;
        my_matrix=create_matrix();
        display(my_matrix);
        for(int m=0;m<6;m++)
        {
            count=0;
            for(int n=0;n<6;n++)
            {
                if(my_matrix[m][n]==1)
                    count++;
            }
            if(count%2!=0)
            {
                System.out.println(m+1+"odd no of once");
            }
        }
        System.out.println("colunm counm");
        for(int m=0;m<6;m++)
        {
            count=0;
            for(int n=0;n<6;n++)
            {
                if(my_matrix[m][n]==1)
                    count++;
            }
            if(count%2!=0)
            {
                System.out.println(m+1+"odd no of once");
            }
        }
        
    }
    
}
