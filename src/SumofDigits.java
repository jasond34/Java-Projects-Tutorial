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

public class SumofDigits {
       public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    //System.out.println("Enter a number: ");
   // int y=s.nextInt();
   String choice =" ";
   System.out.println("Enter a number ");
   int x=s.nextInt(), sum=0;
   while(x>0){
       sum+=(x%10);
       x/=10;
   }
   System.out.println("The sum of the number entered is: "+sum);

}
}
