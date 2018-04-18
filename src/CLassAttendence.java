
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

public class CLassAttendence {
        public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter # of classes attended: ");
    int x =s.nextInt();
    System.out.println("Enter # of classes total: ");
    int y =s.nextInt();
    int percentage=x%y;
    if(percentage>=(75)){
        System.out.println("The percentage of classes attended is: "+percentage+" You can attend class.");
                         }
    else{ 
           System.out.println("So you have a medical condition? Enter Y/N: ");
             char yn = s.next().charAt(0);
             if(yn=='Y'|| yn=='y'){
                 System.out.println("You are excused, you can attend class");
                      }
             else if(yn=='N' || yn =='n'){
             System.out.println("The perct is :"+percentage+" You cannot attend");
                                     }
             else{
                 System.out.println("You did not enter Y or N");
                 }
        }
 }
}
