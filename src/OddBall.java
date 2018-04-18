
import java.util.Scanner;

/*
Write a function oddball_sum(numbers), which takes in an array of integers and returns the sum of all the odd elements.
 */

/**
 *
 * @author Jason
 */
public class OddBall {
            public static void main(String[] args){
            int[] array=new int[10];
            boolean t=false;
            int temp=0;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter an array of 10 integers: ");
            for(int i=0;i<10;i++){
                array[i]=s.nextInt();
            }
            for(int i=0;i<10;i++){
             if(array[i]%2!=0){
                 temp=temp+array[i];
             }   
            }
            System.out.println(temp);
            
            }
}
