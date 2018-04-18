/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classandobjects;

/**
 *
 * @author Jason



class Rectangle{
  private int length;
  private int breadth;
  public Rectangle(int l, int b){
    length = l;
    breadth = b;
  }
  public String getArea(){
    return "Blah blah blah";
  }
}

class ClassandObjects{
  public static void main(String[] args){
    Rectangle r = new Rectangle(2,4);
    System.out.println(r.getArea());
  }
}
* 
* Create a class named 'Student' with String variable 'name' 
* and integer variable 'roll_no'. Assign the value of roll_no 
* as '2' and that of name as "John" by creating an object of the 
* class Student. 
*
class Student{
 String name;
 int roll_no;
public Student(){
    name="John";
    roll_no=2;
}
}

class ClassandObjects{
  public static void main(String[] args){
     Student s=new Student();
     System.out.print(s.name+" "+s.roll_no);
  }
}
*
* Assign and print the roll number, phone number and 
* address of two students having names "Sam" and "John" 
* respectively by creating two objects of class 'Student'. 
*/
class Student{
 String name;
 int roll_no;
 String phone;
public Student(String n,int x,String y){
    name=n;
    roll_no=x;
    phone=y;
}
}

class ClassandObjects{
  public static void main(String[] args){
     Student s=new Student("John",2,"978-726-7313");
     Student x=new Student("Sam",1,"978-726-7313");
     System.out.print(s.name+" "+s.roll_no+" "+s.phone);
     System.out.println(x.name+" "+x.roll_no+" "+x.phone);
  }
}