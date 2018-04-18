
public class Inheritance {
	public static void main(String[] args){
		tuna tuna=new tuna();
		potpie potpie=new potpie();
		veggie veggie=new veggie();
		tuna.eat();
	    potpie.eat();
		veggie.eat();
	}
}

class potpie extends food{                   //this is the syntax to make a subclass, potpie becomes subclass and food is superclass
	//public void eat() {                    //say we have more than 1 class with same method
	//	System.out.print("eat method");      //that does the same thing
	//}                                      //we can maintain it in one class thru inheritance
}

class tuna extends food{                //tuna will now inherit all methods and vars from food  
	//public void eat() {               
	//	System.out.print("eat method");
	//}
	
	public void eat() {                           //if you want to make changes to a inherited method,
		System.out.println("new eat method");     // you can override by just copying the superclassmethod and make changes
	}
	
	
}

class food{                  //by making food the super class, the sub-calsses
	                         //of potpie and tuna will inherit all var or methods, 
	public void eat() {      //Remember only public methods and vars can be inherited, if its private then it will not
		System.out.println("eat method");         //so now, both tuna and potpie classes both have the eat() method
	}
	
}

class veggie extends tuna{       //say we have a class that inherits from another subclass, so it becomes a sub-sub class
	                              //then veggies would inherit from tuna and tuna's superclass if it has one
	
}