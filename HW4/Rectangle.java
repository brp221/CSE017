
/*
CSE 17 Fall 2019
@author Bratislav Petkovic
Homework #4  	
Program: Rectangle 
*/

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){}
    /** 
    * @param width
    * @param length 
    */
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    /** 
    * @param width
    * @param length 
    * @param color
    * @param filled
    */
    public Rectangle(double width, double length,String color,boolean filled){
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }
    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }
    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }
    /**
     * @param width
     */
    public void setWidth(double width){
        this.width = width;
    }
    /**
     * @param length
     */
    public void setLength(double length){
        this.length = length;
    }
    /**
     * @return shape's area
     */
    public double getArea(){
        return length *width;
    }
    /**
     * @return perimeter
     */
    public double getPerimeter(){
        return (2*length)+(2*width);
    }
    /**
     * @return rectangle description
     */
    public String toString(){
        return "Rectangle has length " + length + ", width "+ width + " and is " + color;
    }
}