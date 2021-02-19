/**
 *  CSE017 Fall 2019
 *  @ Bratislav Petkovic 
 *  Homework #5
 *  Program : TestCircle 
 */ 

 /**
  * Test class of Circle and its interface ; GeometricShape
  */
 public class TestCircle{
    public static void main(String[] args){ 
      //example of an upcast
      GeometricObject c1 = new Circle(5.0);
      Circle c2 = new Circle(10.0);
      GeometricObject c3 = new ResizableCircle(20);
      ResizableCircle c4 = new ResizableCircle(12);
      //the following three will not compile because resize()
      //isn't found in GeometricObject nor in Circle
      //c1.resize(200);
      //c2.resize(200);
      //c3.resize(200);
      System.out.println("");
      //doesn't compile bc GeomObject doesnt have radius data field
      //System.out.println("Radius of c1: " + c1.radius);
      System.out.println("Area of c1: " +c1.getArea());
      System.out.println("Circumferance of c1: " + c1.getPerimeter());
      System.out.println("");
      //.radius does compile bc Circle has radius data field
      System.out.println("Radius of c2: " + c2.radius);
      System.out.println("Area of c2: " +c2.getArea());
      System.out.println("Circumferance of c2: " +c2.getPerimeter());
      System.out.println("");
      //won't compile; GeometricObject doesnt have radius data field
      //System.out.println("Radius of c3: " + c3.radius);
      System.out.println("Area of c3: " +c3.getArea());
      System.out.println("Circumferance of c3: " +c3.getPerimeter());
      System.out.println("");
      System.out.println("Radius of c4: " + c4.radius);
      System.out.println("Area of c4: " +c4.getArea());
      System.out.println("Circumferance of c4: " +c4.getPerimeter());
      System.out.println("");
    

    }
 }