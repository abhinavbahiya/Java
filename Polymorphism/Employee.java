public class Employee {
  String name;
  String address;
  int empno;

  public Employee(String name, String address, int empno) {
      this.name = name;
      this.address = address;
      this.empno = empno;
  }

  public void print() {
    System.out.println(name + " " + address + " " + empno);
  }

}
