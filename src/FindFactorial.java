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

public class FindFactorial {
        public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int x=s.nextInt(),y=1;
    for(int i=x;i>=1;i--){    //you are trying to increment down
                //so you start by setting the counter i to the 
               //user entered value and decrease the count with i--
        y=y*i;       // since i is the counter it decreases so you can
        // mulitply y by it with y starting at 1
    }
    System.out.println("The factoral of you number is: "+y);
  }
}
