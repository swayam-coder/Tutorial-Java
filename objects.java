class ObjectInit {
  ObjectInit() {
    System.out.println("constructor");
    val = val + 1;
  }
  
  int val = staticMethod();

  static int staticMethod() {
    System.out.println("static method");
    return 10;
  }

  static {
    ObjectInit obj = new ObjectInit();
  }
  
  static {
    System.out.println("static block");
  }

  public static void main(String[] args) {
    ObjectInit obj = new ObjectInit();
    System.out.println(obj.val);
    System.out.println(obj);  // will print address
  }
}

// static members are executed before main function here.
// static blocks are executed before static methods
// static members cant access this and super
// static block runs only once i.e. when the first time class is initialised