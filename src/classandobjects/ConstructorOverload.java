/*
Create a class named 'Rectangle' with two data members- length and 
breadth and a method to claculate the area which is 'length*breadth'. 
The class has three constructors which are :
1 - having no parameter - values of both length and breadth are 
assigned zero.
2 - having two numbers as parameters - the two numbers are assigned 
as length and breadth respectively.
3 - having one number as parameter - both length and breadth are 
assigned that number.
Now, create objects of the 'Rectangle' class having none, 
one and two parameters and print their areas.
 * 
 *
class Rectangletwo{
  int length, width;
  public Rectangletwo() {
	  length=0;
	  width=0;
  }
  public Rectangletwo(int x, int y) {
	  length=x;
	  width=y;
  }
  public Rectangletwo(int x) {
	  length=x;
	  width=x;
  }
  public void Calculate() {
	  System.out.print(length*width);
  }
}

public class ConstructorOverload {
	public void printSquare() {

		Rectangletwo a=new Rectangletwo();
		Rectangletwo b=new Rectangletwo(3);
		Rectangletwo c=new Rectangletwo(3,5);
		a.Calculate();
		b.Calculate();
		c.Calculate();
	}
}
*
Suppose you have a Piggie Bank with an initial amount of $50 
and you have to add some more amount to it. Create a class 
'AddAmount' with a data member named 'amount' with an initial 
value of $50. Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to Piggie
 Bank
Create object of the 'AddAmount' class and display the final amount 
in Piggie Bank.
*
class AddAmount{
	int amount=50;
	public AddAmount() {
		System.out.print(amount);
	}
	public AddAmount(int x) {
		System.out.print(amount+x);
	}
}

public class ConstructorOverload {
	public void printSquare() {
		AddAmount A=new AddAmount();
		AddAmount B=new AddAmount(5);		
	}
	}
*
*Create a class named 'Programming'. While creating an 
*object of the class, if nothing is passed to it, then the message 
*"I love programming languages" should be printed. If some String 
*is passed to it, then in place of "programming languages" the name 
*of that String variable should be printed.
For example, while creating object if we pass "Java", then "I love 
Java" should be printed.
*/
class Programming{
	public Programming() {
		System.out.print("I love programming");
	}
	public Programming(String x) {
		System.out.print("I love"+x);
	}
}
public class ConstructorOverload {
	public void printSquare() {
		Programming P=new Programming();
		Programming Q=new Programming("poop");
		
	}
	}