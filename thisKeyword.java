class ThisKeyword {
  int x;

  ThisKeyword(int a) {
    this.x = a;
    System.out.println(x);
    System.out.println(this.x);
    System.out.println(this);  // will print the address of object
  } 

  public static void main(String[] args) {
    new ThisKeyword(10);
  }
}

// Can a .java file have more than one class?