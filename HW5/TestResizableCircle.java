/**
 *  CSE017 Fall 2019
 *  @ Bratislav Petkovic 
 *  Homework #5
 *  Program : TestResizableCircle 
 */ 

  
 /**
  * Test class of ResizableCircle, its superclass Circle and 
  * its interface ; GeometricShape
  */
 public class TestResizableCircle{
     public static void main(String[] args){
        Resizable rc1 = new ResizableCircle(5.0);
        ResizableCircle rc2 = new ResizableCircle(10.0);
        Circle rc3 = new ResizableCircle(20);
        GeometricObject rc4 = new ResizableCircle(10.0);
        System.out.println("");
        //rc1.radius won't compile because radius isn't found in
        //Resizable class yet rc1 is of Resizable reference
        //System.out.println("Old rc1 radius:" + rc1.radius);
        System.out.println("Initial rc1 radius: 5.0");
        System.out.println("Resized rc1 radius: " +rc1.resize(150));
        System.out.println("");
        //note: resize doesn't change the radius it just return a 
        //channged value based off of the radius
        System.out.println("Initial rc2 radius: " + rc2.radius);
        System.out.println("Resized rc2 radius: " +rc2.resize(150));
        System.out.println("Area of rc2: " +rc2.getArea());
        System.out.println("Circumferance of rc2: " +rc2.getPerimeter());
        System.out.println("");
        System.out.println("Inital rc3 radius: " + rc3.radius);
        //rc3.resize(150) will not compile because Circle does not
        //possess such a method yet rc3 is of Circle reference
        //System.out.println("New rc3 radius: " +rc3.resize(150));
        System.out.println("Area of rc3: " +rc3.getArea());
        System.out.println("Circumferance of rc3: " +rc3.getPerimeter());
        System.out.println("");
        //rc1.radius won't compile because radius isn't found in
        //Resizable class yet rc1 is of Resizable reference
        //System.out.println("Old rc1 radius:" + rc1.radius);
        System.out.println("Initial rc4 radius: 10.0");
        //doesnt compile; GeometricObject dosesn't have resize()
        //System.out.println("Resized rc4 radius: " + rc4.resize(123));
        System.out.println("Area of rc4: " +rc4.getArea());
        System.out.println("Circumferance of rc4: " +rc4.getPerimeter());
        System.out.println("");

        
     }
 }