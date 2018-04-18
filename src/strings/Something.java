/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author Jason
 */
public class Something {
    public static void main(String args[]){
        String x="ababa";
        String Suffix=x;
        //System.out.print(Suffix);
        String temp="";
        int count=0;
        for(int i=0;i<x.length();i++){
            temp=temp+x.charAt(i);
            Suffix= x.substring(i);
            System.out.println(Suffix);
            System.out.println("temp: "+temp);
            /*for(int j=0;j<Suffix.length();j++){
                if(Suffix.charAt(i)==temp.charAt(i)){
                    count++;
                }
            }*/
            //System.out.print(count);
        }
        
    }
}
