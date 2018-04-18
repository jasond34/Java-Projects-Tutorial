import java.util.Scanner;
/*
 * Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor 
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions
Class 'BankAccount' has a method for each of the following 

 */
class Bankaccount{
	Scanner s=new Scanner(System.in);
	String name;
	String address;
	String type;
	double bal,balance;
	int transactions=0; //count transaction #s
	int numberacc;
	String account;
	public Bankaccount(String x, String y, String z, int c) { //c is the # of iterations/# of accounts created so far
		System.out.println("Constructor invoked");
		name=x;
		address=y;
		type=z;
		numberacc=c;
		balance=resetbal(); //balance is the one you want to manipulate
        // int b is the # of accounts user wants to create
		account="BA100"+generate(c);  //every account that gets created gets generated a acc #
	}
	public double resetbal() {
		bal=0.00;
		return bal;
	}
	public int generate(int y) {
//1 - Generate a unique account number for each depositor
//For first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
		
		int number=y;
		System.out.println("Your unique accounts # is BA100"+number);
		return number;
	}
	public void display() {
///2 - Display information and balance of depositor as confirmation
		String response;
		System.out.println("Please verify the following info: ");
		System.out.println("Your name is: "+name);
		//response=verify();
		//no functionality to change name or type yet
		System.out.println("Your address is: "+address);
		response=verify();
		if(response!="Y"||response!="y") {
			change();
		}
		else {
		System.out.println("The account you wish to open is: "+type);
		System.out.println("Your new balance is: "+balance);
		System.out.println("Your unique accounts # is:"+account);
		System.out.println("# of transactions:"+transactions);
		}
		
	}
	public String verify() {
		String response;
		System.out.print("Is this info correct?(Y/N)");
		response=s.nextLine();
		return response;
	}
	public void deposit() {
//3 - Deposit more amount in balance of any depositor		
		System.out.println("How much do you wish to deposit:");
    	int amount=s.nextInt();
    	balance=balance+amount;
    	transactions++;
	}
	public void withdraw() {
//4 - Withdraw some amount from balance deposited	
		System.out.println("How much do you wish to deposit:");
		int amount=s.nextInt();
		balance=balance-amount;
		transactions++;
	}
	public void change() {
//5 - Change address of depositor
		System.out.println("You wish to change your address. Please enter your address again: ");
		address=s.nextLine();
		display();
	}
}

public class BankAccount {
	public static void main(String[] args){
/*After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of depositors are to be entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final informaion of that depositor
4 - Remove some amount from the account of any depositor and then display final informaion of that depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total number of transactions.		
*/		
	String name,address, type;
	Scanner s=new Scanner(System.in);
	System.out.print("Please Enter # of accounts you wish to create: ");
	int num=s.nextInt(); //# of account # or depositers
	
	for(int i=0;i<num;i++) {
	    System.out.println("What is your full Name? ");
	    System.out.println("Please Enter your Full Name: ");
	    name=s.nextLine();
	    
	    System.out.print("Please Enter your address: ");
	    address=s.nextLine();
	    System.out.print("Please Enter your type(checking/savings): ");
	    type=s.nextLine();
	    
	    Bankaccount bank=new Bankaccount(name, address, type, i);
        bank.display();  //display account info
        
        System.out.print("Please Enter amount of # of transactions you wish to make: ");
	    int number=s.nextInt(); //this is the # of transactions
	    if(number>1) {
	    for(int j=0;j<number;j++){
	    	bank.deposit();
	    		}	    
	    	}
	    	else {
	    			System.out.print("How many withdrawls do you wish to make ");
	    			int withdrawls=s.nextInt(); //# of withdrawals
	    			if(withdrawls>1) {
	    					for(int j=0;j<number;j++){
	    							bank.withdraw();
	    											}
	    				}
	    		else {
	    				bank.display();
	    			 }
   
	    		}
	}
	
}
}
