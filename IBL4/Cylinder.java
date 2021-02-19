/*
CSE017 Fall 2019
@Bratislav Petkovic 
IBL 4
Program: Cylinder
*/

public class Cylinder extends Circle{
    private double height = 1.0;

//constructor
Cylinder(){
}

//constructor
Cylinder(double height){
    this.height = height ;
    
}

//constructor
Cylinder(double height, double radius){
    this.height = height ;
    setRadius(radius);
}

//constructor
Cylinder(double height, double radius,String color){
    this.height = height ;
    setRadius(radius);
    setColor(color);
}

public double getHeight(){
    return this.height;
}
public void setHeight(double height){
    this.height = height;
}
//Describe Itself
public String toString(){
    return "Circle[radius="+ getRadius() + ", height="+height+", color=" + getColor() + "]" ;
}
//return area
public double getVolume(){
    return getArea() * height ;
}
}