
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 * Take in integers from user, print out
 * number of positive, negative, odd and even numbers
 */
public class OddEvePosNegArray {
       public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter 5 integers: ");
      int[] x= new int[5];
      for(int i=0;i<x.length;i++){
          x[i]=s.nextInt();    
      }
      int countpos=0,countneg=0,countodd=0,counteve=0;
      for(int i=0;i<x.length;i++){
          if(x[i]>0 && x[i]%2==0){
              countpos+=1;
              counteve+=1;
          }
          else if(x[i]>0 && x[i]%2!=0){
                countpos+=1;
                countodd+=1;
          }
          else if(x[i]<0 && x[i]%2==0){
              countneg+=1;
              counteve+=1;
          }
          else{
              countneg+=1;
              countodd+=1;
          }
          }
      System.out.println("The number of Positive: "+countpos+"\nnegative: "+countneg+"\nodd: "+countodd+"\neven: "+counteve);
      
  }  
}
/*
eaiser way to do this, 
you do not need two loops
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int[] z = new int[20];
    int pos = 0;
    int neg = 0;
    int odd = 0;
    int even = 0;
    int zero = 0;
    for(int i = 0;i<z.length;i++){
      System.out.println("Print the value of z["+i+"]");
      z[i] = s.nextInt();

      if(z[i]>0){
        pos++;
      }
      else if(z[i]<0){
        neg++;
      }
      else{
        zero++;
      }
      if(z[i]%2==0){
        even++;
      }
      else{
        odd++;
      }
    }
    System.out.println("Positive : "+pos+"\nNegative : "+neg+"\nZero : "+zero+"\nodd : "+odd+"\neven : "+even);
  }


*/