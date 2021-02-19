
/*
CSE 17 Fall 2019
@author Bratislav Petkovic
Homework #4  	
Program: Circle 
*/

public class Circle extends Shape{
    protected double radius;

    public Circle(){
    }
    /** 
    * @param radius 
    */
    public Circle(double radius){
        this.radius = radius;
    }
    /** 
    * @param color
    * @param radius
    * @param filled
    */
    public Circle(double radius,String color,boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    /** 
    * @return radius 
    */
    public double getRadius(){
        return this.radius;
    }
    /** 
    * @param radius 
    */
    public void setRadius(double radius){
        this.radius = radius;
    }
    /** 
    * @return shape's area 
    */
    public double getArea(){
        return Math.PI * Math.pow(radius,2) ;
    }
    /** 
    * @return perimeter of shape 
    */
    public double getPerimeter(){
        return Math.PI * 2 *radius ;
    }
    /** 
    * @return string description of shape
    */
    public String toString(){
        return "Circle has radius "+ radius+ " and is " + color ;
    }
}