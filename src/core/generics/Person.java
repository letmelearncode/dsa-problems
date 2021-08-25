package core.generics;

import java.math.BigDecimal;

public class Person {

  private int age;
  private String name;
  private BigDecimal salary;

  public Person(int age, String name, BigDecimal salary) {
    this.age = age;
    this.name = name;
    this.salary = salary;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Person{" +
        "age=" + age +
        ", name='" + name + '\'' +
        ", salary=" + salary +
        '}';
  }
}

