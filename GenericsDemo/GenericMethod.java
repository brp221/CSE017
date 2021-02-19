public class GenericMethod { 
  public static void main(String[] args) { 
    Integer[] integers = {1, 2, 3, 4, 5}; 
    //GenericMethodDemo.<Integer>print(integers); 
    GenericMethod.print(integers);
  } 
  // This is generic because of the <E> generic type in its
  // declaration.  Putting <E> before the return type
  // parameterizes the type of the array’s elements.
  public static <E> void print(E[] list) { 
    for (int i=0; i < list.length; i++){ 
      System.out.print(list[i] + " "); 
    }
    System.out.println(); 
  } 
  
} 