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

public class ReverseofInputNumber {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a 4 digit number: ");
    int x = s.nextInt();
    //System.out.println("Are you married? Enter (Y/N): ");
    //char y =s.next().charAt(0);
   // System.out.println("Enter Male or Female(M/F): ");
    //char z =s.next().charAt(0);
    //    System.out.println("The percentage of classes attended is: "+percentage);                     
     int first, second, third, fourth;
     fourth=x/1000;
     x%=1000;
     third=x/100;
     x%=100;
     second=x/10;
     x%=10;
     first=x;
     System.out.println("Your input reversed is: "+first+second+third+fourth);
    
    }
}
