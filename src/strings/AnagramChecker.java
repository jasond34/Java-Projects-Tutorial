import java.util.*;
import java.lang.String;
import java.util.Arrays.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
/
/**
 *Write a program to check if the two strings entered by user are anagrams or not. Two words are said 
to be anagrams if the letters of one word can be rearranged to form the other word. For example, 
jaxa and ajax are anagrams of each other. 
Additional checks in there to check for " "
*
The logic is to  trim the strings, then convert to a single case, get rid of spaces
the put into char array and then sort and then compare
 * @author Jason
 */
public class AnagramChecker {
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String s1=s.nextLine();
       System.out.print("Enter a string: ");
       String s2=s.nextLine();
       /*       This does not work as you are not doing anything with the return value look below for proper example
       s1.trim();                                 //trims whitespaces before and after s1
       s2.trim();
       s1.replaceAll(" ","");                //deletes all " "
       s2.replaceAll(" ","");
       s1.toLowerCase();                    //converts to lowercase
       s2.toLowerCase(); 
       System.out.println(s1);
       System.out.println(s2);
*/       
       char[] x=s1.trim().replaceAll(" ","").toLowerCase().toCharArray();  //create char array x and put s1 into it after triming whitespaces before and after s1, deleting all " ", converting to lowercase
       char[] y=s2.trim().replaceAll(" ","").toLowerCase().toCharArray(); 
       boolean result=false;
       if(x.length!=y.length){
           System.out.println("The two strings cannot be an annogram as one has more characters.");
       }
       
       else{           
       Arrays.sort(x);                       //use sort method to sort the array
       Arrays.sort(y);
       System.out.println(x);
       System.out.println(y);
       result=Arrays.equals(x,y);                             //x.equals(y) is the same as array1 == array2
            if(result==true){
           System.out.println(result+" The two strings can be an annogram.");
                            }
            else{
           System.out.println(result+" The two strings cannot be an annogram as the characters do not match.");
                }
       }
       
       
       
       
    }  
}
