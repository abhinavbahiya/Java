public class Salary extends Employee {
  private int salary;

  public Salary(String name, String address, int empno, int salary) {
    super(name, address, empno);
    setSalary(salary);
  }

  public void setSalary (int salary) {
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

  public void print() {
    System.out.println(name + " " + address + " " + empno + " " + getSalary());
  }

  public static void main(String[] args) {
    Salary S = new Salary("Abhinav", "Sirsa", 1, 90000);
    // Salary Employee
    S.print();

    Salary E = new Salary("Manasvi", "Rajpura", 2, 40000);
    // Employee Employee
    E.print();
  }
}
