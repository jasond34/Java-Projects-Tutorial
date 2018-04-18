/*
 * Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $100 to salary of the employee if it is less than $50000.
3 - 'AddWork()' which adds $500 to salary of employee if the number of hours of work per day is more than 6 hours.
 */
class Employee1 {
	int getInfo(int x,int y) {
		int newsal=addSal(x);   
		newsal=addWork(newsal,y);
		return(newsal);
	}
	int addSal(int x) {
		if(x<50000) {
			x=x+100;
			return x;
		}
		else {
			return x;
		}
	}
	int addWork(int x, int y) {
		if(y>6) {
			x=x+500;
			return x;
		}
		else {
			return x;
		}
	}
}

public class Employee {
	public static void main(String[] args){
		Employee1 employ=new Employee1();
		int x=employ.getInfo(48000,9);   
		System.out.println("Final salary is: "+x);	
	}
}
