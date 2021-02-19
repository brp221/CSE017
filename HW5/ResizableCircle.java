/**
 *  CSE017 Fall 2019
 *  @ Bratislav Petkovic 
 *  Homework #5
 *  Program : Resizable 
 */ 

 /**
  * ResizableCircle extends parent class Circle 
  * and implements interface Resizable
  */
class ResizableCircle extends Circle implements Resizable{
    
    /**
     * 1-arg constructor which calls the super class
     * @param radius
     */
    public ResizableCircle(double radius){
    super(radius);
    }

    /**
      * @return resized radius
      * @param percent of the radius to be returned
      * implemented from Resizable
      */
    public double resize(int percent){
        return this.radius * percent * 0.01 ;
    }
}