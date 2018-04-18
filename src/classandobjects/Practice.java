/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classandobjects;

/**
 *
 * @author Jason
 */
class Triangle{
 int x,y,z;
 public int area(){
     return x*y*z;
 }
 public int perimeter(){
     return x+y+z;
}
}
class Practice {
    public static void main(String[] args){
    Triangle s=new Triangle();
    s.x=3;
    s.y=4;
    s.z=5;
    System.out.println(s.area());
    System.out.println(s.perimeter());
    
    }  
}
