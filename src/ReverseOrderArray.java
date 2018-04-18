/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 * enter 10 integers and put into new array
 * then print new array in reverse order
 */
import java.util.*;

public class ReverseOrderArray {
    public static void main(String[] args){
    int[] x=new int[5];
    int[] x2=new int[5];
    Scanner s = new Scanner(System.in);
    System.out.println("Enter 5 integers: ");
    for(int i=0;i<x.length;i++){
        x[i]=s.nextInt();
       }  
    int j=0;
     for(int i=x2.length-1;i>=0;i--){
              x2[i]=x[j];
              j++;
       }
     System.out.println("The values in reverse order is: ");
    for(int i = 0; i< x2.length; i++){
      System.out.print(" "+x2[i]);
    }
  }
}  

