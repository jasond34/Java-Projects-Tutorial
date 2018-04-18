import java.util.Scanner;
/*
 * Write a program to print the area of a rectangle by 
 * creating a class named 'Area' taking the values 
 * of its length and breadth as parameters of its 
 * constructor and having a method named 'returnArea' 
 * which returns the area of the rectangle. Length and 
 * breadth of rectangle are entered through keyboard.

class ClassandObjects {
	public static void main(String[] args){
		Area a=new Area(4,5);
		System.out.print(a.returnArea());
	}
}

class Area{
	int length, width;
	public Area(int x, int y) {
		length=x;
		width=y;
	}
	public int returnArea() {
		return length*width;
	}
}
*
*Print the average of three numbers 
*by creating a class named 'Average' having a method 
*to calculate and print the average.
*
class ClassandObjects {
	public static void main(String[] args){
		Area a=new Area();
		System.out.print(a.returnArea(3,4,5));
	}
}

class Area{
	int alpha,bravo,charlie;
	public int returnArea(int x, int y, int z) {
		alpha=x;
		bravo=y;
		charlie=z;
		return (alpha+bravo+charlie)/3;
	}
}
*
Write a program to print the name, salary and date of 
joining of 10 employees in a company.
Use array of objects.
*

class employ{
	String name;
	int age;
	String date;
	public employ(String x, int y, String z) {
		name=x;
		age=y;
		date=z;
	}
}

class ClassandObjects {
	public static void main(String[] args){
		employ[] a;
		a=new employ[10];
		a[0]= new employ("blah",20,"12-12-2000");
		a[1]= new employ("blah",20,"12-12-2000");
		a[2]= new employ("blah",20,"12-12-2000");
		a[3]= new employ("blah",20,"12-12-2000");
		a[4]= new employ("blah",20,"12-12-2000");
		a[5]= new employ("blah",20,"12-12-2000");
		a[6]= new employ("blah",20,"12-12-2000");
		a[7]= new employ("blah",20,"12-12-2000");
		a[8]= new employ("blah",20,"12-12-2000");
		a[9]= new employ("blah",20,"12-12-2000");
		for(int i=0;i<10;i++) {
			System.out.println(a[i]);
		}
	}}
*
*Add two distances in inch-feet by creating a 
*class named 'AddDistance'.
*/
class AddDistance{
	private int feet;
	public AddDistance(int x) { //constructors cannot return values 
		                            //so you cant do public int AddDistance(int x)
		feet=x;
		feet=feet*12;            //had the constructor do conversion
	}
	int Add(int x) {
		int total;
		total=feet+x;
		return total;
	}
	
}

class ClassandObjects {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your height in feet and inches: ");
	System.out.println("How many feet? ");
	int feet=s.nextInt();
	System.out.println("How many inches? ");
	int inch=s.nextInt();
	AddDistance something=new AddDistance(feet);
	int total=something.Add(inch);
	System.out.print(total+" inches");
}}
