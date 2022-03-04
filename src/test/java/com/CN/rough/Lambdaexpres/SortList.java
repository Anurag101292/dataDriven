package com.CN.rough.Lambdaexpres;

import org.apache.velocity.test.provider.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    static class Person{
        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return Lastname;
        }

        public void setLastname(String lastname) {
            Lastname = lastname;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        String firstname;
        String Lastname;
        int salary;
        Person(String firstname,String Lastname,int salary){
            this.firstname=firstname;
            this.Lastname=Lastname;
            this.salary=salary;
        }
    }
    public static void main(String[] args) {


        List<Person> personlist = new ArrayList<>();
        personlist.add(new Person("Anurag","Upadhyay",10000));
        personlist.add(new Person("Virat", "Kohli",100000));
        personlist.add(new Person("Arun", "Kumar",20000));
        personlist.add(new Person("Rajesh", "Mohan",30000));
        personlist.add(new Person("Rahul", "Dravid",40000));


//        personlist.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.firstname.compareTo(o2.firstname);
//            }
//        });
//       Collections.sort(personlist,(p1,p2)->p1.firstname.compareTo(p2.firstname));
//    Collections.sort(personlist,(p1,p2)->Integer.valueOf(p1.getSalary()).compareTo(Integer.valueOf(p1.getSalary())));
    //    Collections.sort(personlist,Person p1);
        //Comparator<Person> idComparator = new Comparator<Person>() {
         //   @Override
         //   public int compare(Person e1, Person e2) {
         //       return Integer.valueOf(e1.getSalary()).compareTo(Integer.valueOf(e2.getSalary()));
         //   }
        //};
//java 8 way
        Collections.sort(personlist,(e1,e2)->Integer.valueOf(e1.getSalary()).compareTo(Integer.valueOf(e2.getSalary())));
        for( Person p: personlist){
            System.out.println(p.salary);
        }

    }
   // https://stackoverflow.com/questions/2266827/when-to-use-comparable-and-comparator#:~:text=Comparable%20should%20be%20used%20when,For%20example%2C%20String%20implements%20Comparable.

}
