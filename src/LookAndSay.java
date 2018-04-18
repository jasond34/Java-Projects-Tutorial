import java.util.*;
import java.util.Scanner;
//find nth term in look and say sequence
/*
public class LookAndSay {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Nth place of Look and Say Sequence: ");
		int x=s.nextInt();
        int count1=0;    //to keep track on consecutive chars
        String[] arr=new String[x];
        arr[0]="1";
        for(int i=1;i<arr.length;i++) {
        	String temp=arr[i-1];         
             for(int j=0;j<temp.length();j++) {
             char temp1=temp.charAt(j);
                  if(temp1==temp.charAt(j)) {
                	  count1++;
                  }
                  else {
                	  
                  }
             }
             
        }
	
	}
}
*
*/
public class LookAndSay {
	public static void main(String[] args){
		String num = "1"; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Nth place of Look and Say Sequence: ");
		int x=s.nextInt();
		for (int i=1;i<x;i++) {
			num = lookandsay(num);             
		}
		System.out.println(num);
	}
	
	
	public static String lookandsay(String number){
		StringBuilder result= new StringBuilder();
	 
		char repeat= number.charAt(0);
		number= number.substring(1) + " ";
		int times= 1;
	 
		for(char actual: number.toCharArray()){
			if(actual != repeat){
				result.append(times + "" + repeat);
				times= 1;
				repeat= actual;
			}else{
				times+= 1;
			}
		}
		return result.toString();
	}
}

