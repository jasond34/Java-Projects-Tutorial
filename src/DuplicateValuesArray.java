
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 *This program checks to see if elements of an array are same or not it read from front or back
 * Ex: 2 3 15 15 3 2 return true else false 
 * @author Jason
 */
public class DuplicateValuesArray {
        public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter 6 integers: ");
      int[] x= new int[6];
      for(int i=0;i<x.length;i++){
          x[i]=s.nextInt();           
      }
      int j=x.length-1;      //here, you set var j to the last index of the array x
      boolean read =true;       //all you need to return is a true or false, hence the boolean
     for(int i=0; i<(x.length/2);i++){
         if(x[i]!=x[j]){              //if the the first value of the array doesnt match the last value, return false and get out of loop
             read=false;
             break;
         } 
         else{
             j--;             //you dont need another for loop, you can simply increment j down
         }
     }
         System.out.println(read);
    
}
}
