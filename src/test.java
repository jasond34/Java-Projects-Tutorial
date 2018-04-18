
import java.util.Scanner;
/*
Write a method square_nums that takes a number max and returns the number of perfect squares less than max. 
Do not use Math.sqrt(x) or x ** 0.5; we don't want you to calculate square roots for this problem. You will, however, want to find squares (x * x is fine). 
*/
public class test {
	public static void main(String[] arg) {
            //assuming we're taking in 5 ints

	    Scanner s=new Scanner(System.in);
            System.out.println("Enter a max number: ");
            int x=s.nextInt();
            int count=1;    //one because we already counted 1*1 for every number
            if(x==0){  //added a check just for 0
                System.out.print("0");
            }
            else{
            for(int i=2;i<x;i++){
                if((i*i)<x){
                    count++;
                    System.out.print(" "+i);
                }
            }
            System.out.println(" The number of perfect squares less than your num is: "+count);
            }
            
            
            
    
        }
}