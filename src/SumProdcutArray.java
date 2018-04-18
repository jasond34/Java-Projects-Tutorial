
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class SumProdcutArray {
       public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter 5 integers: ");
      int[] x= new int[5];
      int sum=0, product=1;
      for(int i=0;i<x.length;i++){
          x[i]=s.nextInt(); 
          sum+=x[i];
          product*=x[i];
      }
       System.out.println("The Sum is: "+sum+" Product: "+product);
  }  
}
