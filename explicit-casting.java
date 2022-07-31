class ExplicitCast {
  public static void main(String[] args) {
    int a = 97;

    char ch = (char)a;  // the compiler will give error at compile time we dont explicitely typecast here as int has higher priority over char so compiler doesnt implicitely type cast int to char.

    System.out.println(ch);  // it will print 'a'
  }
}

// How do we know the priority of data types in Java?
// How to control out of range conditions in type casting in Java?

// types in Java are almost similar to C++ except String etc