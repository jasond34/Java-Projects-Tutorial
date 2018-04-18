import java.util.*;
import java.lang.String;
import java.util.Arrays.*;
/*
 * 
 * 
 *  print length of string

public class Others {
	  public static void main(String[] args){
		    
		  //Scanner s = new Scanner(System.in);
		    String a = "stuff";
		    System.out.println(a.length());
		    
		  }		 	
}	 
		 
*
*
*		 
//checks to see if charcter is in string, returns true or false		 
public class Others {
	  public static void main(String[] args){
		    
		  //Scanner s = new Scanner(System.in);
		    String a = "Umbrella";
		    System.out.println(a.contains("e"));
		    
		  }		 	
}
*
*
*If done by loop
*	
public class Others {	 
  public static void main(String[] args){
    String a = "Umbrella";
    boolean per = false;
    for(int i = 0;i<a.length();i++){
      if(a.charAt(i) == 'e'){
        per=true;
        break;
      }
    }
    System.out.println(per);
  }	
  }	 
*
*
*		 
public class Others {
	  public static void main(String[] args){
		    
		  //Scanner s = new Scanner(System.in);
		    String a = "This is orange juice";
		    System.out.println(a.contains("orangs"));
		    
		  }		 	
} 
*
*Return the index values of the first and last occurrence
*of characters of o, , and z
*		 
	 
public class Others {
	  public static void main(String[] args){
		    
		  //Scanner s = new Scanner(System.in);
		    String x = "Hello, World";
		    int x1=x.indexOf("o");
		    int x2=x.indexOf(",");
		    int x3=x.indexOf("z");   //x3 will return -1 since z is not in the string
		    		System.out.println(x1);
		    		System.out.println(x2);
		    		System.out.println(x3);
                    System.out.println(x.lastIndexOf('o'));
                    System.out.println(x.lastIndexOf(','));
                    System.out.println(x.lastIndexOf('z'));  //returns -1
		  }		 	
} 
*
*Write a program that takes your full name as input and displays the abbreviations of the first 
*and middle names except the last name which is displayed as it is. For example, if 
*your name is Robert Brett Roser, then the output should be R.B.Roser.
*Note: This program assumes users will type first name first, without any spaces in front
*and works only in standard one middle name format: First middle last
*
public class Others {
	  public static void main(String[] args){
		    
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter your full name, including middle if you have one.");
		    String x =s.nextLine();  //.nextLine takes whole Line instead of just first name
		    //System.out.println(x);
		    int x1=x.indexOf(" ");
		    int x2=x.lastIndexOf(" ");
		    char ch = Character.toUpperCase(x.charAt(0));
		    char mid =Character.toUpperCase(x.charAt(x1+1));
		    if(x1==x2){
		    	
		    	System.out.println(ch+"."+(x.substring(x1+1,x.length())));
		    }
		    else {
		    	System.out.println(ch+"."+mid+"."+(x.substring(x2+1,x.length()))); 		    	
		    }
 }		 	
} 
*
*Better one but this also assumes user do not enter " " before first
*name
*
public class Others {
	public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String st = s.nextLine();
    String sr = "";   
    sr = sr+st.charAt(0); 
    sr = sr+". ";   //sr gets the initial of first name and concatenates "."
    for (int i = 0; i<st.length();i++){
      if(st.charAt(i) == ' ' && st.charAt(i+1)!=' ' && i+1<st.length()){ //loops thru string, when it comes to the first " " and first chacrter after " " is not " " and position of i+1 is not greater than length of string
        sr = (sr+st.charAt(i+1)).toUpperCase();       // change the charcters after " " to Uppercase
        sr = sr+". ";                                     //then concatenate "." after the uppercase
      }
    }
    String last_wrd = "";
    //to get the last word
    for(int i = st.length()-1;i>=0;i--){
      if(st.charAt(i) == ' '){   //loops backward until you find the first " "
        last_wrd = st.substring(i+2);    //returns substring with start condition
        break;
      }
    }
    //to remove last ". "
    sr = sr.substring(0,sr.length()-2);
    sr = sr+last_wrd;
    System.out.println(sr);
  }
}
*
*Write a program to find the number of vowels, consonents, 
*digits and white space characters in a string.
*
public class Others {
	  public static void main(String[] args){
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter a string: ");
		  String x=s.nextLine();
		  int countspace=0, countvowel=0, countcon=0, countnum=0;
		  for(int i=0;i<x.length();i++) {
			  if(x.charAt(i) == ' ') {
				  countspace+=1;
			  }
			  else if(x.charAt(i) > '0'&& x.charAt(i) < '9') {
				  countnum+=1;
			  }
			  else if(x.charAt(i) == 'a'||x.charAt(i) == 'e'||x.charAt(i) == 'i'||x.charAt(i) == 'o'||x.charAt(i) == 'u'||x.charAt(i) == 'y') {
				  countvowel+=1;
			  }
			  else if(x.charAt(i) != ' '){
				  countcon+=1;
			  }
		  }
		  
		  System.out.println("# of spaces: "+countspace+" # of vowels: "+countvowel+" # of digits: "+countnum+" # of constenents: "+countcon);		  

 }		 	
} 
*
*Write a program to delete all consnents from the string 
*"Hello, have a good day".
*
*not finished

public class Others {
	  public static void main(String[] args){
		    
		    String x = "Hello, have a good day";
		    String y ="";
		    for(int i=0;i<x.length();i++) {
		    	if(x.charAt(i) != 'a'&&x.charAt(i) != 'e'&&x.charAt(i) != 'i'&&x.charAt(i) != 'o'&&x.charAt(i) != 'u'&&x.charAt(i) != 'y') {
		    		y=x.replace(x.charAt(i), ' ');	
		    	}
	
		    }
		    
}		 	
}
*
*Input a string of alphabets. Find out the number of occurrence of all alphabets in that string. 
*Find out the alphabet with maximum occurrence.
*

public class Others {
	public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String x=s.nextLine();
    char arr[] = x.toCharArray();
    int count=0;
    //char arr2[]=new char[arr.length];
    int[] countarr= new int[26];
    for(int i=0;i<arr.length;i++) {
        if(arr[i] )
    	
    }
    
  }
}
*
*check to see if user input string is a Palindrome
*Palindrome is a string that reads the same from front to back
*
public class Others {
	public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String x=s.nextLine();
    boolean tf=true;
    for(int i=0;i<x.length()/2;i++) {
        	if(x.charAt(i)!=x.charAt(x.length()-1-i)) {
        		tf=false;
        		break;
        	}
        	
    }
    	System.out.println("This is not a Palindrome.");   
  }
}
*
*Write a program to find out the largest and 
*smallest word in the string "This is an umbrella".
*
public class Others {
	  public static void main(String[] args){
		    
		    String x = "This is an Umbrella.";
		    int count=0,min=x.length(),max=0,index=0;
		    String shortest=" ", longest=" ";
		    //System.out.println(x.contains(" "));	   
		        for (int i = 0; i<x.length();i++){
		        	char c = x.charAt(i);
		        	if(c!=' ') {
		        	    count++;
		        	}
		        	else if(c==' ') {
                    		
                    		if(count>max) {
                    			max=count;
                    			longest=x.substring(i, index);
                    			System.out.println(longest);
                    		}
                    		if(count<min) {
                    			min=count;                    	
                    			shortest=x.substring(i,index);
                    			System.out.println(shortest);
                    		}
                    	}
                    	count=0;
                    	index=i+1;
		          }
		   System.out.print("Shortest string is: "+shortest+" Longest: "+longest);	       
}
}
*	  
*
Ugly numbers are numbers whose only prime factors are 2, 3 or 5
. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows 
the first 11 ugly numbers. By convention, 1 is included. 
Write a program to find Nth Ugly Number.
*
*
public class Others {
	  public static void main(String[] args){
		 int[][] x= {{3,4,6,8,1},
				     {4,7,9,2,0},
				     {69,67,34,7,1},
				     {43,72,19,10,3},
				     {41,73,90,28,67},
				     };
		 // assume we need to sort column 4
		 int k=3;
		 for(int i=0;i<5;i++) {
           for(int j=0;j<5;j++) {
        	   System.out.print(x[i][j] + " ");
           }
           System.out.println();
			 
		 }
		 
	  }}
*/
public class Others {
	  public static void main(String[] args){
		  int d=0;

		  for(int i=0;i<31;i++)

		  for(int j=0;j<31;j++)

		  for(int k=0;k<31;k++) {

		                if (((i+j+k) % 3)==0)

		                d=d+1; 
		                

		                }
		  System.out.print(d);
	  }
	  }