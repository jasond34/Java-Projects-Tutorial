
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
import java.util.*;

public class LeapYear {
        public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a year: ");
    int x = s.nextInt();
    //System.out.println("Enter # of classes total: ");
    //int y =s.nextInt();
    //int percentage=x%y;
    //if(percentage>=(75)){
    //    System.out.println("The percentage of classes attended is: "+percentage);                     
    if(x%4==0 && x%400 != 0){
        System.out.println("It is a leap year.");
              }
    else if(x%400==0){
            System.out.println("It is not a leap year");
                            }
    else{
        System.out.println("It is not a leap year");
        }
    
    }
}
