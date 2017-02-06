/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplestages;

import java.util.ArrayList;

/**
 *
 * @author Cecil Schmidt
 */
public class Employee {
    private String name;
    private int age;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Employee() {}
    public String getName() { return name; }
    public int getAge() { return age; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public boolean equals(Object o) {
        if (o instanceof Employee) {
            Employee e = (Employee) o;
            return e.getName().equals(this.getName());
        }
        return false;
    }
}
class EmployeeManager {
    private ArrayList<Employee> list = new ArrayList<Employee>();
    public void load() {
        list.add(new Employee("George", 20));
        list.add(new Employee("Wesley", 19));
        list.add(new Employee("Sandra", 21));
    }
    public void add(Employee emp) {
        list.add(emp);
    }
    public ArrayList<Employee> getEmployees() {
        return list;
    }
    public Employee get(int k) {
        if (k < list.size())
            return list.get(k);
        else 
            return list.get(list.size() - 1);
    }
    public int size() {
        return list.size();
    }
}