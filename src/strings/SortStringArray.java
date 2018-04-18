import java.util.*;
import java.lang.String;
import java.util.Arrays.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *Write down the 10 names  in an array and 
then sort those in alphabetically ascending order. 
/**
 *
 * @author Jason
 */
public class SortStringArray {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String[] x=new String[5];
      System.out.println("Enter 10 names: ");
      for(int i=0;i<x.length;i++){
          x[i]=s.nextLine();
      }
      //Sorting 
      int temp=0;
      String temp2=" ";
      for(int i=0;i<x.length;i++){
          for(int y=i;y<x.length;y++){
               temp=x[i].compareTo(x[y]);
               if(temp>0){
                   temp2=x[i];
                   x[i]=x[y];
                   x[y]=temp2;
               }
          }
      }
      for(int i=0;i<x.length;i++){
          System.out.print(x[i]+" ");
      }  
        
    }
    
}
