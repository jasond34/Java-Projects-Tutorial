import java.util.*;


/*
 * 
 * Find the sum of number of series 
 * after dividing the element of array from previous element.
 * Ex: Input : 3 7 9 10 12 18
 *  Input 3 + 7/3 + 9/7 + 10/9 + 12/10 + 18/12 = 9
 * Output : 9
 */
public class SumAfterDividingNum {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int[] x=new int[6];
		int sum=0;
		System.out.println("Enter 6 integers: ");
		for(int i=0;i<x.length;i++) {
			x[i]=s.nextInt();
			}
		for(int i=0;i<x.length;i++) {
			if(i>0) {
				sum=sum+(x[i]/x[i-1]);
			}
		}
		System.out.println("The sum is : "+(x[0]+sum));

	}
}
