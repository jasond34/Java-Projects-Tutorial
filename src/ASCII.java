/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */

import java.util.*;

public class ASCII {
        public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a Letter: ");
    char x = s.next().charAt(0);
    //System.out.println("Enter # of classes total: ");
    //int y =s.nextInt();
    //int percentage=x%y;
    //if(percentage>=(75)){
    //    System.out.println("The percentage of classes attended is: "+percentage);
        
    
    //in order to get ascii from a cahr, you have to typecast the 
    //char into a into shown below
    if((int)x>=65 && (int)x<=90){
        System.out.println("Your character is Upper case");
              }
    else if((int)x>=97 && (int)x<=122){
            System.out.println("Your character is Lower case");
                            }
    else{
        System.out.println("You did not enter a valid letter.");
        }
    
    }
    
}
