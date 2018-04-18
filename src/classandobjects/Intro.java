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
class Person{
    //These are instance variables
    String name;
    int age;
    
    void speak() {    //a method
        System.out.println("Hello, my name is:"+ name+"and I am "+age);
    }
    
    void sayHello(){   //can have as many as you want
        System.out.println("Hello, my name is blah blah blah");
    }
}

public class Intro {
        public static void main(String[] args){
        Person person1=new Person();
        person1.name="Jeff";
        person1.age=37;
        person1.speak();
        
        Person person2=new Person();
        person2.name="Bob";
        person2.age=27;
        person2.speak();
        
        System.out.println(person1.name);
        //System.out.println(person2.name);
        
        
        
    }
}
