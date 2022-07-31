import java.util.ArrayList;
class Wrapper {

  public static void main(String[] args) {  
    char ch = 'a';
    Character c = ch;  // auto-boxing

    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(25);  // auto-boxing

    char ch2 = c; // unboxing
    System.out.println(arrayList.get(0)); // unboxing

    Integer intobj = new Integer(ch); // boxing
    
    System.out.println(c);
  }
}