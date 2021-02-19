/**
 * CSE017 Fall 2019
 * @Bratislav Petkovic
 * Homework #5
 * Program: GeometricObjects 
 */

 /**
  * interface of a general geometric shape
  */
public interface GeometricObject{
    /**
     * @return double val of the shapes's perimeter or circumeference
     */
    double getPerimeter();
    /**
     * @return double val of the shapes's area
     */
    double getArea();
}