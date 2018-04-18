/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class twogreaterthaneachdigit {
    public static void main(String[] args){
    int x,y,first,second,third,fourth;
    x=1234;
    //what we are doing here is taking 1234 and outputting each digit +2
    //in order to do with without data structures, we have to get each digit
    //the best way is to first divide the the x by its current decimal place
    //since x is an integer, it will only take the whole value
    //then module x by the decimal place to reset x to the next values
    //and then add the 2 and repeat
    first=x/1000;
    x%=1000;
    first+=2;
    second=x/100;
    x%=100;
    second+=2;
    third=x/10;
    x%=10;
    third+=2;
    fourth=x;
    fourth+=2;
    System.out.println("First is "+first+" Second is: "+second+" third is "+third+" fourth is: "+fourth);
    }
}


