import java.util.Scanner;
/*
 * class Car{
  public int power;
  public int Serial_no;
  public Car(int p, int s){
    power = p;
    Serial_no = s;
  }
}

class Ar1{
  public static void main(String[] args){
    Car[] c;
    c = new Car[10];
    c[0] = new Car(800,111);
  }
}




 * Write a program to print the name, salary and date of joining of 
 * 10 employees in a company.
Use array of objects.

class AboutEmployees{
	int salary;
	String name,date;
    public AboutEmployees(String x, String y, int z) {
    	salary=z;
    	name=x;
    	date=y;
    }
    void print() {
    	System.out.println(name+" "+date+" "+salary);
    }
}

public class ObjectArray {
	public static void main(String[] args){
		
		AboutEmployees[] e=new AboutEmployees[10];
		e[0]=new AboutEmployees("Bob","2/1/10",50000);
		e[1]=new AboutEmployees("Is","2/1/10",50000);
		e[2]=new AboutEmployees("The","2/1/10",50000);
		e[3]=new AboutEmployees("Biggest","2/1/10",50000);
		e[4]=new AboutEmployees("Hoe","2/1/10",50000);
		e[5]=new AboutEmployees("Ever","2/1/10",50000);
		e[6]=new AboutEmployees("Bob","2/1/10",50000);
		e[7]=new AboutEmployees("Bob","2/1/10",50000);
		e[8]=new AboutEmployees("Bob","2/1/10",50000);
		e[9]=new AboutEmployees("Bob","2/1/10",50000);

		for(AboutEmployees x: e) {// enhanced for loop   syntax: for(type new variable: arrayname){ }
			                      //so basically its saying for every variable type of AboutEmployees in
			                     //array e, set to variable x
			x.print();           //then call print from AboutEmployees class
		}                        //so 1st x will = AboutEmployees("Bob","2/1/10",50000);
	}
}
*
*Write a program to calculate the average height of all the 
*students of a class. The number of students and their heights in a
* class are entered by user.
*/
class Height{
	int count;
	int total=0;
	public void calc(int y) {
            total=total+y;
            
	}
	public void total() {
		System.out.println(total);
	}
}

class ObjectArray {
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 5 heights in inches: ");
	int[] x=new int[5];
	for(int i=0;i<x.length;i++) {
		x[i]=s.nextInt();       // all values should be in array x now      
	}
	
	Height h=new Height();
    Height[] array;
    array=new Height[5];
    for(int i=0;i<5;i++) {
    	array[i]=new Height();  //created 5 Height objects
    }
    for(int i=0;i<5;i++) {
    	array[i].calc(x[i]);
    }
    /*array[0].calc(19);
    array[0].calc(10);
    array[0].calc(14);
    array[0].calc(10);
    array[0].calc(18);*/
    h.count=5;
    h.total();
}
}


/*
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
*
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
*/