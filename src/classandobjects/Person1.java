/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classandobjects;

/**
 *
 * @author Jason
 */
class People{
    //These are instance variables
    String name;
    int age;
    
    void speak() {    //a method    void methods does not return anything
        System.out.println("Hello, my name is:"+ name+"and I am "+age);
    }
    
    int calculateyears(){   //can have as many as you want    int returns int
        int yearsleft=65-age;
        return yearsleft;       
    }
    
    int getage(){
        return age;
    }
    
    String getname(){
        return name;
    }
}

public class Person1 {
        public static void main(String[] args){
        People person1=new People();
        person1.name="Jeff";
        person1.age=37;
        //person1.speak();
        
        int years=person1.calculateyears();
        
        int age=person1.getage();
        String name=person1.getname();
        System.out.println(years+" Years till retirement.");
        System.out.println(name+" "+age);
        
        //System.out.println(person1.name);
        //System.out.println(person2.name);
        
        
        
    }
}