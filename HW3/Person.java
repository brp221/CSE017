/*
CSE 17 Fall 2019
@author (Your name)
Homework #3  	
Program: Person 
*/

public class Person extends Object{
    private String name ;
    private String address;
    
    // Constructor
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    //returns name
    public String getName(){
        return this.name ;
    }
    //returns address
    public String getAddress(){
        return this.address;
    }
    //sets name
    public void setName(String name){
        this.name = name ;
    }
    //sets address
    public void setAddress(String addy){
        this.address = addy;
    }
    //returns a string with the name and address
    public String toString(){
        return (this.name + "(" + this.address + ")");
    }
}
