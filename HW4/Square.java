
/*
CSE 17 Fall 2019
@author Bratislav Petkovic
Homework #4  	
Program: Square 
*/

public class Square extends Rectangle{
    double side ;
    public Square(){}
    /**
     * @param side
     */
    public Square(double side){
        super(side,side);
    }
    /**
     * @param side
     * @param filled
     * @param color
     */
    public Square(double side, boolean filled, String color){
        super(side,side,color,filled);
    }
    /**
     * @return side
     */
    public double getSide(){
        return super.getLength();
    }
    /**
     * @param side
     */
    public void setSide(double side){
        super.setLength(side);;
    }
    /**
     * @return length
     */
    public double getLength() {
        return super.getLength();
    }
    /**
     * @return the width
     */
    public double getWidth() {
        return super.getWidth();
    }
    /**
     * @param width
     */
    public void setWidth(double width){
        super.setWidth(width);;
    }
    /**
     * @param length
     */
    public void setLength(double length){
        super.setLength(length);
    }
    /**
     * @return square area
     */
    public double getArea(){
        return Math.pow(getSide(), 2);
    }
    /**
     * @return shape perimeter
     */
    public double getPerimeter(){
        return (4 * getSide());
    }
    /**
     * @return description of square
     */
    public String toString(){
        return "Square has side length " + getSide() + " and is " + color;
    }


}