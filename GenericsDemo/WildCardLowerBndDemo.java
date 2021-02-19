import java.util.ArrayList;

public class WildcardLowerBndDemo{
  public static void main(String[] args){
    ArrayList<String> myStrings = new ArrayList<String>(); 
    //method1(myStrings); 
    
    
    method2(myStrings); 
    ArrayList<Car> myCars = new ArrayList<Car>();
    method3(myCars);
    method4(myCars);
    
//    ArrayList<Bike> myBikes = new ArrayList<>();
//    method3(myBikes);
  }
  
  public static void method1(ArrayList<Object> a) {
  } 
  
  public static void method2(ArrayList<?> a) {
  } 
  
  
  public static void method3(ArrayList<? extends Vehicle> a) { 
    
  } 
  
  public static void method4(ArrayList<? super Car> a) { 
    Car c = new Car();  
    a.add(c);  
  } 
  
  
}