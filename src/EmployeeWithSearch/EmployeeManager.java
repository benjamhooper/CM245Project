package EmployeeWithSearch;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author zzschmid
 */
public class EmployeeManager {
    public EmployeeManager() {
        list = new ArrayList<Employee>();
        add(new Employee("Icabod","379-3214"));
        add(new Employee("Jayhawk","378-3222"));
        add(new Employee("Wildcat","379-3333"));
    }
    private ArrayList<Employee> list;
    public void add(Employee e) {
        getList().add(e);
    }
    public Employee searchByName(String name) {
        for (Employee emp: list) {
            if (emp.getName().equals(name)) {
                return emp;
            }
        }
        return null;
    }
    public Employee get(int i) {
        return list.get(i);
    }

    /**
     * @return the list
     */
    public ArrayList<Employee> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<Employee> list) {
        this.list = list;
    }
    
    
}
