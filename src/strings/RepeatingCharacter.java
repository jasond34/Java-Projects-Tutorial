import java.util.Scanner;
/*
 * Create an algorithm that given a string
 * print first repeating character
 *
 */

public class RepeatingCharacter {
	 public static void main(String[] arg) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter a string or sentence: ");
		 String x = s.nextLine();		//take a string from user and set to string x 
		 boolean temp=false;
		 char arr[] = x.toCharArray();  //convert the string into array
		 for(int i=0;i<arr.length;i++) {     //for lengths of strings, use .length()            		    	 
              for(int j=i+1;j<arr.length;j++) {
            	  if(arr[i]==arr[j]) {
            		  System.out.print(arr[i]);
            		  temp=true;
            		  break;
            	  }
              }
             if(temp==true) {
            	 break;
             }
		 }

		 
		 
	 }
}
