import java.util.Scanner;
/*
 * Reverse each  word of a string
 * 
 */

//another method is to split the given string using
/*String [] words = inputString.split(" ");  and do a doulbe loop
 *  for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            String reverseWord = "";             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }             
            reverseString = reverseString + reverseWord + " ";
        }
         System.out.println(inputString);         
        System.out.println(reverseString);         
        System.out.println("-------------------------");
 * 
 */
public class ReverseEachWordofString {
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        String last="";
        int index=0;
        for(int j=0;j<str.length();j++) {
        	if(str.charAt(j)==' ') { 
        				for(int i = j; i >= index; i--)
        					{
        						reverse = reverse + str.charAt(i);
        					}
        				 index=j;
        	}
        	else if(j==str.length()-1) {
        		for(int i = j; i >= index; i--) {
        	           last=last+str.charAt(i);
        		}
        	}
        }
        //System.out.println("Reversed string is:");
        System.out.println(reverse+last);
    }
}


