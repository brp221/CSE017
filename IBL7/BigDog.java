/*
CSE 17 Fall 2019
@author Bratislav Petkovic
IBL7	
Program: BigDog 
*/
class BigDog extends Dog{
    public void greeting(){
        System.out.println("Loud Woof (NO PARAMETER)");
    }
    public void greeting(Dog another){
        System.out.println("Loud Woof (WITH PARAMETER)");
    }
} 