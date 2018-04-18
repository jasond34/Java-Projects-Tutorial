/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
//this program finds all 3 digit Armstrong numbers
//Armstrong numbers are an integer such that the sum of the cubes of its digits is equal to the number itself. 
//ex: 153     (1^3)+(5^3)+(3^3)=153 
import java.util.*;

public class FindingArmstrongNumbers {
        public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    //System.out.println("Enter a number: ");
   // int y=s.nextInt();
    for(int i=101; i<1000;i++)
    {
       int number=i;
       while(number>100){
           int first=number/100;
           number%=100;
           int second=number/10;
           number%=10;
           int third=number;
           if(i==(first*first*first)+(second*second*second)+(third*third*third)){
              System.out.println(i);
           }
            }
     }
  }
}
