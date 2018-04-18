/*
Write a function disemvowel(string), which takes in a string, and returns that string with all the vowels removed. Treat “y” as a consonant.
 */
import java.util.Scanner;
/**
 *
 * @author Jason
 */
public class Disemvowel {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a sentence or string.");
        String x=s.nextLine();
        String y=x.replace("a","");
        y=y.replace("e","");
        y=y.replace("i","");
        y=y.replace("o","");
        y=y.replace("u","");
        
        /*
        for(int i=0; i<x.length();i++){
            if(x.charAt(i)=='a' || x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='o' || x.charAt(i)=='u'){
                y=x.replace("a","");
                y=y.replace("e","");
                y=y.replace("i","");
                y=y.replace("o","");
                y=y.replace("u","");
            }
        }
*/
        System.out.println(y);
    }
}
