/**
 *  CSE017 Fall 2019
 *  @ Bratislav Petkovic 
 *  Homework #5
 *  Program : Resizable 
 */ 

 /**
  * class Circle whihc implements the inference "GeometricObject"
  */
class Circle implements GeometricObject{
    double radius = 1.0 ;
    /**
     * 1-arg constructor
     * @param radius
     */
    Circle(double radius){
        this.radius = radius;
    }

    /**
     * @return double val of the shapes's perimeter or circumeference
     */
    @Override
    public double getPerimeter() {
        return Math.PI * 2 *radius;
    }
    /**
     * @return double val of the shapes's area
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}