package org.collections;

public class Employee {
    private int id = 0;
    private String firstName;
    private String lastName;
    private Integer dept;
    private double payRate;

    public int getId() {  return id;  }

    public String getFirstName() { return firstName; }

    public void setFirstName(String fn) {
      firstName = fn;
    }

    public String getLastName() { return lastName; }

    public void setLastName(String ln) {
      lastName = ln;
    }

    public Integer getDept() { return dept; }

    public void setDept(Integer dp) {
      dept = dp;
    }


    public double getPayRate() { return payRate; }

    public void setPayRate(double pay) {
      payRate = pay;
    }

    public String getFullName() {
      return firstName + " " + lastName;
    }

    public String getPayInfo() {
      return "Employee " + id + " dept " + dept + " " +
             getFullName() + " paid " + payRate;
    }

  }