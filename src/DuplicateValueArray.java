
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 * Asks user to input 10 integers and put into array.
 * Then ask user to enter another number and check in array to
 * see if the number exists
 */
class DuplicateValueArray {

    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter 10 integers: ");
      int[] x= new int[10];
      for(int i=0;i<x.length;i++){
          x[i]=s.nextInt();    
      }
            System.out.println("Enter another number: ");
        int y=s.nextInt();
        int count=0;
        for(int i=0;i<x.length;i++){
           if(y==x[i]){
             count+=1;
           }
        }
        if(count>=1){
           System.out.println("You have entered this number already"); 
        }
        else{
            System.out.println("You have not entered this number.");
        }
    }
    

}
