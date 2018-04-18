import java.util.Scanner;

public class FactorialMethod {
    public static int factorial(int x){
    	//the thrid argument (int) is what you want this method to return
    	//ex, if you want this method to return true or false, you put boolean
    	
        if(x == 0 || x == 1){
               return 1;
             }
             else{
             return factorial(x-1)*x;
            }  
      }
      
      public static void main(String[] args){
    	  Scanner s = new Scanner(System.in);
    	  System.out.println("Enter a number to find the factorial: ");
          int x = s.nextInt();
    	  System.out.println("The facorial of number entered is:  "+factorial(x));      
      }
}
