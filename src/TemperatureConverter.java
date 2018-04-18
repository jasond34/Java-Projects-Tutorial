/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
       Scanner x = new Scanner( System.in );
        System.out.println("Type a number to convert: ");
        double y=x.nextInt();
        double a=5;
        double z=a/9;        // the reason (5/9) or 5/9 does not work is because Java treats 5 and 9 as in
                             //integers first, then divides 5 by 9 as interger, resulting in 0,
                             //then converts the result 0 into a double which would be 0.0
                             //One way around it is to do the above code, another is to treat 5 and 9
                             //as doubles, so it would be z=5.0/9.0
         x.nextLine(); 
         System.out.println(z);
        System.out.println("The number in Celcius is: "+(y-32)*z);
       
    System.out.println("");
    }
}
