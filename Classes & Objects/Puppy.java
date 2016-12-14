public class Puppy {
  int age;
  public Puppy() {
    // default constructor
  }

  public Puppy(String name) {
    // Parameterised constructor
      System.out.println("Dog name is " + name);
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public static void main(String[] args) {
    // Main Here the Final Execution starts for our program
    Puppy myPuppy = new Puppy("Tom");
    myPuppy.setAge(5);
    System.out.println("Age of my dog is "+ myPuppy.getAge());
  }
}
