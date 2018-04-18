/*
 * Create a class with a method that prints "This is parent class" 
 * and its subclass with another method that prints "This is child class". 
 * Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class

class Parent {
	public void parentmethod() {
		System.out.print("This is a parent class");
	}
}
class Subclass extends Parent{
	//public void parentclass() {            this is method overriding
		System.out.print("This is a child class");     
	}
	public void stuff() {
		System.out.print("This is a child class");
	}
}
public class SubClasses {
	public static void main(String[] args){
		Parent p=new Parent();
		Subclass s=new Subclass();
		p.parentmethod();
		System.out.println("");
		s.stuff();
		System.out.println("");
		s.parentmethod();
		
	}
}
*
*Simple Manager Employee class and main method calls
*
class Member{
	String name;
	int age,salary;
	String number,address;
	public void printSalary() {
		System.out.print(salary);
	}
}

class Employe extends Member{
	String spec;
}

class Manager extends Member{
	  String depart;
}

public class SubClasses {
	public static void main(String[] args){
		Employe em=new Employe();
		Manager man=new Manager();
		em.salary=50000;
		em.name="John";
		em.age=20;
		em.address="123 fake st";
		em.spec="cleaning toilets";
		man.salary=60000;
		man.name="Bob";
		man.age=20;
		man.address="123 fake st";
		man.depart="Toilets";
		em.printSalary();
		man.printSalary();
	}
	}
	*
*Create a class named 'Rectangle' with two data members 'length' and 
*'breadth' and two methods to print the area and perimeter of the 
*rectangle respectively. Its constructor having parameters for 
*length and breadth is used to initialize length and breadth of the 
*rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
*constructor having a parameter for its side (suppose s) calling the
* constructor of its parent class as 'super(s,s)'. Print the area and
*  perimeter of a rectangle and a square.

class Rectangle {
	int length, width;
	public Rectangle(int x, int y) {
		length=x;
		width=y;
	}
	public void area() {
		System.out.println(length*width);
	}
	public void perim() {
		System.out.println(2*(length+width));
	}
}
class Square extends Rectangle{
	public Square(int s) { 
		super(s,s);   //the child/subclass has to invoke the parent classes' constructor
		              //called a super constructor
	}
}
public class SubClasses {
	public static void main(String[] args){
		Rectangle r=new Rectangle(4,5);
		Square s=new Square(4);
		r.area();
	    r.perim();
	    s.area();
	    s.perim();
	}
	}
*
*
*/
class Shape{
	public void print() {
		System.out.print("This is a shape.");
		
	}
}
class Rectangle extends Shape{
	public void printRectangle() {
		System.out.print("This is a shape.");
		
	}
}
class Square extends Rectangle{
	public void printSquare() {
		System.out.print("Square is a Rectangle.");
		
	}
}
class Cirlce extends Shape{
	public void printCircle() {
		System.out.print("This is a shape.");
		
	}
}

public class SubClasses {
	public static void main(String[] args){
     Square s=new Square();
     s.printRectangle();
     s.print();
		
}
}