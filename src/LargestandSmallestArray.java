
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author Jason
 * Asks user for integers and finds largest and smallest values in array
*/
public class LargestandSmallestArray {
        public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter 5 integers: ");
      int[] x= new int[5];
      int smallest=Integer.MAX_VALUE, largest=0;
      for(int i=0;i<x.length;i++){
          x[i]=s.nextInt(); 
          
      }
       for(int i=0;i<x.length;i++){
          if(x[i]>largest){
              largest=x[i];
          }
          if(x[i]<smallest){
              smallest=x[i];
          }
      }
    System.out.println("The largest value is: "+largest+" smallest: "+smallest);
 }   
}



	