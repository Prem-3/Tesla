package com.springboot.workers.jdbcexample.model;



public class Worker{
private int workerId;
private String firstName;
private String lastName;
private String dept;
private Double salary;
private String email;

public Worker() {
super();
}



public Worker(int workerId, String firstName, String lastName, String dept, Double salary,String email) {
super();
this.workerId = workerId;
this.firstName = firstName;
this.lastName = lastName;
this.dept = dept;
this.salary = salary;
this.email = email;
}



public Worker(int workerId, String firstName, String dept, Double salary, String email) {
super();
this.workerId = workerId;
this.firstName = firstName;
this.dept = dept;
this.salary = salary;
this.email = email;
}



public int getWorkerId() {
return workerId;
}



public void setWorkerId(int workerId) {
this.workerId = workerId;
}



public String getFirstName() {
return firstName;
}



public void setFirstName(String firstName) {
this.firstName = firstName;
}



public String getLastName() {
return lastName;
}



public void setLastName(String lastName) {
this.lastName = lastName;
}



public String getDept() {
return dept;
}



public void setDept(String dept) {
this.dept = dept;
}



public Double getSalary() {
return salary;
}



public void setSalary(Double salary) {
this.salary = salary;
}



public String getEmail() {
return email;
}



public void setEmail(String email) {
this.email = email;
}



@Override
public String toString() {
return "Worker [workerId=" + workerId + ", firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept
+ ", salary=" + salary + ", email=" + email + "]";
}
}