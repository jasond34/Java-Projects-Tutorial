/*
 * Find missing number in an array
 * Answer should be 2
 * use the sum of all the numbers
 * since n=8, the sum should be 8+7+6....
 */
public class FindMissingNumber {
	public static void main(String[] args){
		int[] x={1, 4, 5, 3, 7, 8, 6,2,10}; // user input array
		int n=10; //assume user input n =8
		int sum=0,xsum=0;
		for(int i=0;i<n+1;i++) {
			sum=sum+i; //if n=8, sum should be 36
		}
		for(int i=0;i<x.length;i++) {
			xsum=xsum+x[i];
		}
		System.out.print("The missing number is: "+(sum-xsum));
	}
}
