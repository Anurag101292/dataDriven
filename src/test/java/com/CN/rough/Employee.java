package com.CN.rough;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    private int id;
    private String name;
    private int age;
    private long salary;

    // Many sort sequences can be created with different names.
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
    public static Comparator<Employee> idComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Integer.valueOf(e1.getId()).compareTo(Integer.valueOf(e2.getId()));
        }
    };

    public Employee() { }
    public Employee(int id, String name, int age, long salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    // setters and getters.

    // Only one sort sequence can be created with in the class.
    @Override
    public int compareTo(Employee e) {
        //return Integer.valueOf(this.id).compareTo(Integer.valueOf(e.id));
        //return Character.toString(this.name.charAt(0)).compareToIgnoreCase(Character.toString(e.name.charAt(0)));
        if (this.id > e.id) {
            return 1;
        }else if(this.id < e.id){
            return -1;
        }else {
            return Character.toString(this.name.charAt(0)).compareToIgnoreCase(Character.toString(e.name.charAt(0)));
        }

    }

    public static void main(String[] args) {

        Employee e1 = new Employee(5, "Yash", 22, 1000);
        Employee e2 = new Employee(8, "Tharun", 24, 25000);

        List<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        Collections.sort(list); // call @compareTo(o1)
        Collections.sort(list, Employee.NameComparator); // call @compare (o1,o2)
        Collections.sort(list, Employee.idComparator); // call @compare (o1,o2)
    }
}
   // For customized sorting we go for comparator @compare(o1, o2) for other scenarios we go for comparable @compareTo(o1), with out changing code if we want to sort more than one field then we use comparator.