/*
Write a function lucky_sevens?(numbers), which takes in an array of integers and returns true if any three consecutive elements sum to 7.
 */
import java.util.*;
/**
 *
 * @author Jason
 */
class Lucky7 {

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
                if(array[i]<7&&i<=array.length-3){
                     temp=array[i]+array[i+1]+array[i+2];
                       if(temp==7){
                           t=true;
                       }
                }
            }
       System.out.println(t);
            
            
        }
}