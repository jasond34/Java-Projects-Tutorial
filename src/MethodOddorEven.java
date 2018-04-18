/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 * Find whether number is odd or even with own method
 */
import java.util.*;

public class MethodOddorEven {
  //public is the modifier
    //static means you can access this method without making any object of the class
    //void means that the method will not return anything
    public static void main(String[] args){
    oddoreven();
    }
    
    public static void oddoreven(){
        //not public static int oddoreven, that would expect a int in return
        //
         Scanner s = new Scanner(System.in); 
         System.out.println("Enter a number: ");
         int x= s.nextInt();
       if(x%2==0){
           System.out.println("Number is even.");
       }
       else{
           System.out.println("Number is odd.");
           }
       }
    
    
}
