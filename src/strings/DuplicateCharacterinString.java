import java.util.*;
import java.util.Arrays.*;
/*
 * Create an algorithm that takes in a string and returns 
 * 'true' if there are no repeating characters in the string,
 *  and false if there are repeating characters.
 */

public class DuplicateCharacterinString {
	 public static void main(String[] arg) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter a string or sentence: ");
		 String x = s.nextLine();		//take a string from user and set to string x 
		 char arr[] = x.toCharArray();  //convert the string into array
		 //System.out.println(Arrays.toString(arr));
		 int temp=0;        // 1 if there are duplicates, 2 if none
		 char temp2='x';
		 for(int i=0;i<arr.length;i++) {     //for lengths of strings, use .length()            		    	 
		    for(int j=i+1;j<arr.length;j++) {
		    	if(arr[i]==arr[j]) {
		    		temp=1;
		    		temp2=arr[i];
		    	}

		    }

		 }
		 if(temp==1) {
			 System.out.println("There are duplicates. The character: '"+ temp2+"'");
		 }
		 else {
			 System.out.println("There are no duplicates");
		 }
		 //System.out.println(Arrays.toString(ascii));

		 
		 
	 }
}
