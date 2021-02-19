
/*
CSE 17 Fall 2019
@author Bratislav Petkovic
Homework #4  	
Program: TestShapes 
*/

public class TestShapes{

    public static void main(String[] args){
        System.out.println("");

        Shape s1 = new Circle(5.5,"RED",false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());
        //Shape doesnt have the method getRadius
        //s1 declared as Circle but actual class is Shape
        System.out.println("");

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        System.out.println("");

        Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0,2.0,"RED",false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());
        //Shape does not contain the getLength() method
        //s3 declared as Rectangle but actual class is Shape
        System.out.println("");

        Rectangle r1 = new Rectangle(1.0,2.0,"RED",false);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        System.out.println("");

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());
        //Shape doesn't contain getSide()
        //s4 declared as Square but actual class is Shape
        System.out.println("");

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());
        //Rectangle doesnt have the getSide method
        //Only Circle has getSide method and r2 is a Rectangle 
        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());
        System.out.println("");

        Square sq1 = (Square) r2 ;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
        System.out.println("");
    }


}