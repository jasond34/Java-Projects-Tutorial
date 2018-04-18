import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
/*
 * Program to find all repeating characters and their count 
 * (using hash maps)
 */
public class DuplicateCharactersHashMap {
	 public static void main(String[] arg) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter a string or sentence: ");
		 String x = s.nextLine();		//take a string from user and set to string x 
         int count=0;
		 char arr[] = x.toCharArray();  //convert the string into array
		 /* This is how to declare HashMap (kinda like declaring a arr)*/
		 HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
	   //HashMap<Key type, Value type> variable/name = new HasMap<Key type, Value type>

		 /*Adding elements to HashMap*/
		  //hmap.put('A',3);
	      //hmap.put('B',5);
          for(int i=0;i<arr.length;i++) {  // traverse the char arr once
              if(hmap.containsKey(arr[i])) {  //if arr[i] occurs more than once and is in hmap<keys already, then do hmap put of hmap<arr[i], count>
            	  hmap.put(arr[i], hmap.get(arr[i])+1); // the hmap.get function gets the value of the key passed into its argument
              }                                //so in this case, we are getting the value of key arr[i] in the hmap and adding 1 to it
              else {                              //else if char only occurs once, then put hmap<arr[i], 1>
            	  hmap.put(arr[i], 1);          
              } 
          }
          System.out.println(hmap);
	 }
}
