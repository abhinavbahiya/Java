public class SubClass extends SuperClass implements InterfaceExample {
  public void display() {
    System.out.println(number + 2);
  }

  public int give() {
    return number;
  }

  public static void main(String[] args) {
    SubClass sub = new SubClass();
    sub.display();
    // System.out.println(sub instanceof SuperClass);
    // Need clarification regarding instanceof
    System.out.println(sub.give());
  }
}
