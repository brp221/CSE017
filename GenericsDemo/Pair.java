public class Pair<T extends Comparable<T>> { 
  //NOTE: Comparable<T> because Comparable is a generic class
  private T first; 
  private T second; 
  public Pair(T first, T second) { 
    this.first = first; 
    this.second = second; 
  } 
  public T max() { 
    if (first.compareTo(second) >= 0) 
      return first; 
    else 
      return second; 
  } 
  public static void main(String[] args) { 
    Pair<String> p =  
      new Pair<String>("Karen","Kate"); 
    System.out.println(p.max());
    // A syntax error will be generated if you  try
    // to use a concrete type that does not
    // descend from Comparable:
    //Pair<Faculty> p2 = 
    //  new Pair<Faculty>(new Faculty(), new Faculty());
  }  
} 