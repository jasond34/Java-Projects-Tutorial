/*
 * Create a class named 'PrintNumber' to print various numbers of 
 * different datatypes by creating different methods with the same 
 * name 'printn' having a parameter for each datatype.
 *
class PrintNumber{
	public void printn(int x) {
		System.out.println("this is a int"+x);
		
	}
	public void printn(String x) {
		System.out.println(x);
		
	}
	public void printn(double x) {
		System.out.println("this is a double"+x);
		
	}
}
public class MethodOverride {
	public static void main(String[] args){
		PrintNumber p=new PrintNumber();
		p.printn(3);
		p.printn(3.00);
		p.printn(300000000);
		p.printn("Bob Saget");
		p.printn(34.435);
	}
}
*
*Create a class to print an integer and a character with two methods 
*having the same name but different sequence of the integer and the 
*character parameters.
For example, if the parameters of the first method are of the 
form (int n, char c), then that of the second method will be of the 
form (char c, int n).
*
class PrintNumber{
	
	public void printn(int x, char c) {
		System.out.println(x+" "+c);
	}
	public void printn(char c, int x) {
		System.out.println(c+" "+x);
	}
}
public class MethodOverride {
	public static void main(String[] args){
	PrintNumber p=new PrintNumber();
	p.printn(4,'c');
	p.printn('t',9);
	}
	}
*
Create a class to print the area of a square and a rectangle. 
The class has two methods with the same name but different number 
of parameters. The method for printing area of rectangle has two 
parameters which are length and breadth respetively while the other 
method for printing area of square has one parameter which is side of 
square.
*
class PrintArea{
	public void printn(int x, int y) {
		System.out.println("the area of rect is:"+x*y);
	}
	public void printn(int x) {
		System.out.println("the area of square is:"+x*x);
	}
}
public class MethodOverride {
	public static void main(String[] args){
		PrintArea p=new PrintArea();
		p.printn(4);
		p.printn(4,5);
	}
	}
*
*Create a class 'Degree' having a method 'getDegree' that prints 
*"I got a degree". It has two subclasses namely 'Undergraduate' and
* 'Postgraduate' each having a method with the same name that prints
*  "I am an Undergraduate" and "I am a Postgraduate" respectively. 
*  Call the method by creating an object of each of the three classes.
*
class Degree{
	public void getDegree() {
		System.out.println("I got a degree.");
	}
}
class Undergrad extends Degree{
	public void getDegree() {
		System.out.println("I got a undergrad.");
	}
}
class Postgrad extends Degree{
	public void getDegree() {
		System.out.println("I got a postgrad.");
	}
}
public class MethodOverride {
	public static void main(String[] args){
        Degree a=new Degree();
        Undergrad b=new Undergrad();
        Postgrad c=new Postgrad();
        a.getDegree();
        b.getDegree();
        c.getDegree();
	}
	}
*
A class has an integer data member 'i' and a method named 
'printNum' to print thevalue of 'i'. Its subclass also has an 
integer data member 'j' and a method named 'printNum' to print the
 value of 'j'. Make an object of the subclass and use it to assign 
 a value to 'i' and to 'j'. Now call the method 'printNum' by this 
 object.
*
class Something{
	int i;
	public void printn() {
		System.out.println(i);
	}
}
class Subclass extends Something{
	int j;
	public void printn() {
		System.out.println(j);
	}
}
public class MethodOverride {
	public static void main(String[] args){
		Subclass a=new Subclass();
		a.j=5;
		a.i=7;
		a.printn();
		
	}
	}
*Suppose a class 'A' has a static method to print "Parent". 
*Its subclass 'B' also has a static method with the same name to 
*print "Child". Now call this method by the objects of the two classes.
* Also, call this method by an object of the parent class refering 
* to the child class i.e. A obj = new B()
*/
class A{
	static void print() {   //static is something that cannot be overridden
		System.out.println("Parent");
	}
}
class B extends A{
	static void print() {
		System.out.println("Child");
	}
}
public class MethodOverride {
	public static void main(String[] args){
	    A A=new A();
	    B B=new B();
	    A.print();
	    B.print();
	    A obj=new B();   
	    obj.print(); //this will print parent even tho obj=new B
	    //since the parent class method is static and cannot be overridden
	}	
	}
