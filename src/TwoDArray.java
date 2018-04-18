
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 * Asks user for dimensions of 2D array then creates the matrix
 * asks user to put in numbers and prints the matrix out
 */
public class TwoDArray {
       public static void main(String[] args){
           Scanner s=new Scanner(System.in);
    System.out.println("Enter the dimensions of your matrix, enter number of rows: ");       
   int row=s.nextInt();
    System.out.println("Enter the dimensions of your matrix, enter number of columns: ");
    int col=s.nextInt();
    int[][] x= new int[row][col];  
   System.out.println("Enter the intgers: ");
   for(int i=0;i<row;i++){
       for(int j=0;j<col;j++){
           x[i][j]=s.nextInt();
       }
   }
   System.out.println("This is a 2D Array");
    for(int i=0;i<row;i++){
       for(int j=0;j<col;j++){
           System.out.print(x[i][j]+" ");
       }
       System.out.println();
   }   
           
  }  
}
