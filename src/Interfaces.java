/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
//this example is the closest thing in java to multiple inheritance
interface X
{
   public void myMethod();
}
interface Y
{
   public void myMethod();
}

class Interfaces implements X, Y
{
   public void myMethod()
   {
       System.out.println("Implementing more than one interfaces");
   }
   public static void main(String args[]){
	   Interfaces obj = new Interfaces();
	   obj.myMethod();
   }
}

