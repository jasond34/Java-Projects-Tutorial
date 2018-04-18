/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */

//this function asks user for input(x) and finds the 
//xth number in the fibbonacci sequence
import java.util.*;

public class Fibonnaci {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n1=0, n2=1, n3=0;  //n1 and n2 is the first two #s in the sequence
    System.out.println("Enter a number: ");
    int x=s.nextInt();
    System.out.print(n1+" "+n2);            //print out the first 2 seqeunce first
    for(int i=2;i<x;i++){         //the reason i=2 and not =0 is because n1 and n2 which are the first 2 numbers in sequence do count
           //if you dont want to ask user for input just change x in the for loop
           //x is whatever the count or # in the sequnce
        n3=n1+n2;
      System.out.print(" "+n3);
      n1=n2;
      n2=n3;
    }
    
    }
}