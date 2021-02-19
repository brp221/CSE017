/*
CSE 17 Fall 2019
@author Bratislav Petkovic
IBL7	
Program: Dog 
*/
class Dog extends Animal{
    public void greeting(){
        System.out.println("Woof (NO PARAMETER)");
    }
    public void greeting(Dog another){
        System.out.println("Woof (WITH PARAMETER)");
    }
} 