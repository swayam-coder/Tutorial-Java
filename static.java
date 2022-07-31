class Main {
  static int val = 0; 
  
  static {
    System.out.println("Static method called");
  }
  
  static int method() {
    return 10;
  }
  
  public static void main(String[] args) { // without this the program doesnt run
    System.out.println("Hello world!");
    System.out.println(Main.method());  // accessing static method with class name
  }
}

// what is a public class?