import java.util.*;
import java.lang.String;
import java.util.Arrays.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *    *check to see if user input string is a Palindrome
*Palindrome is a string that reads the same from front to back
*
 * @author Jason
 */
public class PalindromeCheck {

	public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String x=s.nextLine();
    char[] arr=x.trim().replaceAll(" ","").toLowerCase().toCharArray();
    //put into char array while trimming spaces and converting to lowercase
    boolean tf=true;
        for(int i = 0;i<arr.length/2;i++){
            if(arr[i]!=arr[arr.length-1-i]){  //when i=0, it checks arr.length-1-0
                tf=false;
                break;
            }
           
        }
        if(tf==true){
    	System.out.println(tf+" This is a Palindrome.");   
        }
        else{
            System.out.println(tf+" This is not a Palindrome.");
        }
  }
}

