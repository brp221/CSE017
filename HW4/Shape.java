
/*
CSE 17 Fall 2019
@author Bratislav Petkovic
Homework #4  	
Program: Shape 
*/

public class Shape{
    protected String color ;
    protected boolean filled;

    public Shape(){}
    /** 
    * @param color
    * @param filled
    */
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @return boolean is shape filled 
     */
    public boolean isFilled(){
        return filled;
    }
    /** 
    * @param color 
    */
    public void setColor(String color){
        this.color = color;
    }
    /** 
    * @param filled 
    */
    public void setFilled(boolean filled){
        this.filled = filled ;
    }
    /** 
    * @return area of shape 
    */
    public double getArea(){
        return 0;
    }
    /** 
    * @return perimeter of shape 
    */
    public double getPerimeter(){
        return 0;
    }
    /** 
    * @return string of shape description  
    */
    public String toString(){
        return "";
    }
}