/*
 * Create an abstract class 'Parent' with a method 'message'. 
 * It has two subclasses each having a method with the same name 
 * 'message' that prints "This is first subclass" and "This is second 
 * subclass" respectively. Call the methods 'message' by creating an 
 * object for each subclass.
 *
abstract class Parent{
	abstract void message();
}

class Sub extends Parent{
	public void message() {
		System.out.println("This is the first subclass.");
	}
}

class Sub2 extends Parent{
	public void message() {
		System.out.println("This is the second subclass.");
	}
}
public class AbstractClass {
	public static void main(String[] args){
		Sub s=new Sub();
		Sub2 s2=new Sub2();
		s.message();
		s2.message();
		
		
}
}
*Create an abstract class 'Bank' with an abstract method 'getBalance'.
* $100, $150 and $200 are deposited in banks A, B and C respectively.
*  'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each 
*  having a method named 'getBalance'. Call this method by creating an 
*  object of each of the three classes.
*
abstract class Bank{
   abstract void getBalance();	
}
class BankA extends Bank{
	public void getBalance() {
		System.out.println("100");
	}
}
class BankB extends Bank{
	public void getBalance() {
		System.out.println("150");
	}
}
class BankC extends Bank{
	public void getBalance() {
		System.out.println("200");
	}
}
public class AbstractClass {
	public static void main(String[] args){
		BankA b=new BankA();
	    BankB b1=new BankB();
	    Bank b2=new BankC();
	    b.getBalance();
	    b1.getBalance();
	    b2.getBalance();
}
}
*We have to calculate the percentage of marks obtained in three 
*subjects (each out of 100) by student A and in four subjects 
*(each out of 100) by student B. Create an abstract class 'Marks' 
*with an abstract method 'getPercentage'. It is inherited by two other
* classes 'A' and 'B' each having a method with the same name which 
* returns the percentage of the students. The constructor of 
* student A takes the marks in three subjects as its parameters and 
* the marks in four subjects as its parameters for student B. Create 
* an object for eac of the two classes and print the percentage of 
* marks for both the students.
*
abstract class Marks{
	abstract void getPercentage(); 
}
class Aa extends Marks{
	int x, y, z;
	public Aa(int a, int b, int c){
		x=a;
		y=b;
		z=c;
	}
	public void getPercentage(){
		System.out.println("The percentages for A are: "+x+"% "+y+"% "+z+"%.");
	}
	
}
class Bb extends Marks{
	int a,b,c,d;
	public Bb(int x, int y, int i, int j) {
		a=x;
		b=y;
		c=i;
		d=j;
	}
	public void getPercentage(){
		System.out.println("The percentages for B are: "+a+"% "+b+"% "+c+"% "+d+"%.");
	}
}

public class AbstractClass {
	public static void main(String[] args){
		Aa Aa=new Aa(75,35,90);
		Bb Bb=new Bb(45,34,78,85);
		Aa.getPercentage();
		Bb.getPercentage();
	}
}
*An abstract class has a construtor which prints "This is constructor
* of abstract class", an abstract method named 'a_method' and a 
* non-abstract method which prints "This is a normal method of 
* abstract class". A class 'SubClass' inherits the abstract class 
* and has a method named 'a_method' which prints "This is abstract
*  method". Now create an object of 'SubClass' and call the abstract
*   method and the non-abstract method. (Analyse the result)
*
abstract class Abstract{
	public Abstract(){
		System.out.println("this is the constructor of abstract class");
	}
	abstract void a_method();
    public void print() {
    	System.out.println("This is a normal method of abstract class");
    }
}
class Subclass extends Abstract{
	public void a_method() {
		System.out.println("this is abstarct method");
	}
}
public class AbstractClass {
	public static void main(String[] args){
	Subclass s=new Subclass();
	s.a_method();
		// the constructor will always run since it is inherited 
	//and it will also run the Subclass a_method
	s.print();
}
}
*
*Create an abstract class 'Animals' with two abstract methods 
*'cats' and 'dogs'. Now create a class 'Cats' with a method 'cats'
which prints "Cats meow" and a class 'Dogs' with a method 'dogs' 
which prints "Dogs bark", both inheriting the class 'Animals'. Now 
create an object for each of the subclasses and call their respective
 methods.
*
abstract class Animals{
	abstract void cats();
	abstract void dogs();
}

class Cats extends Animals{
	public void cats() {
		System.out.println("meow");
	}
	public void dogs() {
		
	}
}
class Dog extends Animals{
	public void dogs() {
		System.out.println("woof");
	}
	public void cats() {
		
	}
}
public class AbstractClass {
	public static void main(String[] args){
	Cats c=new Cats();
	Dog d=new Dog();
	c.dogs();
	c.cats();
	d.dogs();
	d.cats();
	}
	}
*
*We have to calculate the area of a rectangle, a square and a circle.
* Create an abstract class 'Shape' with three abstract methods namely
*  'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea'
*   taking one parameter each. The parameters of 'RectangleArea' are 
*   its length and breadth, that of 'SquareArea' is its side and that
*    of 'CircleArea' is its radius. Now create another class 'Area'
*     containing all the three methods 'RectangleArea', 'SquareArea'
*      and 'CircleArea' for printing the area of rectangle, square and
*       circle respectively. Create an object of class 'Area' and call
*        all the three methods.
*  Then use object array to calculate 4 rect, 4 squares, 5 circles
*/
abstract class Shape2{
	abstract void Rectangle(int a, int b);
	abstract void Square(int a);
	abstract void Circle(int a);
	
}
class Area extends Shape2{
	public void Rectangle(int a, int b) {
		System.out.println("The area is: "+a*b);
	}
	public void Square(int a) {
		System.out.println("The area is: "+a*a);
	}
	public void Circle(int a) {
		System.out.println("The area is: "+(a*(.5)));
	}
}

public class AbstractClass {
	public static void main(String[] args){
	Area a=new Area();
	Area[] array;
	array= new Area[14];
	//a.Rectangle(3,4);
	//a.Circle(4);
	//a.Square(3);
	for(int i=0;i<14;i++) {
		array[i]=new Area();
	}
	array[0].Rectangle(3,4);
	array[1].Square(3);
	array[2].Circle(4);
	array[3].Rectangle(4,5);
	array[4].Square(4);
	array[5].Circle(5);
	array[6].Rectangle(5,6);
	array[7].Square(5);
	array[8].Circle(6);
	array[9].Rectangle(7,8);
	array[10].Square(7);
	array[11].Circle(8);
	array[12].Circle(9);
	}
	}
