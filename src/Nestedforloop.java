/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class Nestedforloop{
 public static void main(String[] args){
    int i,j;
    
   for(i=12;i<=14;i++){
    System.out.println("Table of " + i);
    for(j=1;j<=10;j++)
    {
        System.out.println(i+"*"+j+" = "+(i*j));
    }
}
}
}