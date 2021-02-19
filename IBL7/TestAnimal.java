/*
CSE 17 Fall 2019
@author Bratislav Petkovic
IBL7	
Program: TestAnimal 
*/
public class TestAnimal{
    public static void main(String[] args){
        //subclass use
        Cat cat1 = new Cat();
        // calls greeting from Cat.java without parameters
        cat1.greeting();
        Dog dog1 = new Dog();
        //calls greeting from Dog.java without parameters
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        //calls greeting from BigDog.java without parameters
        bigDog1.greeting();
        System.out.println("");
        
        //Polymorphism
        Animal animal1 = new Cat();
        //calls greeting from Cat.java bc animal1 is a Cat object   
        animal1.greeting();
        Animal animal2 = new Dog();
        //calls greeting from Dog.java bc animal2 is a Dog object
        animal2.greeting();
        Animal animal3 = new BigDog();
        //calls greeting from BigDog.java bc animal3 is a type object
        animal3.greeting();
        //Animal is abstract and cant be instantiated (Compiler Err)
        //Animal animal4 = new Animal();
        System.out.println("");
        //Downcast
        Dog dog2 = (Dog) animal2 ;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3 ;    
        //Dog can't be cast into Cat nor vice versa
        //Cat cat2 = (Cat) animal2;
        //calls greeting WITH PARAM from Dog.java
        dog2.greeting(dog3);
        //calls greeting W Param from BigDog 
        dog3.greeting(dog2);
        //calls greeting WITH PARAM from Dog.java
        dog2.greeting(bigDog2);
        //calls greeting W Param from BigDog 
        bigDog2.greeting(dog2);
        //calls greeting W Param from BigDog 
        bigDog2.greeting(bigDog1); 
    }
}