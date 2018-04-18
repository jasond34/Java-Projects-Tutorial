import java.lang.reflect.Array;
import java.util.*;
/*
 * For a given array of price of items,you have to calculate 
 * the sum and average of all prices up to 2 decimal places.
 * 
 */
public class ArrayPractice {
/*
	 public static void main(String[] args){
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter the number of test cases: ");
		 int n=s.nextInt();
		 for(int i=0;i<n;i++) {
			 System.out.print("Enter the number of item prices: ");
			 int item=s.nextInt();
			 int[] x=new int[item];
			 int sum=0;
			 float average=0;
			 for(int j=0;j<item;j++) {
				 System.out.print("Enter the prices: ");
				 x[j]=s.nextInt();
				 sum=sum+x[j]; 
				 average=(sum/x.length+1);
			 }
			 System.out.println("The sum: "+ sum+" The average: "+String.format( "%.2f", average ));
		 }
		 
		 
	 }
}
*
*Insertion sort to sort even and odd positioned elements
* in different orders
* Input : a[] = {7, 10, 11, 3, 6, 9, 2, 13, 0}
Output :      11  3   7  9  6  10  2  13  0
odds in descending
evens in ascending

public static void main(String[] args){
	int a[] = {7, 10, 11, 3, 6, 9, 2, 13, 0};   //a[0] is odd
	int temp=0;
	 for(int i=0;i<a.length;i++) {
		 if(i==0 ||i%2==0) {   //odds
             for(int j=i;j<a.length;j+=2) {
            	 if(a[j]>a[i]) {
            		 temp=a[i];
            		 a[i]=a[j];
            		 a[j]=temp;
            	 }
             } 
		 }
		 else if(i==1||i%2!=0) {
			 for(int j=i;j<a.length;j+=2) {
				 if(a[j]<a[i]) {
            		 temp=a[i];
            		 a[i]=a[j];
            		 a[j]=temp;
				 }
			 }
		 }
		 System.out.print(a[i]+" ");
	 }
}
}
*Divide two integers without using multiplication, 
*division and mod operator
*Input : a = 10, b = 3
Output : 3
Input : a = 43, b = -8
Output :  -5
*
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a integer to be divided(no decimals): ");
		int a=s.nextInt();
		System.out.print("Enter another integer: ");
		int b=s.nextInt();
		int count=0;
		if(b>a) {
			System.out.print("0");
		}
		while(a>=b) {
			a=a-b;
			count++;
		}
		System.out.println("A is divisible by B: "+count+" times");	
}}
*
*
Say that a "clump" in an array is a series of 2 or 
more adjacent elements of the same value. Return the number 
of clumps in the given array.
Return how many clumps there are, not the value of clumps*
countClumps([1, 2, 2, 3, 4, 4])  2
countClumps([1, 1, 2, 1, 1])  2
countClumps([1, 1, 1, 1, 1])  1
*
	public static void main(String[] args){
		int[] x= {1, 1, 1, 1, 1};
		int count=0;
		boolean match=false;        //The match variable prevents the program from counting the same clump twice
		for(int i=0;i<x.length-1;i++) {	 //The match variable tells the program that this matching clump has already been accounted for.
			if(x[i]==x[i+1]&& match==false) {
				match=true;      //when x[i]=1, and x[i+1]=1, the match switch flips true, and counts get +1
                count++;         //and i+1, then x[i] is still 1, and x[i]==x[i+1], since match is true, 
			}                     //and match =true, count does not get +1
			else if(x[i]!=x[i+1]) {      //match gets switched back to false only if x[i]!=x[i+1]
				match=false;
			}.
			
		}
		System.out.print(count);
	}}
	* Fibonacci check 
	*/
	
	public static void main(String[] args){

     

	}
}
	