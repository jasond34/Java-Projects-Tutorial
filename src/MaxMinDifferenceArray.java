
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 * Asks user to input size of array and then put in the integers
 * The program outputs the max dif and min difference
 */
public class MaxMinDifferenceArray {
     public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the size of array ");
      int x =s.nextInt();
      int[] array=new int[x];
      int min=Integer.MAX_VALUE, max=0,second=Integer.MAX_VALUE;
      System.out.println("Enter "+x+" integers: ");
    for(int i=0;i<array.length;i++){
          array[i]=s.nextInt();   
          if(array[i]>max){
              max=array[i];
          }
          if(array[i]<min){
              second=min;
              min=array[i];
          }
          else if(array[i]<second){
              second=array[i];
          }
          
      }
    System.out.println("The maximum difference is: "+(max-min)+" the minimum  differenceis: "+(second-min));
    
    
    
    
    
    
}
}
