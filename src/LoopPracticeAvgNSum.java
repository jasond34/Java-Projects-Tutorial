/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
//function: hhave user enter numbers repeatedly until they hit q to escape
//when q is hit, return product and sum of numbers entered

import java.util.*;

public class LoopPracticeAvgNSum {
        public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    //System.out.println("Enter a number: ");
   // int y=s.nextInt();
   String choice =" ";
   int product=1, count=0,sum=0;    //count is to count the number of times user enters number
                                    //sum is addition of all the entries entered
   while(!choice.equals("q")){          //this is how you set up if something is not equals for strings
      System.out.println("Enter a number or q to quit: ");
              choice = s.next();
              
      if(!choice.equals("q")){ 
          int number = Integer.parseInt(choice);  //here, you initiliaze a number called number
                                                 //then set it equal to choice if number is entered
                                                 //Integer.parseInt function parses ints from strings
          sum+=number;                           //add up all the entries entered
          product*=number;
          count++;
                             }
    //int x = s.nextInt();
    // sum+=x;
                              }
System.out.println("Product is: "+product+"\nAverage is: "+((float)sum/count));
}
}
